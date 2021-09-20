package com.example.demo.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.weather.Models.WeatherResponse;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class WeatherController {
    private String apiKey = "KEY HERE";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path= "/weather/{lat}/{lon}")
    public WeatherResponse getWeather(@PathVariable String lat, @PathVariable String lon){

        WeatherResponse weatherResponse = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+apiKey,WeatherResponse.class);
        return weatherResponse;
    }
    
    
}
