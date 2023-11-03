package com.keyin.Airports;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.keyin.Main;

@Service
public class AirportService {

    public static List<Airport> getAllAirports(){
        return Main.airports;
    }

    public static List<Airport> findAirportByPrams(AirportSearchPrams airportSearchPrams) {
        List<Airport> searchResults = new ArrayList<Airport>();

        for (Airport airport : Main.airports) {
            if (airport.getAirportName().equalsIgnoreCase(airportSearchPrams.getAirportName())){
                searchResults.add(airport);
            }
        }
        return searchResults;
    }
    public Airport createAirport(Airport airport){
        Main.airports.add(airport);

        return airport;
    }
}
