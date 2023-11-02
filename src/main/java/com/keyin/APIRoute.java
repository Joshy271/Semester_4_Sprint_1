package com.keyin;

import com.keyin.City.City;
import com.keyin.City.CityService;

import java.io.IOException;
import java.util.List;

import com.keyin.City.CitySearchPrams;
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

