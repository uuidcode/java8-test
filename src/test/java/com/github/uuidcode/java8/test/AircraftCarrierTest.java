package com.github.uuidcode.java8.test;

import static com.github.uuidcode.java8.test.CoreUtil.createUUID;
import static com.github.uuidcode.java8.test.CoreUtil.toJson;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AircraftCarrierTest {
    protected static Logger logger = LoggerFactory.getLogger(AircraftCarrierTest.class);

    @Test
    public void test() {
        AircraftCarrier aircraftCarrier = new AircraftCarrier();

        Cargo cargo = Cargo.of().setName(createUUID());
        aircraftCarrier.addCargo(cargo);

        Aircraft aircraft = Aircraft.of().setName(createUUID());
        aircraftCarrier.land(aircraft);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test aircraftCarrier: {}", toJson(aircraftCarrier));
        }

        aircraftCarrier.removeCarg(cargo);
        aircraftCarrier.depart(aircraft);
    }
}