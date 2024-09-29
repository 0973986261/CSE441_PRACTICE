package com.androidcodefinder.prac03;

public class country {
    private int flag;
    private String countryName;
    private String capitalName;
    private String Population;
    private String Area;
    private String Density;
    private String worldShare;

    public country(int flag , String countryName, String capitalName, String Population, String Area, String Density, String worldShare){
        this.flag = flag;
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.Population = Population;
        this.Area = Area;
        this.Density = Density;
        this.worldShare = worldShare;

    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public void setArea(String area) {
        Area = area;
    }

    public void setDensity(String density) {
        Density = density;
    }

    public void setWorldShare(String worldShare) {
        this.worldShare = worldShare;
    }

    public int getFlag() {
        return flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String getPopulation() {
        return Population;
    }

    public String getArea() {
        return Area;
    }

    public String getDensity() {
        return Density;
    }

    public String getWorldShare() {
        return worldShare;
    }
}


