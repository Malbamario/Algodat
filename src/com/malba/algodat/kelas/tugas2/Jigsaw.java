package com.malba.algodat.kelas.tugas2;

public class Jigsaw extends Toy {
    protected final String type = "Puzzle";

    public Jigsaw(String name, String owner, int weight){
        super(name,owner, weight);
    }

    void printProperties(){
        System.out.println(
            "Name   : "+this.name+"\n"+
            "Owner  : "+this.owner+"\n"+
            "Type   : "+this.type+"\n"+
            "Weight : "+this.weight+" gr"
        );
    }
}
