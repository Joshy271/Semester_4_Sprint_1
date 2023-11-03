package com.keyin.Airports;

import org.aspectj.apache.bcel.classfile.Code;

public class Airport {
    private long AirportId;
    private String AirportName;
    private String code;

    public Airport(long id, String AirportName, String code){
        this.AirportId = id;
        this.AirportName = AirportName;
        this.code = code;
        ;
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
