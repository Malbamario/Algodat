package com.malba.algodat.kelas.tugas2;

public abstract class SingleLinkedList {
    SingleNode head = null, tail = null, temp = null;

    void addTail(Object objek){
        this.temp = this.head;
        if(this.head==null) addOnNull(objek);
        else{
            this.tail.next = new SingleNode(objek);
            this.tail = this.tail.next;
        }
    }

    void addHead(Object objek){
        this.temp = this.tail;
        if(this.tail==null) addOnNull(objek);
        else{
            temp = new SingleNode(objek);
            temp.next = head;
            head = temp;
        }
    }

    void addOnNull(Object objek){
        this.head = new SingleNode(objek);
        this.tail = this.head;
    }

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

    

    boolean isTail(SingleNode node){
        return node.next == null;
    }
}
