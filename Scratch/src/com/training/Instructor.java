package com.training;

class Instructor {
    // shared among all instructor objects
    private static final Projector projector = new Projector();

    // instance variables for each instructor object
    private final String name;
    private final int yearsExperience;

    public Instructor(String name, int yearsExperience) {
        System.out.println("Instructor ctor called");
        this.name = name;
        this.yearsExperience = yearsExperience;
    }

    public static void touch() {
        System.out.println("Instructors touch() method called");
    }

    public String getName() {
        return name;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    static {
        System.out.println("static fields initialized, Instructor.class loaded into memory.");
    }
}