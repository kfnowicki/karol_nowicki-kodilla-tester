package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    private static Map<String, List<String>> destinations = new HashMap<>();

    public static Map<String, List<String>> getDestinations() {
        return destinations;
    }

    public static void addFlight(Flight flight){
        List<String> arrivals = destinations.getOrDefault(flight.getDeparture(),new ArrayList<>());
        arrivals.add(flight.getArrival());
        destinations.put(flight.getDeparture(), arrivals);
    }

    public static List<String> getFlightsTable(String departure){
        List<String> arrivals = destinations.getOrDefault(departure,new ArrayList<>());
        return arrivals;
    }

    public static void clearRepository(){
        destinations.clear();
    }
}