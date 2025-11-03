package taller2.demo;

import java.util.List;

public class PokemonResponse {
    private String name;
    private int weight;
    private List<String> abilities;

    public PokemonResponse(String name, int weight, List<String> abilities) {
        this.name = name;
        this.weight = weight;
        this.abilities = abilities;
    }

    // Getters y setters
    public String getName() { return name; }
    public int getWeight() { return weight; }
    public List<String> getAbilities() { return abilities; }
}