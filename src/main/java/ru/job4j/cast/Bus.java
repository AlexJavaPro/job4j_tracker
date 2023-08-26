package ru.job4j.cast;

public class Bus extends Vehicle {
    @Override
    void move() {
        System.out.println("Двигается по скоростным трассам");
    }
}