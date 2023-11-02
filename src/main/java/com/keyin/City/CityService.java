package com.keyin.City;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.keyin.Main;

@Service
public class CityService {

    public static List<City> getAllCity(){
        return Main.cities;
    }

    public static List<City> findCityByPrams(CitySearchPrams citySearchPrams) {
        List<City> searchResults = new ArrayList<City>();

        for (City city : Main.cities) {
            if (city.getName().equalsIgnoreCase(citySearchPrams.getName())){
                searchResults.add(city);
            }
        }
        return searchResults;
    }
    public City createCity(City city){
        Main.cities.add(city);

        return city;
    }
}
