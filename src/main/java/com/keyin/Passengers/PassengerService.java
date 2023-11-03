package com.keyin.Passengers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.keyin.Main;

@Service
public class PassengerService {

    public static List<Passengers> getAllPassengers(){
        return Main.passengers;
    }

    public static List<Passengers> findPassengersByPrams(PassengerSearchPrams passengerSearchPrams) {
        List<Passengers> searchResults = new ArrayList<Passengers>();

        for (Passengers passengers : Main.passengers) {
            if (passengers.getFirstName().equalsIgnoreCase(passengerSearchPrams.getfirstName())){
                searchResults.add(passengers);
            }
        }
        return searchResults;
    }
    public Passengers createPassenger(Passengers passengers){
        Main.passengers.add(passengers);

        return passengers;
    }
}
