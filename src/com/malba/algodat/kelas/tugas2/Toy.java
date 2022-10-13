package com.malba.algodat.kelas.tugas2;

public abstract class Toy {
    protected final String name;
    protected String owner, status;
    protected int weight;

    public Toy(String name, String owner, int weight){
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    String getName(){ return this.name; }

    void setOwner(String owner){ this.owner = owner; }
    String getOwner(){ return this.owner; }

    void setStatus(String status){ this.status = status; }
    String getStatus(){ return this.status; }

    void setWeight(int weight){ this.weight = weight; }
    int getWeight(){ return this.weight; }

    abstract void printProperties();
}
