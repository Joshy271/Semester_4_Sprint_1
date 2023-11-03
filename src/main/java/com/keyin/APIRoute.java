package com.keyin;

import com.keyin.Aircraft.Aircraft;
import com.keyin.Aircraft.AircraftSearchPrams;
import com.keyin.Aircraft.AircraftService;
import com.keyin.City.City;
import com.keyin.City.CityService;
import com.keyin.City.CitySearchPrams;
import com.keyin.Passengers.Passengers;
import com.keyin.Passengers.PassengerService;
import com.keyin.Passengers.PassengerSearchPrams;
import com.keyin.Airports.Airport;
import com.keyin.Airports.AirportService;
import com.keyin.Airports.AirportSearchPrams;

import java.io.IOException;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class APIRoute {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(APIRoute.class, args);
    }

    @GetMapping("/cities")
    public List<City> cities() {
        return CityService.getAllCity();
    }

    @GetMapping("/cities_search")
    public List<City> cities_search(@RequestParam String cityName) {
        CitySearchPrams citySearchPrams = new CitySearchPrams();

        citySearchPrams.setName(cityName);

        return CityService.findCityByPrams(citySearchPrams);
    }

    @PostMapping("/cities")
    public void cities(@RequestParam(value = "name", defaultValue = "Default") String name,
                       @RequestParam(value = "state", defaultValue = "null") String state,
                       @RequestParam(value = "population", defaultValue = "null") int population) {
        Main.cities.add(new City(0, name, state, population));

    }

    //PASSENGERS!!
    @GetMapping("/passengers")
    public List<Passengers> passengers() {
        return PassengerService.getAllPassengers();
    }

    @GetMapping("/passengers_search")
    public List<Passengers> passenger_search(@RequestParam String firstName) {
        PassengerSearchPrams passengerSearchPrams = new PassengerSearchPrams();

        passengerSearchPrams.setFirstName(firstName);

        return PassengerService.findPassengersByPrams(passengerSearchPrams);
    }

    @PostMapping("/passengers")
    public void passengers(@RequestParam(value = "firstName", defaultValue = "Default") String firstName,
                       @RequestParam(value = "lastName", defaultValue = "null") String lastName,
                       @RequestParam(value = "phoneNumber", defaultValue = "null") String phoneNumber) {
        Main.passengers.add(new Passengers(0, firstName, lastName, phoneNumber));

    }

    //AIRPORTS!!!

    @GetMapping("/airports")
    public List<Airport> airports() {
        return AirportService.getAllAirports();
    }

    @GetMapping("/airports_search")
    public List<Airport> airports_search(@RequestParam String AirportName) {
        AirportSearchPrams airportSearchPrams = new AirportSearchPrams();

        airportSearchPrams.setAirportName(AirportName);

        return AirportService.findAirportByPrams(airportSearchPrams);
    }

    @PostMapping("/airports")
    public void airports(@RequestParam(value = "AirportName", defaultValue = "Default") String AirportName,
                           @RequestParam(value = "Code", defaultValue = "null") String Code) {
        Main.airports.add(new Airport(0, AirportName, Code));

    }

    //AIRCRAFTS

    @GetMapping("/aircrafts")
    public List<Aircraft> aircrafts() {
        return AircraftService.getAllAircrafts();
    }

    @GetMapping("/aircrafts_search")
    public List<Aircraft> aircrafts_search(@RequestParam String AircraftType) {
        AircraftSearchPrams aircraftSearchPrams = new AircraftSearchPrams();

        aircraftSearchPrams.setAircraftType(AircraftType);

        return AircraftService.findAircraftByPrams(aircraftSearchPrams);
    }

    @PostMapping("/aircrafts")
    public void aircrafts(@RequestParam(value = "AircraftType", defaultValue = "Default") String AircraftType,
                           @RequestParam(value = "AirlineName", defaultValue = "null") String AirlineName,
                           @RequestParam(value = "NumOfPassengers", defaultValue = "null") int NumOfPassengers) {
        Main.aircrafts.add(new Aircraft(0, AircraftType, AirlineName, NumOfPassengers));

    }



    private static void listAirportsInCity() {
            // Implement the logic to list airports in a specific city
        }

        private static void listAircraftForPassenger() {
            // Implement the logic to list aircraft for a specific passenger
        }

        private static void listAirportsForAircraft() {
            // Implement the logic to list airports for a specific aircraft
        }

        private static void listAirportsForPassenger() {
            // Implement the logic to list airports for a specific passenger
        }

        // ... Define your API endpoints ...
    }

