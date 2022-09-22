package com.malba.algodat.kelas.tugas1;

public class ElectricBicycle extends Bicycle implements ElectricVehicle{
    public ElectricBicycle(String owner, String color, String brand){
        super(owner, color, brand);
        this.className = E_PREFIX+" Bicycle";
    }

    public void charge(){
        this.lastAct = "charge"; printAct();
    }

    void printProperties(){
        System.out.println(
                "Owner\t\t: "+this.owner+"\n"+
                "Wheels\t\t: "+this.wheels+"\n"+
                "Capacity\t: "+this.capacity+"\n"+
                "Color\t\t: "+this.color+"\n"+
                "Brand\t\t: "+this.brand+"\n"+
                "Last Action\t: "+this.lastAct+"\n"
        );
    }
}
