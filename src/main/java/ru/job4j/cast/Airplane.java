package ru.job4j.cast;

public class Airplane extends Vehicle {
    @Override
    void move() {
        System.out.println("Летает по воздуху");
    }
}