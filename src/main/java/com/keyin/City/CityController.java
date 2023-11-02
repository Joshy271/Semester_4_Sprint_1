package com.keyin.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> getAllCity(){
        return cityService.getAllCity();
    }

    @GetMapping("/cities_search")
    public List<City> getCityByPrams(@RequestParam String cityName){
        CitySearchPrams citySearchPrams = new CitySearchPrams();

        citySearchPrams.setName(cityName);

        return cityService.findCityByPrams(citySearchPrams);
    }

    @PostMapping("/cities")
    public City cities(@RequestBody City city) {
        return cityService.createCity((city));
    }

}
