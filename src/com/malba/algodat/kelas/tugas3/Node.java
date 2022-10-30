package com.malba.algodat.kelas.tugas3;

public class Node {
    // Terdapat properti obj dengan tipe Object
    Object obj;
    // Properti yang bekerja sebagai link ke node lainnya yaitu next dan prev
    Node next, prev;

    // constructor untuk memasukkan nilai dari properti obj dengan parameter obj
    public Node(Object obj) {
        this.obj = obj;
    }
}
