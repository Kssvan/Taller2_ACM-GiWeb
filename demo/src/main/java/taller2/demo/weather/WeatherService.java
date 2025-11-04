package taller2.demo.weather;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;
    private final String apiKey = "04e211ff1a57a824637772b5ce6b7800"; // Tu API KEY

    public WeatherService() {
        this.webClient = WebClient.create("https://api.openweathermap.org/data/2.5");
    }

    public Mono<WeatherResponse> getWeather(String city) {
        String uri = String.format(
                "/weather?q=%s&appid=%s&units=metric&lang=es",
                city, apiKey
        );

        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(WeatherApiResponse.class)
                .map(apiResponse -> {
                    double temp = apiResponse.getMain().getTemp();
                    String desc = apiResponse.getWeather().get(0).getDescription();
                    String cityName = apiResponse.getName();
                    return new WeatherResponse(cityName, temp, desc);
                });
    }
}
