package com.malba.algodat.kelas.tugas3;

public class Main{
    public static void main(String[] args){
        String infix = "(5+7)*2-(3-1)*(2+4)";
        // membuat string postfix dari variabel infix dengan method infixtoPostorPreFix()
        String postfix = PreNPost.infixtoPostorPreFix(infix, false);
        // membuat string prefix dari variabel infix dengan method infixtoPostorPreFix()
        String prefix = PreNPost.infixtoPostorPreFix(infix, true);
        // menampilkan hasil konversi infix ke postfix dan prefix
        PreNPost.printResult(infix, postfix, prefix);
        int postfixCal = PreNPost.calculatePreOrPost(postfix, false);
        int prefixCal = PreNPost.calculatePreOrPost(prefix, true);
        System.out.println("Hasil Perhitungan Postfix : " + postfixCal);
        System.out.println("Hasil Perhitungan Prefix  : " + prefixCal);
        PreNPost.line();
    }
}