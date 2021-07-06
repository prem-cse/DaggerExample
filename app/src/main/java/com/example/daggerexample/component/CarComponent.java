package com.example.daggerexample.component;

import com.example.daggerexample.MainActivity;
import com.example.daggerexample.module.WheelModule;
import com.example.daggerexample.model.Car;

import dagger.Component;

@Component(modules = WheelModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
