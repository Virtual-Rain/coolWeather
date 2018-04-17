package com.example.zx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zx on 2018/4/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
