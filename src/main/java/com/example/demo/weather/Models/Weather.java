package com.example.demo.weather.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private Long id;
    private String main;

    public Weather(){};

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getMain(){
        return main;
    }
    public void setMain(String main){
        this.main = main;
    }
}
