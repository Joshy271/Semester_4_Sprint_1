package com.keyin.Aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.keyin.Main;

@Service
public class AircraftService {

    public static List<Aircraft> getAllAircrafts(){
        return Main.aircrafts;
    }

    public static List<Aircraft> findAircraftByPrams(AircraftSearchPrams aircraftSearchPrams) {
        List<Aircraft> searchResults = new ArrayList<Aircraft>();

        for (Aircraft aircraft : Main.aircrafts) {
            if (aircraft.getAircraftType().equalsIgnoreCase(aircraftSearchPrams.getAircraftType())){
                searchResults.add(aircraft);
            }
        }
        return searchResults;
    }
    public Aircraft createAircraft(Aircraft aircraft){
        Main.aircrafts.add(aircraft);

        return aircraft;
    }
}
