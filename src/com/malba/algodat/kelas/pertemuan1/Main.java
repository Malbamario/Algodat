package com.malba.algodat.kelas.pertemuan1;

public class Main {

    public static void main(String[] args) {
	    Mahasiswa mhs1 = new Mahasiswa("F1D021109", "Mario", 19, true, false);
        Dosen dsn1 = new Dosen("123", "Heri Wijayanto", 48, true, 5413000);
        mhs1.belajar();
        mhs1.cekKelulusan();
        dsn1.belajar();
        dsn1.menguji(mhs1);
    }
}