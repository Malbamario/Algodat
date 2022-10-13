package com.malba.algodat.kelas.tugas2;

public class SupermanJigsaw extends Jigsaw implements Superman {

    public SupermanJigsaw(String name, String owner, int weight){
        super(name, owner, weight);
    }

    @Override
    void printProperties(){
        System.out.println(
            "Name   : "+this.name+"\n"+
            "Owner  : "+this.owner+"\n"+
            "Type   : "+this.type+"\n"+
            "Merk   : "+SupermanJigsaw.MERK+"\n"+
            "Weight : "+this.weight+" gr"
        );
    }
}
