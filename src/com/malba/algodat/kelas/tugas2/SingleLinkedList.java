package com.malba.algodat.kelas.tugas2;

public abstract class SingleLinkedList extends LinkedList {
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
            temp.next = this.head;
            head = temp;
        }
    }

    void addOnNull(Object objek){
        this.head = new SingleNode(objek);
        this.tail = this.head;
    }

    void addBeforeOrAfter(Object objek, Object loc, Boolean beforeOrAfter){
        SingleNode newNode = new SingleNode(objek);
        if(beforeOrAfter) searchPrev(loc);
        else search(loc);
        newNode.next = this.temp.next;
        this.temp.next = newNode;
    }

    void deleteHead(){
        this.head = this.head.next;
    }

    void deleteTail(){
        if(this.tail==this.head) this.tail = this.head = null;
        else if(this.tail==null) System.out.println("List is empty");
        else{
            searchPrev(this.tail.objek);
            this.tail = this.temp;
            this.tail.next = null;
        }
    }

    void deleteBetween(Object objek){
        searchPrev(objek);
        if(isNotFound()) return;
        this.temp.next = this.temp.next.next;
    }

    void search(Object objek){
        this.temp = this.head;
        if(this.temp!=null){
            while(this.temp.objek!=objek){
                this.temp = this.temp.next;
                if(this.temp==this.tail) break;
            }
        }
    }

    void searchPrev(Object objek){
        this.temp = this.head;
        if(this.temp.next!=null){
            while(this.temp.next.objek!=objek){
                this.temp = this.temp.next;
                if(this.temp.next==this.tail) break;
            }
        }
    }

    boolean isTail(SingleNode node){
        return node == this.tail;
    }

    boolean isNotFound(){
        if(this.temp==null){
            System.out.println("Objek tidak ditemukan");
            return true;
        } return false;
    }
}
