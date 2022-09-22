package com.malba.algodat.kelas.tugas1;

public class Main {

    public static void main(String[] args) {
        ElectricBicycle myEBicycle = new ElectricBicycle("Mario", "Blue", "IZIP");
        ElectricMotorcycle myEMotorcycle = new ElectricMotorcycle("Sam", "Red", "Vespa");
        ElectricCar myECar = new ElectricCar("Azi", "Purple", "Hyundai");

        myEBicycle.turnLeft();
        myEBicycle.printProperties();
        myEBicycle.turnRight();
        myEBicycle.printProperties();

        myEMotorcycle.charge();
        myEMotorcycle.printProperties();
        myEMotorcycle.backward();
        myEMotorcycle.printProperties();

        myECar.turnRight();
        myECar.printProperties();
        myECar.breaking();
        myECar.printProperties();
    }
}