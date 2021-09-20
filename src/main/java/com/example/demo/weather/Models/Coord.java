package com.example.demo.weather.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {
    private Long lat;
    private Long lon;

    public Coord(){

    }
    public Long getLat(){
        return lat;
    }
    public void setLat(Long lat){
        this.lat = lat;
    }
    public Long getLon(){
        return lon;
    }
    public void setLon(Long lon){
        this.lon = lon;
    }
}
