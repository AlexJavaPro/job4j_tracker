package ru.job4j.cast;

public class Train extends Vehicle {
    @Override
    void move() {
        System.out.println("Передвигается по рельсам");
    }
}