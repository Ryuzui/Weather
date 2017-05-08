package com.weather.android.db;


import org.litepal.crud.DataSupport;

public class Province extends DataSupport{
    private int id;//省的ID
    private String provinceName;//省的名字
    private int provinceCode;//代号
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id ;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
