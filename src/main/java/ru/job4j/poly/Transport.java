package ru.job4j.poly;

public interface Transport {
    public  static  final byte COST_FUEL = 50;

    void drive();

    void passengers(byte count);

    short refuel(byte numberOfLiters);
}
