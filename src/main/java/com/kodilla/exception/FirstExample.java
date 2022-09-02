package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John Bull";
        String[] nameParts = username.split(" ");
        System.out.println("Firt name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);
    }
}
