package com.kodilla.abstracts.homework;

public class Driver extends Job{
    private String licenceCategory;

    public Driver(double salary, String responsibilities, String licenceCategory) {
        super(salary, responsibilities);
        this.licenceCategory = licenceCategory;
    }

    @Override
    public String getRequirements() {
        return "Required driving licence category: " + licenceCategory;
    }
}
