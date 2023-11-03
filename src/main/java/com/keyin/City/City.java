package com.keyin.City;

public class City {
    private long Cityid;
    private String name;
    private String state;
    private int population;

    public City(long id, String name, String state, int population){
        this.Cityid = id;
        this.name = name;
        this.state = state;
        this.population = population;
    }

    public long getId(){
        return Cityid;
    }

    public void setId() {
        this.Cityid = Cityid;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState() {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation() {
        this.population = population;
    }
}
