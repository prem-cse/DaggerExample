package com.example.daggerexample.module;

import com.example.daggerexample.model.Rim;
import com.example.daggerexample.model.Tires;
import com.example.daggerexample.model.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    Rim createRim() {
        return new Rim();
    }

    @Provides
    Tires createTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels createWheel(Rim rim, Tires tires) {
        return new Wheels(rim, tires);
    }
}
