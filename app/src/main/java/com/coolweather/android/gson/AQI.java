package com.coolweather.android.gson;

/**
 * Created by wangkai on 17/7/15.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
