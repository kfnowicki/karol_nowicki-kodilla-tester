package com.kodilla.collections.adv.maps.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        HashMap<Principal,School> schools = new HashMap<>();

        Principal locke = new Principal("John","Locke");
        Principal jack = new Principal("Jack","Shepard");
        Principal kate = new Principal("Kate","Austen");
        Principal sayid = new Principal("Sayid","Jarrah");

        School oceanic = new School("Oceanic", Arrays.asList(8,1,5));
        School theIsland = new School("The Island", Arrays.asList(15,25,15,10));
        School theHatch = new School("The Hatch", Arrays.asList(4, 8, 15, 16, 23, 42));
        School dharma = new School("Dharma", Arrays.asList(10,14,17,15));

        schools.put(jack,oceanic);
        schools.put(kate,theIsland);
        schools.put(locke,theHatch);
        schools.put(sayid,dharma);

        for (Map.Entry<Principal,School> schoolEntry : schools.entrySet() ){
            System.out.println(schoolEntry.getValue().getName() + " School, "
                    + "Number of students: " + schoolEntry.getValue().getTotalNumberOfStudents()
                    + ", Principal: " + schoolEntry.getKey());
        }
    }
}
