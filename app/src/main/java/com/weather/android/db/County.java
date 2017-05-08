package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ryuzu on 2017/5/8.
 */

public class County extends DataSupport{
    private int id;            //县城ID
    private String countyName; //县城名字
    private String weatherId;  //天气ID
    private int cityId;        //所属市的ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
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
