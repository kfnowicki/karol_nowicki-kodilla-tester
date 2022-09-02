package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportNotFoundException extends Exception{
    private Map<String,Boolean> getListOfAirports(){
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
        return airports;
    }

    public boolean isAirportInUse(String airport){
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}