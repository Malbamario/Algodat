package com.malba.algodat.kelas.tugas1;

public class ChargeStation {
    String name;
    ElectricVehicle[] slots = new ElectricVehicle[4];
    String[] tickets = new String[4];
    int lastVehicleNumber = 0;

    String charge(ElectricVehicle ev){
        for(int i=0;i<slots.length;i++){
            if(slots[i]==null){
                slots[i] = ev;
                for(String ticket: tickets){
                    if(ticket==null){
                        ticket = "malba-"+lastVehicleNumber;
                        return ticket;
                    }
                }
            }
        }
        System.out.println("Maaf slot sudah penuh");
        return "";
    }

    void finishCharge(ElectricVehicle ev){

    }
}
