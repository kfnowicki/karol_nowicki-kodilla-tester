package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {


    public List<String> findFlightsFrom(String departure){
        return FlightRepository.getFlightsTable(departure);
    }

    public List<String> findFlightsTo(String arrival){
        List <String> result = new ArrayList<>();
        for (Map.Entry<String,List<String>> flight : FlightRepository.getDestinations().entrySet()){
            for (String destination : flight.getValue()) {
                if (arrival == destination)
                    result.add(flight.getKey());
            }
        }
        return result;
    }
}
