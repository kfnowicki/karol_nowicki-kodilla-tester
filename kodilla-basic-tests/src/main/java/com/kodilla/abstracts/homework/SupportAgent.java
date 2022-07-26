package com.kodilla.abstracts.homework;

public class SupportAgent extends Job{
    int years;
    String tools;
    public SupportAgent(double salary, String responsibilities, int years, String tools) {
        super(salary, responsibilities);
        this.years = years;
        this.tools = tools;
    }

    @Override
    public String getRequirements() {
        return "Requirements: Experience " + this.years + " year(s), Tools experience: " + this.tools;
    }
}
