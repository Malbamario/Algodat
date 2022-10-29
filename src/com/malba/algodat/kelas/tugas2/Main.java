package com.malba.algodat.kelas.tugas2;

public class Main{

    public static void main(String[] args){

        String mySisterName = "Jane";
        String myBrotherName = "Josh";
        String myName = "Mario";
        Toy[] toys ={
            new BarbieDoll("Princess Rowena", mySisterName, 117),
            new MickeyMouseDoll("Pluto", myBrotherName, 124),
            new BarbieJigsaw("Barbie The Pearl", mySisterName, 67),
            new SupermanDoll("Justice League Superman", myBrotherName, 421),
            new MickeyMouseAF("Donald Duck", myName, 198),
            new SupermanJigsaw("Superman Fly around Galaxy", myName, 730),
            new SupermanAF("Superman Rebirth", myName, 829)
        };

        CircularToysBox ourSingleBox = new CircularToysBox();
        DoubleToysBox ourDoubleBox = new DoubleToysBox();
        CircularToysBox ourCircularBox = new CircularToysBox();

        addingToysSchema(ourSingleBox, toys);
        addingToysSchema(ourDoubleBox, toys);
        addingToysSchema(ourCircularBox, toys);
        ourSingleBox.printNode();
        ourDoubleBox.printNode();
        ourCircularBox.printNode();
        delettingToysSchema(ourSingleBox, toys);
        delettingToysSchema(ourDoubleBox, toys);
        delettingToysSchema(ourCircularBox, toys);
        ourSingleBox.printNode();
        ourDoubleBox.printNode();
        ourCircularBox.printNode();
    }

    static void addingToysSchema(LinkedList box, Toy[] toys){
        for(int i=0; i<toys.length;i++){
            if(i<2) box.addHead(toys[i]);
            else if(i<4) box.addTail(toys[i]);
            else if(i<6) box.addBeforeOrAfter(toys[i], toys[i-1], true);
            else box.addBeforeOrAfter(toys[i], toys[i-1], false);
        }
    }

    static void delettingToysSchema(LinkedList box, Toy[] toys){
        for(int i=0; i<toys.length/2;i++){
            if(i<1) box.deleteHead();
            else if(i<2) box.deleteTail();
            else box.deleteBetween(toys[5]);
        }
    }
}