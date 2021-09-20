package com.example.demo.weather.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private Long temp;
    
    public Main (){

    }
    public Long getTemp(){
        return temp;
    }
    public void setTemp(Long temp){
        this.temp=temp;
    }
}
