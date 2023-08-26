package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void passengers(byte count) {
        System.out.println("Number of passengers : " + count);
    }

    @Override
    public short refuel(byte numberOfLiters) {
        return (short) (numberOfLiters * COST_FUEL);
    }
}
