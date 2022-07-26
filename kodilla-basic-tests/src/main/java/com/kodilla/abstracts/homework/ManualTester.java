package com.kodilla.abstracts.homework;

public class ManualTester extends Job{
    private int years;
    private String language;
    private String programmingLanguage;

    public ManualTester(double salary, String responsibilities,int years,String language, String programmingLanguage) {
        super(salary, responsibilities);
        this.years = years;
        this.language = language;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getRequirements() {
        return "Requirements: Experience " + this.years + " year(s), Programming language: " + this.programmingLanguage + ", Language: " + this.language;
    }
}
