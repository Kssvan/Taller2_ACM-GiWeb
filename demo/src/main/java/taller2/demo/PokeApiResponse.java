package taller2.demo;

import java.util.List;

public class PokeApiResponse {
    private String name;
    private int id;
    private int weight;
    private int height;
    private List<AbilityWrapper> abilities;

    public static class AbilityWrapper {
        private Ability ability;
        public Ability getAbility() { return ability; }
        public void setAbility(Ability ability) { this.ability = ability; }
    }

    public static class Ability {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    // Getters y setters
    public String getName() { return name; }
    public int getId() { return id; }
    public int getWeight() { return weight; }
    public int getHeight() { return height; }
    public List<AbilityWrapper> getAbilities() { return abilities; }
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setHeight(int height) { this.height = height; }
    public void setAbilities(List<AbilityWrapper> abilities) { this.abilities = abilities; }
}