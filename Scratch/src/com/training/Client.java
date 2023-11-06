package com.training;

class Client {
    public static void main(String[] args) {
        // classloader loads instructor.class which initializes static(shared) projector object
        //Instructor inst1 = new Instructor("andy", 0);
        //Instructor inst2 = new Instructor("cecil", 2);
        Instructor.touch();
        Instructor.touch();
    }
}