package taller2.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final WebClient webClient;

    public PokemonService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<PokemonResponse> getPokemon(String name) {
        return webClient.get()
                .uri("/pokemon/{name}", name.toLowerCase())
                .retrieve()
                .bodyToMono(PokeApiResponse.class)
                .map(p -> new PokemonResponse(
                        p.getName(),
                        p.getWeight(),
                        p.getAbilities().stream()
                                .map(a -> a.getAbility().getName())
                                .collect(Collectors.toList())
                ));
    }
}