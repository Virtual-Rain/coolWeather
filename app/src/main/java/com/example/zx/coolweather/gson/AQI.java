package com.example.zx.coolweather.gson;

/**
 * Created by zx on 2018/4/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
