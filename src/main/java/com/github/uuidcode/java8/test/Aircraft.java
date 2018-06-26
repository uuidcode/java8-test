package com.github.uuidcode.java8.test;

public class Aircraft {
    private String name;
    
    public String getName() {
        return this.name;
    }
    
    public Aircraft setName(String name) {
        this.name = name;
        return this;
    }
    
    public static Aircraft of() {
        return new Aircraft();
    }
}
