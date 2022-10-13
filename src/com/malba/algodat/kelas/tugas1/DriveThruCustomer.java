package com.malba.algodat.kelas.tugas1;

public class DriveThruCustomer {
    private final Vehicle vehicle;
    private String order;
    private int amount;
    private DriveThruCustomer next=null;

    DriveThruCustomer(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void setOrder(String order){
        this.order = order;
    }

    public String getOrder(){
        return this.order;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public void setNext(DriveThruCustomer customer){
        this.next = customer;
    }

    public DriveThruCustomer getNext(){
        return this.next;
    }

    public boolean isTail(){
        return next == null;
    }
}
