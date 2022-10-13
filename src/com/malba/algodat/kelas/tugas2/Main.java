package com.malba.algodat.kelas.tugas2;

public class Main{

    public static void main(String[] args){
        String mySisterName = "Jane";
        String myBrotherName = "Josh";
        String myName = "Mario";
        BarbieDoll mySisterToy1 = new BarbieDoll("Princess Rowena", mySisterName, 117);
        MickeyMouseDoll myBrotherToy1 = new MickeyMouseDoll("Pluto", myBrotherName, 124);
        BarbieJigsaw mySisterToy2 = new BarbieJigsaw("Barbie The Pearl", mySisterName, 67);
        SupermanDoll myBrotherToy2 = new SupermanDoll("Justice League Superman", myBrotherName, 421);
        MickeyMouseAF myToy1 = new MickeyMouseAF("Donald Duck", myName, 198);
        SupermanJigsaw myToy2 = new SupermanJigsaw("Superman Fly around Galaxy", myName, 730);
        SupermanAF myToy3 = new SupermanAF("Superman Rebirth", myName, 829);

        ToysBox ourBox = new ToysBox();
        ourBox.addHead(mySisterToy1);
        ourBox.addHead(myBrotherToy1);
        ourBox.addHead(myToy1);
        ourBox.addTail(mySisterToy2);
        ourBox.addTail(myBrotherToy2);
        ourBox.addTail(myToy2);
        ourBox.addTail(myToy3);
        ourBox.printNode();

    }
}