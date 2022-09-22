package com.malba.algodat.kelas.tugas1;

public class Bicycle extends Vehicle {
    public Bicycle(String owner, String color, String brand){
        super(owner, color, brand);
        this.wheels = 2;
        this.capacity = 1;
        this.className = "the Bicycle";
    }

    @Override
    void printProperties() {

    }
}