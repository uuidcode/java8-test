package com.github.uuidcode.java8.test;

public class Cargo {
    private String name;
    
    public String getName() {
        return this.name;
    }
    
    public Cargo setName(String name) {
        this.name = name;
        return this;
    }
    
    public static Cargo of() {
        return new Cargo();
    }
}
