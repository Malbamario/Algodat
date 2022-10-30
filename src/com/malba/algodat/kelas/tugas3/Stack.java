package com.malba.algodat.kelas.tugas3;

public class Stack {
    // properti top untuk menandai atau sebagai identifier node paling atas pada stack
    protected Node top = null;

    // getter untuk porperti top
    Node getTop(){
        return this.top;
    }
    
    // method untuk menambahkan node ke dalam stack dengan parameter bertipe Object
    void push(Object obj){
        // percabangan apakah identifier top bernilai null atau tidak,
        // jika ya maka akan mengisi properti top dengan objek node yang berisi variabel obj
        if(this.top==null) this.top = new Node(obj);
        else{
            // membuat node baru yang berisi variabel obj dengan naman newNode
            Node newNode = new Node(obj);
            // mengarahkan link prev dari newNode ke identifier top
            newNode.prev = this.top;
            // mengarahkan link next dari identifier top ke newNode
            this.top.next = newNode;
            // memindahkan identifier top ke link next-nya
            this.top = this.top.next;
        }
    }

    // method untuk mengeluarkan node pada stack dan mengembalikan objek di dalamnya
    Object pop(){
        // mengambil objek dari identifier top
        Object result = this.top.obj;
        // percabangan untuk mengecek apakah link prev dari identifier top berisi null atau tidak
        if(this.top.prev!=null){
            // memindahkan identifier top ke link prev-nya
            this.top = this.top.prev;
            // mengarahkan link next dari identifier top ke null
            this.top.next = null;
        // jika link prev dari identifier top berisi null maka identifier top akan diisi dengan null
        } else this.top = null;
        return result;
    }
}
