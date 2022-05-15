package ua.kpi.weather.repository;

import ua.kpi.weather.model.WeatherData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherDataRepository extends MongoRepository<WeatherData, String> {
}
