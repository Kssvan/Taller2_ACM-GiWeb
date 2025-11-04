package taller2.demo.weather;

import java.util.List;

public class WeatherApiResponse {
    private List<Weather> weather;
    private Main main;
    private String name;

    public static class Weather {
        private String description;

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }

    public static class Main {
        private double temp;

        public double getTemp() { return temp; }
        public void setTemp(double temp) { this.temp = temp; }
    }

    public List<Weather> getWeather() { return weather; }
    public void setWeather(List<Weather> weather) { this.weather = weather; }

    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
