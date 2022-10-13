package com.malba.algodat.kelas.tugas2;

public class ToysBox extends SingleLinkedList {

    void printNode(){
        this.temp = head;
        do{
            Toy theToy = (Toy) this.temp.objek;
            System.out.println( theToy.getName());
            if(isTail(this.temp)) return;
            this.temp = this.temp.next;
        }while(true);
    }
}
