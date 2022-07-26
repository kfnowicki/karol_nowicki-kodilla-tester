package com.kodilla.abstracts.homework;

public class Person {
    private Job job;
    private String firstName;
    private int age;

    public static void main(String[] args) {
        ManualTester tester = new ManualTester(5000,"Preparing and executing test cases and scenarios",1,"English","Java");
        Person adam = new Person("Adam", 28,tester);
        adam.showResponsibilities();
        System.out.println(adam.job.getRequirements());

        Driver driver = new Driver(4000,"Delivering products to local stores","C");
        Person jan = new Person("Jan", 35,driver);
        jan.showResponsibilities();
        System.out.println(jan.job.getRequirements());

        SupportAgent supportAgent = new SupportAgent(6000,"Providing second level tech support via chat and email",3,"Hubspot, Zendesk");
        Person magdalena = new Person("Magdalena",25,supportAgent);
        magdalena.showResponsibilities();
        System.out.println(magdalena.job.getRequirements());

    }

    public void showResponsibilities(){
        System.out.println("Responsibilities of " + this.firstName +": " + this.job.getResponsibilities());
    }

    public Person(String firstName,int age,Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

}
