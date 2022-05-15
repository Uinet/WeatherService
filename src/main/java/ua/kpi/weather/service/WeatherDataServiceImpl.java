package ua.kpi.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.weather.model.WeatherData;
import ua.kpi.weather.repository.WeatherDataRepository;

import java.util.List;

@Service
public class WeatherDataServiceImpl implements WeatherDataService{

    @Autowired
    WeatherDataRepository weatherDataRepository;

    @Override
    public WeatherData save(WeatherData weatherData){
        return weatherDataRepository.save(weatherData);
    }

    @Override
    public List<WeatherData> getAllWeatherData(){
        return weatherDataRepository.findAll();
    }
}
