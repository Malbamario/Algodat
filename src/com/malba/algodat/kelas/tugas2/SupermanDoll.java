package com.malba.algodat.kelas.tugas2;

public class SupermanDoll extends Doll implements Superman {

    public SupermanDoll(String name, String owner, int weight){
        super(name, owner, weight);
    }

    @Override
    void printProperties(){
        System.out.println(
            "Name   : "+this.name+"\n"+
            "Owner  : "+this.owner+"\n"+
            "Type   : "+this.type+"\n"+
            "Merk   : "+SupermanDoll.MERK+"\n"+
            "Weight : "+this.weight+" gr"
        );
    }
}
