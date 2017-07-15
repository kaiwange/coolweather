package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wangkai on 17/7/15.
 */

public class County extends DataSupport {

    private int id;
    private String conuntyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConuntyName() {
        return conuntyName;
    }

    public void setConuntyName(String conuntyName) {
        this.conuntyName = conuntyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
