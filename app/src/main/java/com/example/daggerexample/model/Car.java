package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;


/**
 * Demonstrating the Constructor Injection
 * Steps:
 * 1. Create a component interface and required methods same as module class in Guice.
 * 2. Add @Inject annotation to every classes present in subtree. Note that it don't
 *    create trivial classes object automatically as Guice.
 * 3. Instead of creating Injector as in Google guice we need Component instance here.
 *    See example below:
 *         CarComponent carComponent = DaggerCarComponent.create();
 *         Car car = carComponent.getCar();
 *
 */
public class Car {

    private static final String TAG = "Car";

    private final Engine engine;
    private final Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "Driving...");
    }
}
