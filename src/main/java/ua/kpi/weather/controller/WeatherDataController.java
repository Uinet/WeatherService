package ua.kpi.weather.controller;

import lombok.extern.slf4j.Slf4j;
import ua.kpi.weather.model.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.weather.service.WeatherDataService;

import java.util.List;

@RestController
@Slf4j
public class WeatherDataController {

    @Autowired
    WeatherDataService weatherDataService;

    @GetMapping("/weather")
    public List<WeatherData> getAllWeatherData(){
        return weatherDataService.getAllWeatherData();
    }

    @PostMapping("/weather")
    public WeatherData saveWeather(@RequestBody WeatherData weatherData){
        System.out.println(weatherData.getHumidity());
        return weatherDataService.save(weatherData);
    }
}
