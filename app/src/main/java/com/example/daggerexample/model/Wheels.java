package com.example.daggerexample.model;

import javax.inject.Inject;

public class Wheels {

    private Rim rim;
    private Tires tires;

    // we don't need the inject annotation here because module will take care of creating it.
    public Wheels(Rim rim, Tires tires) {
        this.rim = rim;
        this.tires = tires;
    }
}
