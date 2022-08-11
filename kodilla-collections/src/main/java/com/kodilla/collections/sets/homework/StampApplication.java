package com.kodilla.collections.sets.homework;

import java.security.KeyStore;
import java.util.HashSet;

public class StampApplication {
    public static void main(String[] args) {
        HashSet<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Champions League",10,10, true));
        stamps.add(new Stamp("Lamborghini",25,25,false));
        stamps.add(new Stamp("Champions League",10,10, true));
        stamps.add(new Stamp("Lamborghini",25,25,true));
        stamps.add(new Stamp("Pierogies", 20,30,false));

        System.out.println("Number of elements: " + stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
