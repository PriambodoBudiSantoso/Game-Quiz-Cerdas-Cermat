package projectppd;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner pl = new Scanner(System.in);
        String LN = " ";
        int a = 0;

        System.out.println("IZERMA");
        System.out.println("");
        System.out.println("1. Mulai");
        System.out.println("2. Keluar");
        System.out.println("");

//      do {
        do {
            boolean t = true;
            System.out.print("Masukkan Pilihan Anda : ");
            a = in.nextInt();
            if (a < 1 || a > 2) {
                System.out.println("Masukkan Ulang");
//                return a = in.nextInt(); 
            }
        } while (a == 1 && a == 2);
        if (a == 1) {
            int x;

            do {
                System.out.println("");
                System.out.println("1. Matematika");
                System.out.println("2. Sejarah");
                System.out.println("");
                System.out.print("Masukkan Pilihan Anda : ");
                x = in.nextInt();

                if (x == 1) {

                    System.out.println("");
                    System.out.println("                              SOAL MATEMATIKA");

                    String hasil;
                    int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0;
                    int Slh1 = 0, Slh2 = 0, Slh3 = 0, Slh4 = 0;

                    String[] b = new String[5];

                    b[0] = "Soal 1";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("1) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "a":
//                        System.out.println(JwBn);
                            bnr1 = Benar;
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                        case "b":
//                        System.out.println(JwSl);
                            Slh1 = Salah;
//                        System.out.println("kunci jawaban = a");
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                        case "c":
//                        System.out.println(JwSl);
                            Slh1 = Salah;
//                        System.out.println("kunci jawaban = a");
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                        case "d":
//                        System.out.println(JwSl);
                            Slh1 = Salah;
//                        System.out.println("kunci jawaban = a");
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                    }
                    System.out.println("");
                    b[0] = "Soal 2";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("2) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a2 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "b":
//                        System.out.println(JwBn);
                            bnr2 = Benar;
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "a":
//                        System.out.println(JwSl);
                            Slh2 = Salah;
//                        System.out.println("kunci jawaban = b");
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "c":
//                        System.out.println(JwSl);
                            Slh2 = Salah;
//                        System.out.println("kunci jawaban = b");
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "d":
//                        System.out.println(JwSl);
                            Slh2 = Salah;
//                        System.out.println("kunci jawaban = b");
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                    }
                    System.out.println("");
                    b[0] = "Soal 3";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("3) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a3 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "c":
//                        System.out.println(JwBn);
                            bnr3 = Benar;
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "b":
//                        System.out.println(JwSl);
                            Slh3 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "a":
//                        System.out.println(JwSl);
                            Slh3 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "d":
//                        System.out.println(JwSl);
                            Slh3 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                    }
                    System.out.println("");
                    b[0] = "Soal 4";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("4) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a4 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "d":
//                        System.out.println(JwBn);
                            bnr4 = Benar;
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "b":
//                        System.out.println(JwSl);
                            Slh4 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "a":
//                        System.out.println(JwSl);
                            Slh4 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "c":
//                        System.out.println(JwSl);
                            Slh4 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                    }
                    System.out.println("");
                    System.out.println("Hasil Akhir");
                    totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                    System.out.println("Jumlah Jawaban Benar : " + totbenar);
                    totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                    System.out.println("Jumlah Jawaban Salah : " + totsalah);
                    System.out.println("Total Nilai Anda : " + (totbenar * 25));

                } else if (x == 2) {

                    System.out.println("");
                    System.out.println("                              SOAL SEJARAH");

                    String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";
                    int Benar = 1, Salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, bnr5 = 0;
                    int Slh1 = 0, Slh2 = 0, Slh3 = 0, Slh4 = 0, Slh5 = 0;

                    String[] b = new String[5];
                    b[0] = "Soal 1";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("1) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "a":
//                        System.out.println(JwBn);
                            bnr1 = Benar;
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                        case "b":
//                        System.out.println(JwSl);
                            Slh1 = Salah;
//                        System.out.println("kunci jawaban = a");
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                        case "c":
//                        System.out.println(JwSl);
                            Slh1 = Salah;
//                        System.out.println("kunci jawaban = a");
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                        case "d":
//                        System.out.println(JwSl);
                            Slh1 = Salah;
//                        System.out.println("kunci jawaban = a");
                            totbenar = bnr1;
//                        System.out.println("Jawaban Benar: " + bnr1);
                            totsalah = Slh1;
//                        System.out.println("Jawaban Salah: " + Slh1);
                            break;
                    }
                    System.out.println("");
                    b[0] = "Soal 2";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("2) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a2 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "b":
//                        System.out.println(JwBn);
                            bnr2 = Benar;
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "a":
//                        System.out.println(JwSl);
                            Slh2 = Salah;
//                        System.out.println("kunci jawaban = b");
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "c":
//                        System.out.println(JwSl);
                            Slh2 = Salah;
//                        System.out.println("kunci jawaban = b");
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "d":
//                        System.out.println(JwSl);
                            Slh2 = Salah;
//                        System.out.println("kunci jawaban = b");
                            totbenar = bnr1 + bnr2;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                    }
                    System.out.println("");
                    b[0] = "Soal 3";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("3) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a3 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "c":
//                        System.out.println(JwBn);
                            bnr3 = Benar;
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "b":
//                        System.out.println(JwSl);
                            Slh3 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "a":
//                        System.out.println(JwSl);
                            Slh3 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "d":
//                        System.out.println(JwSl);
                            Slh3 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                    }
                    System.out.println("");
                    b[0] = "Soal 4";
                    b[1] = "pil a";
                    b[2] = "pil b";
                    b[3] = "pil c";
                    b[4] = "pil d";
                    System.out.println("4) " + b[0]);
                    System.out.println("");
                    System.out.println("a) " + b[1]);
                    System.out.println("b) " + b[2]);
                    System.out.println("c) " + b[3]);
                    System.out.println("d) " + b[4]);
                    Scanner a4 = new Scanner(System.in);
                    System.out.print("Jawab : ");
                    hasil = a1.nextLine();
                    switch (hasil) {
                        case "d":
//                        System.out.println(JwBn);
                            bnr4 = Benar;
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "b":
//                        System.out.println(JwSl);
                            Slh4 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "a":
//                        System.out.println(JwSl);
                            Slh4 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                        case "c":
//                        System.out.println(JwSl);
                            Slh4 = Salah;
//                        System.out.println("kunci jawaban = c");
                            totbenar = bnr1 + bnr2 + bnr3 + bnr4;
//                        System.out.println("Jawaban yang benar : " + totbenar);
                            totsalah = Slh1 + Slh2 + Slh3 + Slh4;
//                        System.out.println("Jawaban yang salah : " + totsalah);
                            break;
                    }
                    System.out.println("");
                    System.out.println("Hasil Akhir");
                    totbenar = bnr1 + bnr2 + bnr3 + bnr4;
                    System.out.println("Jumlah Jawaban Benar : " + totbenar);
                    totsalah = Slh1 + Slh2 + Slh3 + Slh4;
                    System.out.println("Jumlah Jawaban Salah : " + totsalah);
                    System.out.println("Total Nilai Anda : " + (totbenar * 25));
                }
                System.out.println("\nLanjut ? [y/n] ");
                LN = pl.nextLine();
            } while (x!=1||x!=2);

        } else if (a == 2) {
            System.out.println("Bye!");
        }
//      } while (a == 1);
    }
}
