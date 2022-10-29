package com.malba.algodat.kelas.tugas2;

public class CircularToysBox extends CircularLinkedList {

    void printNode(){
        this.temp = head;
        do{
            Toy theToy = (Toy) this.temp.objek;
            System.out.println( theToy.getName());
            if(isTail(this.temp)) break;
            this.temp = this.temp.next;
        }while(true);
        System.out.println();
        
    }
}
