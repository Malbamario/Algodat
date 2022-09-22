package com.malba.algodat.kelas.pertemuan1;

public class Mahasiswa extends Civitas {
    boolean isLulus;

    public Mahasiswa(String id, String nama, int umur, boolean isMale, boolean isLulus){
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.isMale = isMale;
        this.isLulus = isLulus;
    }

    @Override
    void belajar(){
        System.out.println(this.nama+" sedang belajar sekarang.");
    }

    void cekKelulusan(){
        if(isLulus) System.out.println(this.nama+" sudah lulus.");
        else System.out.println(this.nama+" belum lulus.");
    }
}
