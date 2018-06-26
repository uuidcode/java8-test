package com.github.uuidcode.java8.test;

import java.util.List;

public interface Ship {
    List<Cargo> getCargoList();

    default void addCargo(Cargo cargo) {
        this.getCargoList().add(cargo);
    }

    default void removeCarg(Cargo cargo) {
        this.getCargoList().remove(cargo);
    }
}
