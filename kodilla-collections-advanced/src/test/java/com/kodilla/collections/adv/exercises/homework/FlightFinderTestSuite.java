package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();
    @Test
    void testFindFlightsFrom() {
        // given
        FlightRepository.addFlight(new Flight("Warszawa","Tokyo"));
        FlightRepository.addFlight(new Flight("Kraków","Tokyo"));
        FlightRepository.addFlight(new Flight("Kraków","Roma"));
        FlightRepository.addFlight(new Flight("Warszawa","Oslo"));
        FlightRepository.addFlight(new Flight("Wrocław","Oslo"));
        // when
        List<String> flightsFromKrk = flightFinder.findFlightsFrom("Kraków");
        // then
        assertEquals(2,flightsFromKrk.size());
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Tokyo");
        expectedList.add("Roma");
        assertEquals(flightsFromKrk,expectedList);

        FlightRepository.clearRepository();
    }

    @Test
    void testIfFlightRepositoryIsEmpty(){
        assertEquals(0,FlightRepository.getDestinations().size());
    }

    @Test
    void testFindFlightsTo() {
        // given
        FlightRepository.addFlight(new Flight("Kraków","Tokyo"));
        FlightRepository.addFlight(new Flight("Warszawa","Tokyo"));
        FlightRepository.addFlight(new Flight("Kraków","Roma"));
        FlightRepository.addFlight(new Flight("Warszawa","Oslo"));
        FlightRepository.addFlight(new Flight("Wrocław","Oslo"));
        FlightRepository.addFlight(new Flight("Wrocław","Tokyo"));

        // when
        List<String> flightsToTokyo = flightFinder.findFlightsTo("Tokyo");
        // then
        assertEquals(3,flightsToTokyo.size());
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Kraków");
        expectedList.add("Warszawa");
        expectedList.add("Wrocław");
        Collections.sort(flightsToTokyo); // without sorting test was failing randomly
        Collections.sort(expectedList);
        assertEquals(flightsToTokyo,expectedList);

        FlightRepository.clearRepository();
    }
}