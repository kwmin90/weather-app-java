package com.example.demo.weather.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Long id;
    private Coord coord;
    private Weather[] weather;
    private Main main;
    private String name;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Coord getCoord(){
        return coord;
    }
    public void setCoord(Coord coord){
        this.coord = coord;
    }
    public Weather[] getWeather(){
        return weather;
    }
    public void setWeather(Weather[] weather){
        this.weather = weather;
    }
    public Main getMain(){
        return main;
    }
    public void setMain(Main main){
        this.main = main;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
