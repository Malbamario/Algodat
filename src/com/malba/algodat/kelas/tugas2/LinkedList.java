package com.malba.algodat.kelas.tugas2;

public abstract class LinkedList {
    abstract void addTail(Object objek);
    abstract void addHead(Object objek);
    abstract void addOnNull(Object objek);
    abstract void addBeforeOrAfter(Object objek, Object loc, Boolean beforeOrAfter);
    abstract void deleteHead();
    abstract void deleteTail();
    abstract void deleteBetween(Object objek);
    abstract void printNode();
    // {
    //     this.temp = head;
    //     do{
    //         Inheritance theInheritance = (Inheritance) this.temp.objek;
    //         System.out.println( theInheritance.getName());
    //         if(isTail(this.temp)) return;
    //         this.temp = this.temp.next;
    //     }while(true);
    // }
}
