package com.training;

class Projector {
    public Projector() {
        System.out.println("Projector ctor called.");
    }

    // this executes when the classloader loads projector.class into memory
    static {
        System.out.println("Projector.class loaded into memory");
    }
}