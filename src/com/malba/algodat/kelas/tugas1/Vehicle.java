package com.malba.algodat.kelas.tugas1;

public abstract class Vehicle {
    String color, brand, owner, lastAct = "no action", className = "the Vehicle";
    int wheels, capacity;

    public Vehicle(String owner, String color, String brand){
        this.owner = owner;
        this.color = color;
        this.brand = brand;
    }

    void turnLeft(){
        this.lastAct = "turn left"; printAct();
    }

    void turnRight(){
        this.lastAct = "turn right"; printAct();
    }

    void breaking(){
        this.lastAct = "break"; printAct();
    }

    void backward(){
        this.lastAct = "backward"; printAct();
    }

    public void printAct(){
        System.out.println(this.owner+" "+this.lastAct+" "+this.className);
    }

    abstract void printProperties();
}
