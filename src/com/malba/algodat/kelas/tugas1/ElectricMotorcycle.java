package com.malba.algodat.kelas.tugas1;

public class ElectricMotorcycle extends Motorcycle implements ElectricVehicle{
    public ElectricMotorcycle(String owner, String color, String brand){
        super(owner, color, brand);
        this.className = E_PREFIX+" Motorcycle";
    }

    public void charge(){
        this.lastAct = "charge"; printAct();
    }

    @Override
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
