package com.malba.algodat.kelas.tugas2;

public abstract class CircularLinkedList extends SingleLinkedList {
    @Override
    void addTail(Object objek){
        this.temp = this.head;
        if(this.head==null) addOnNull(objek);
        else{
            this.tail.next = new SingleNode(objek);
            this.tail = this.tail.next;
            this.tail.next = this.head;
        }
    }

    @Override
    void addHead(Object objek){
        this.temp = this.tail;
        if(this.tail==null) addOnNull(objek);
        else{
            this.temp = new SingleNode(objek);
            this.temp.next = head;
            head = this.temp;
        }
    }
}
