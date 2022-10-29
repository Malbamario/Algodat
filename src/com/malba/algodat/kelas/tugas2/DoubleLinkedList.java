package com.malba.algodat.kelas.tugas2;

public abstract class DoubleLinkedList extends LinkedList {
    DoubleNode head = null, tail = null, temp = null;

    void addTail(Object objek){
        this.temp = this.head;
        if(this.head==null) addOnNull(objek);
        else{
            this.tail.next = new DoubleNode(objek);
            this.tail.next.prev = this.tail.next;
            this.tail = this.tail.next;
        }
    }

    void addHead(Object objek){
        this.temp = this.tail;
        if(this.tail==null) addOnNull(objek);
        else{
            temp = new DoubleNode(objek);
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }

    void addOnNull(Object objek){
        this.head = new DoubleNode(objek);
        this.tail = this.head;
    }

    void addBeforeOrAfter(Object objek, Object loc, Boolean beforeOrAfter){
        DoubleNode newNode = new DoubleNode(objek);
        if(beforeOrAfter) searchPrev(loc);
        else search(loc);
        
        newNode.prev = this.temp;
        newNode.next = this.temp.next;
        if(this.temp.next!=null){
            this.temp.next.prev = newNode;
            this.temp.next = newNode;
        }
    }

    void deleteHead(){
        this.head = this.head.next;
    }

    void deleteTail(){
        if(this.tail==this.head) this.tail = this.head = null;
        else if(this.tail==null) System.out.println("List is empty");
        else{
            this.temp = this.tail.prev;
            this.tail = this.temp;
            this.tail.next = null;
        }
    }

    void deleteBetween(Object objek){
        search(objek);
        if(isNotFound()) return;
        this.temp.prev.next = this.temp.next;
        this.temp.next.prev = this.temp.prev;
    }
    
    void search(Object objek){
        this.temp = head;
        if(this.temp!=null){
            while(this.temp.objek!=objek){
                this.temp = this.temp.next;
                if(this.temp==this.tail) break;
            }
        }
    }

    void searchPrev(Object objek){
        this.temp = head;
        if(this.temp.next!=null){
            while(this.temp.next.objek!=objek){
                this.temp = this.temp.next;
                if(this.temp.next==this.tail) break;
            }
        }
    }
    
    boolean isTail(DoubleNode node){
        return node == this.tail;
    }

    boolean isNotFound(){
        if(this.temp==null){
            System.out.println("Objek tidak ditemukan");
            return false;
        } return true;
    }
}
