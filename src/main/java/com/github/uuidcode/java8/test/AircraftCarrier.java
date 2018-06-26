package com.github.uuidcode.java8.test;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier implements Airport, Ship {
    List<Cargo> cargoList = new ArrayList<>();
    List<Aircraft> aircraftList = new ArrayList<>();

    @Override
    public List<Aircraft> getAircraftList() {
        return this.aircraftList;
    }

    @Override
    public List<Cargo> getCargoList() {
        return this.cargoList;
    }
}
