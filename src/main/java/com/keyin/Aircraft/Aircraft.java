package com.keyin.Aircraft;

public class Aircraft {
    private long Aircraftid;
    private String AircraftType;
    private String AirlineName;
    private int NumOfPassengers;

    public Aircraft(long Aircraftid, String AircraftType, String AirlineName, int NumOfPassengers){
        this.Aircraftid = Aircraftid;
        this.AircraftType = AircraftType;
        this.AirlineName = AirlineName;
        this.NumOfPassengers = NumOfPassengers;
    }

    public long getAircraftId(){
        return Aircraftid;
    }

    public void setAircraftId() {
        this.Aircraftid = Aircraftid;
    }

    public String getAircraftType() {
        return AircraftType;
    }

    public void setAircraftType() {
        this.AircraftType = AircraftType;
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName() {
        this.AirlineName = AirlineName;
    }

    public int getNumOfPassengers() {
        return NumOfPassengers;
    }

    public void setNumOfPassengers() {
        this.NumOfPassengers = NumOfPassengers;
    }
}
