package com.malba.algodat.kelas.tugas1;

public class Motorcycle extends Vehicle {
    public Motorcycle(String owner, String color, String brand){
        super(owner, color, brand);
        this.wheels = 2;
        this.capacity = 2;
        this.className = "the Motorcycle";
    }

    @Override
    void printProperties() {

    }
}
