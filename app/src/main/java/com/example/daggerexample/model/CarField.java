package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;


/**
 * Field injection
 */
public class CarField {

    private static final String TAG = "CarField";

    private final Engine engine;
    private final Wheels wheels;

    @Inject
    public CarField(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "Driving...");
    }
}
