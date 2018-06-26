package com.github.uuidcode.java8.test;

import java.util.List;

public interface Airport {
    List<Aircraft> getAircraftList();

    default void land(Aircraft aircraft) {
        this.getAircraftList().add(aircraft);
    }

    default void depart(Aircraft aircraft) {
        this.getAircraftList().remove(aircraft);
    }
}
