package com.malba.algodat.kelas.pertemuan1;

public class Dosen extends Civitas{
    int gaji;

    public Dosen(String id, String nama, int umur, boolean isMale, int gaji){
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.isMale = isMale;
        this.gaji = gaji;
    }

    String addHonorific(String text){
        if(isMale) return "Pak "+text;
        else return "Bu "+text;
    }

    @Override
    void belajar(){
        System.out.println(addHonorific(this.nama+" sedang belajar sekarang."));
    }

    void menguji(Mahasiswa mhs){
        System.out.println(addHonorific(this.nama+" sedang menguji "+mhs.nama+" sekarang."));
    }
}
