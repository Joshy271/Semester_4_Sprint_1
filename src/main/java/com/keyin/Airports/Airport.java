package com.keyin.Airports;

import java.util.List;

public class Airport {
    private int AirportId;
    private String AirportName;
    private String code;


    public Airport(int Airportid, String AirportName, String code){
        this.AirportId = Airportid;
        this.AirportName = AirportName;
        this.code = code;
    }

    public long getAirportId(){
        return AirportId;
    }

    public void setAirportId() {
        this.AirportId = AirportId;
    }

    public String getAirportName() {
        return AirportName;
    }

    public void setAirportName() {
        this.AirportName = AirportName;
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }
}
