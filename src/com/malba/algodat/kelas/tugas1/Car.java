package com.malba.algodat.kelas.tugas1;

public class Car extends Vehicle {
    public Car(String owner, String color, String brand){
        super(owner, color, brand);
        this.wheels = 4;
        this.capacity = 4;
        this.className = "the Car";
    }

    @Override
    void printProperties() {

    }
}