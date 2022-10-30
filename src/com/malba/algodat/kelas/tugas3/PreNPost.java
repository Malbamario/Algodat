package com.malba.algodat.kelas.tugas3;

public class PreNPost {
    // membuat stack untuk menyimpan operator
    static Stack store = new Stack();

    // method untuk mendapatkan bentuk postfix atau prefix dari sebuah infix
    // jika nilai preorPost true artinya ini merupakan konversi dari infix ke previx
    // jika tidak maka ini merupakan konversi dari infix ke postvix
    static String infixtoPostorPreFix(String infix, boolean preorPost) {
        // mengubah string infix ke dalam bentuk array char
        char[] chars = infix.toCharArray();
        // membuat variabel bertipe string untuk menyimpan hasil konversi
        String result = "";
        // mendeklarasikan variabel i untuk index dari elemen array char yang akan dicek
        int i;
        // percabangan untuk menentukan nilai i berdasarkan parameter preorPost
        if (preorPost) i = chars.length - 1;
        else i = 0;
        // iterasi untuk menentukan hasilnya
        while (true) {
            // mendeklarasikan variabel c1 dan c2 untuk menyimpan karakter tanda kurung
            char c1, c2;
            // mengecek nilai preorPost
            if (preorPost) {
                // mengecek nilai varibel i, jika kurang dari 0 maka iterasi akan dihentikan
                if (i < 0) break;
                // menentukan tanda kurung yang digunakan
                c1 = ')';
                c2 = '(';
            } else {
                // mengecek nilai varibel i, jika sama dengan panjang array chars maka iterasi
                // akan dihentikan
                if (i == chars.length) break;
                // menentukan tanda kurung yang digunakan
                c1 = '(';
                c2 = ')';
            }
            // mengecek apakah nilai dari chars[i] sama dengan c1, jika ya maka chars[i]
            // akan di-push ke dalam store
            if (chars[i] == c1) store.push(chars[i]);
            // mengecek apakah nilai dari chars[i] sama dengan c2
            else if (chars[i] == c2) {
                // melakukan iterasi selama obj pada top di store tida sama dengan c1
                while ((char) store.getTop().obj != c1) {
                    // mengisi variabel result dengan hasil method addPreorPost dengan salah satu
                    // argument berupa hasil pop store
                    result = addPreorPost(result, (char) store.pop(), preorPost);
                }
                // mengeluarkan elemen tanda ')' pada store
                store.pop();
            }
            // mengecek apakah nilai dari chars[i] berupa * atau / atau + atau -
            else if (chars[i] == '*' || chars[i] == '/' || chars[i] == '+' || chars[i] == '-') {
                // mengecek apakah top dari store tidak bernilai null
                if (store.getTop() != null) {
                    // menyimpan nilai obj dari top stack store
                    char top = (char) store.getTop().obj;
                    // membandingkan nilai top dan chars[i]
                    if (((chars[i] == '*' || chars[i] == '/') && chars[i] == '*' && top == '/') ||
                            ((top == '*' || top == '/') || chars[i] == '+' && top == '-')) {
                        // mengisi variabel result dengan hasil method addPreorPost dengan salah satu
                        // argument berupa hasil pop store
                        result = addPreorPost(result, (char) store.pop(), preorPost);
                    }
                }
                // mengisi store dengan nilai pada chars[i]
                store.push(chars[i]);
            }
            // mengisi variabel result dengan hasil method addPreorPost dengan salah satu
            // argument berupa hasil pop store
            else result = addPreorPost(result, chars[i], preorPost);
            // menentukan increment atau decrement pada variabel i berdasarkan variabel
            // preorPost
            if (preorPost) i--;
            else i++;
        }
        // mengecek apakah top dari store masih ada atau tidak
        if (store.getTop() != null) {
            // melakukan iterasi selama top dari store tidak bernilai null
            while (store.getTop() != null) {
                // mengisi variabel result dengan hasil method addPreorPost dengan salah satu
                // argument berupa hasil pop store
                result = addPreorPost(result, (char) store.pop(), preorPost);
            }
        }
        // mengembalikan nilai dari variabel result
        return result;
    }

    // method untuk menentukan apakah karakter ditambahkan di awal atau di akhir
    // string
    static String addPreorPost(String s, char c, boolean b) {
        // mengecek jika nilai b true maka mengembalikan string dengan karakter
        // ditambahkan di awal,
        // jika tidak maka mengembalikan string dengan karakter ditambahkan di akhir
        if (b) return c + s;
        return s + c;
    }

    static void printResult(String infix, String postfix, String prefix) {
        System.out.println("===Convert 1 Digit InFix to Prefix and PostFix===");
        line();
        System.out.println("Notasi Infix   : " + infix);
        line();
        System.out.println("Notasi Postfix : " + postfix);
        System.out.println("Notasi Prefix  : " + prefix);
        line();
    }

    static void printResult(String infix, String postfixOrPrefix, boolean postOrPre) {
        if (postOrPre) System.out.println("===Convert InFix to Prefix===");
        else System.out.println("===Convert InFix to PostFix===");
        line();
        System.out.println("Notasi Infix   : " + infix);
        line();
        if (postOrPre) System.out.println("Notasi Postfix : " + postfixOrPrefix);
        else System.out.println("Notasi Prefix  : " + postfixOrPrefix);
        line();
    }

    static int calculatePreOrPost(String prefixOrPostfix, boolean preOrPost) {
        char[] chars = prefixOrPostfix.toCharArray();

        int i;
        if (preOrPost) i = chars.length - 1;
        else i = 0;
        while (true) {
            int temp1, temp2;
            if (preOrPost && i < 0) break;
            else if (i == chars.length) break;

            if (chars[i] == '*' || chars[i] == '/' || chars[i] == '+' || chars[i] == '-') {
                if (preOrPost) {
                    temp2 = (int) store.pop();
                    temp1 = (int) store.pop();
                } else {
                    temp1 = (int) store.pop();
                    temp2 = (int) store.pop();
                }
                switch (chars[i]) {
                    case '+':
                        store.push(temp2 + temp1);
                        break;
                    case '-':
                        store.push(temp2 - temp1);
                        break;
                    case '*':
                        store.push(temp2 * temp1);
                        break;
                    case '/':
                        store.push(temp2 / temp1);
                        break;
                }
            } else
                store.push(Character.getNumericValue(chars[i]));
            if (preOrPost) i--;
            else i++;
        }
        return (int) store.pop();
    }

    // method untuk menampilkan garis dari tanda - sepanjang 48 kali
    static void line() {
        System.out.println("-------------------------------------------------");
    }
}
