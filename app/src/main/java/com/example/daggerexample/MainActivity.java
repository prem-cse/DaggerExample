package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexample.component.CarComponent;
import com.example.daggerexample.component.DaggerCarComponent;
import com.example.daggerexample.model.Car;
import com.example.daggerexample.model.CarField;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    CarField carField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Constructor injection
        CarComponent carComponent = DaggerCarComponent.create();
        Car car = carComponent.getCar();
        car.drive();

        // Field injection
        carComponent.inject(this);
        carField.drive();
    }
}