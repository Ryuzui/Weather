package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    /*
    对Basic,aqi,now,suggestion引用
     */
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;


    /*
    daily_forecast中包含数组，通过list引用forecast
     */
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}