package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicleAirplane = new Airplane();
        Vehicle vehicleTrain = new Train();
        Vehicle vehicleBus = new Bus();
        Vehicle[] vehicles = {vehicleAirplane, vehicleTrain, vehicleBus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
