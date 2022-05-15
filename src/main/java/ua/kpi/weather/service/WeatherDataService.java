package ua.kpi.weather.service;

import ua.kpi.weather.model.WeatherData;

import java.util.List;

public interface WeatherDataService {
    WeatherData save(WeatherData weatherData);
    List<WeatherData> getAllWeatherData();
}
