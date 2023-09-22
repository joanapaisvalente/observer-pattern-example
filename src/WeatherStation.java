public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        Subject.HeatIndexDisplay heatIndexDisplay =
                new Subject.HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(55, 34, 1010);
        weatherData.setMeasurements(77, 10, 1015);
    }
}
