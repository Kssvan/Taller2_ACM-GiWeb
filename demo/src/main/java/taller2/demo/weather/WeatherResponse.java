package taller2.demo.weather;

public class WeatherResponse {
    private String city;
    private double temperature;
    private String description;

    public WeatherResponse(String city, double temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }


    // Getters
    public String getCity() { return city; }
    public double getTemperature() { return temperature; }
    public String getDescription() { return description; }
}
