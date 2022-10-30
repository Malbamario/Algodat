package com.malba.algodat.kelas.tugas3;

public class Queue {
    Node rear=null, front=null;

    public void Inqueue(Object obj){
        Node newNode = new Node(obj);
        if(this.front==null) this.front = this.rear = newNode;
        else{
            this.rear.next = newNode;
            newNode.prev = this.rear;
            this.rear = newNode;
        }
    }

    public Object Dequeue(){
        Object result;
        result = this.front.obj;
        if(this.front!=null){
            this.front = this.front.next;
            this.front.prev.next = null;
            this.front.prev= null;
        } else System.out.println("Queue is empty");
        return result;
    }
}
