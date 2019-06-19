package projectppd;
import java.util.Scanner;
public class Izerma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner pl = new Scanner(System.in);
        String LN = " ";
        int pilihan = 0;

        do {
            System.out.println("--IZERMA--");
            System.out.println("");
            System.out.println("1. Mulai");
            System.out.println("2. Keluar");
            System.out.println("");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    int pilmatpel = 0;
                    Scanner input2 = new Scanner(System.in);

                    do {
                        do {
                            System.out.println("");
                            System.out.println("1. Matematika");
                            System.out.println("2. Sejarah");
                            System.out.println("");
                            System.out.print("Masukkan Pilihan Anda : ");
                            pilmatpel = input2.nextInt();
                            switch (pilmatpel) {
                                case 1:
                                    soalMatematika();
                                    System.out.println("\nLanjut ? [y/n] ");
                                    LN = pl.nextLine();
                                    break;
                                case 2:
                                    soalSejarah();
                                    System.out.println("\nLanjut ? [y/n] ");
                                    LN = pl.nextLine();
                                    break;
                            }
                        } while (LN.equalsIgnoreCase("y"));
                    } while (pilmatpel < 1 || pilmatpel > 2);
            }
             System.out.println("");
        } while (pilihan != 2);
        System.out.println("Bye!");
    }

    static int totalbenar(int totbenar, int bnr1, int bnr2, int bnr3, int bnr4) {
        totbenar = bnr1 + bnr2 + bnr3 + bnr4;
        return totbenar;
    }

    static int totalsalah(int totsalah, int slh1, int slh2, int slh3, int slh4) {
        totsalah = slh1 + slh2 + slh3 + slh4;
        return totsalah;
    }

    static void soalMatematika() {
        int No = 1, pil = 1, totbenar = 0, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, totsalah = 0, slh1 = 0, slh2 = 0, slh3 = 0, slh4 = 0;

        String hasil1, hasil2, hasil3, hasil4;
        String[] soal = {"Suatu ujian diikuti dua kelompok dan setiap kelompok terdiri dari 5 siswa. Nilai rata-rata kelompok I adalah 63 dan kelompok II adalah 58. Seorang siswa kelompok I berpindah ke kelompok II sehingga nilai rata-rata kedua kelompok menjadi sama. Nilai siswa yang pindah tersebut adalah....",
            "Jika x dan y merupakan penyelesaian sistem persamaan 2x - y = 7 dan x + 3y = 14, maka nilai x + 2y adalah....",
            "Nilai x yang memenuhi 3^(5x - 1) = 27^(x + 3) adalah....",
            "Diketahui log2 = p, log3 = q, dan log5 = r. Tentukan log 1500 jika dinyatakan dalam p, q, dan r, adalah...."};
        String[] pilihan1 = {"72", "73", "74", "75"};
        String[] pilihan2 = {"11", "13", "21", "27"};
        String[] pilihan3 = {"2", "3", "4", "5"};
        String[] pilihan4 = {"2p + q + 3r", "p + 2q + 3r", "3p + q + 2r", "p + q + r"};
        String[] jawaban = {"b", "a", "d", "a"};

        System.out.println(No++ + " " + soal[0]);
        System.out.println("");
        System.out.println("a)" + pilihan1[0]);
        System.out.println("b)" + pilihan1[1]);
        System.out.println("c)" + pilihan1[2]);
        System.out.println("d)" + pilihan1[3]);
        Scanner a = new Scanner(System.in);

        do {
            System.out.print("Jawab : ");
            hasil1 = a.nextLine();
        } while (!hasil1.equalsIgnoreCase("a") && !hasil1.equalsIgnoreCase("b") && !hasil1.equalsIgnoreCase("c") && !hasil1.equalsIgnoreCase("d"));
        if (jawaban[0].equals(hasil1)) {
            bnr1 = 1;
        } else {
            slh1 = 0;
        }

        System.out.println(No++ + " " + soal[1]);
        System.out.println("");
        System.out.println("a)" + pilihan2[0]);
        System.out.println("b)" + pilihan2[1]);
        System.out.println("c)" + pilihan2[2]);
        System.out.println("d)" + pilihan2[3]);
        do {
            System.out.print("Jawab : ");
            hasil2 = a.nextLine();
        } while (!hasil2.equalsIgnoreCase("a") && !hasil2.equalsIgnoreCase("b") && !hasil2.equalsIgnoreCase("c") && !hasil2.equalsIgnoreCase("d"));

        if (jawaban[1].equals(hasil2)) {
            bnr2 = 1;
        } else {
            slh2 = 0;
        }

        System.out.println(No++ + " " + soal[2]);
        System.out.println("");
        System.out.println("a)" + pilihan3[0]);
        System.out.println("b)" + pilihan3[1]);
        System.out.println("c)" + pilihan3[2]);
        System.out.println("d)" + pilihan3[3]);
        do {
            System.out.print("Jawab : ");
            hasil3 = a.nextLine();
        } while (!hasil3.equalsIgnoreCase("a") && !hasil3.equalsIgnoreCase("b") && !hasil3.equalsIgnoreCase("c") && !hasil3.equalsIgnoreCase("d"));

        if (jawaban[2].equals(hasil3)) {
            bnr3 = 1;
        } else {
            slh3 = 0;
        }

        System.out.println(No++ + " " + soal[3]);
        System.out.println("");
        System.out.println("a)" + pilihan4[0]);
        System.out.println("b)" + pilihan4[1]);
        System.out.println("c)" + pilihan4[2]);
        System.out.println("d)" + pilihan4[3]);
        do {
            System.out.print("Jawab : ");
            hasil4 = a.nextLine();
        } while (!hasil4.equalsIgnoreCase("a") && !hasil4.equalsIgnoreCase("b") && !hasil4.equalsIgnoreCase("c") && !hasil4.equalsIgnoreCase("d"));

        if (jawaban[3].equals(hasil4)) {
            bnr4 = 1;
        } else {
            slh4 = 0;
        }

        System.out.println("");
        System.out.println("Hasil Akhir");
        System.out.println("Jumlah Jawaban Benar : " + totalbenar(totbenar, bnr1, bnr2, bnr3, bnr4));
        System.out.println("Jumlah Jawaban Salah : " + totalsalah(totsalah, slh1, slh2, slh3, slh4));
        System.out.println("Total Nilai Anda : " + (totalbenar(totbenar, bnr1, bnr2, bnr3, bnr4) * 25));
    }

    static void soalSejarah() {
        int No = 1, pil = 1, totbenar = 0, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, totsalah = 0, slh1 = 0, slh2 = 0, slh3 = 0, slh4 = 0;

        String hasil1, hasil2, hasil3, hasil4;
        String[] soal = {"Yang dimaksud dengan Negara Adi Kuasa adalah....",
            "Tujuan dilaksanakannya sistem ekonomi Gerakan Banteng adalah....",
            "Berikut ini yang bukan mendasari dikeluarkannya Dekrit Presiden 5 Juli 1959 adalah....",
            "Raja dari Kerajaan Mataram yang me-nyerang pasukan Belanda di Batavia adalah...."};
        String[] pilihan1 = {"Negara besar punya kekuasaan lebih dalam percaturan politik internasional",
            "Negara besar yang banyak penduduknya",
            "Negara besar yang terdiri dari beberapa negara bagian",
            "Negara besar yang luas wilayahnya"};
        String[] pilihan2 = {"Memberikan bantuan kredit kepada para pengusaha pribumi agar dapat bersaing dengan pengusaha ekonomi",
            "Menghindarkan persaingan antara pengusaha pribumi dan pengusaha nonpribumi",
            "Memberikan perlindungan kepada industri dalam negeri dari persaingan industri swasta asing",
            "Membatasi masuknya pengusaha swasta asing ke Indonesia"};
        String[] pilihan3 = {"Pemungutan suara Dewan Konstituante secara aklamasi menghendaki untuk kembali ke UUD 1945",
            "Dewan Konstituante gagal untuk merumuskan UUD baru",
            "Dewan Konstituante tidak mampu untuk memutuskan kembali ke UUD 1945",
            "Dewan Konstituante mengadakan reses dengan batas waktu yang tidak ditentukan"};
        String[] pilihan4 = {"Sultan Agung",
            "Sultan Iskandar Muda",
            "Sultan Hairun",
            "Sultan Baabullah"};
        String[] jawaban = {"a", "c", "a", "a"};

        System.out.println(No++ + " " + soal[0]);
        System.out.println("");
        System.out.println("a)" + pilihan1[0]);
        System.out.println("b)" + pilihan1[1]);
        System.out.println("c)" + pilihan1[2]);
        System.out.println("d)" + pilihan1[3]);
        Scanner a = new Scanner(System.in);
        do {
            System.out.print("Jawab : ");
            hasil1 = a.nextLine();
        } while (!hasil1.equalsIgnoreCase("a") && !hasil1.equalsIgnoreCase("b") && !hasil1.equalsIgnoreCase("c") && !hasil1.equalsIgnoreCase("d"));

        if (jawaban[0].equals(hasil1)) {
            bnr1 = 1;
        } else {
            slh1 = 0;
        }

        System.out.println(No++ + " " + soal[1]);
        System.out.println("");
        System.out.println("a)" + pilihan2[0]);
        System.out.println("b)" + pilihan2[1]);
        System.out.println("c)" + pilihan2[2]);
        System.out.println("d)" + pilihan2[3]);
        do {
            System.out.print("Jawab : ");
            hasil2 = a.nextLine();
        } while (!hasil2.equalsIgnoreCase("a") && !hasil2.equalsIgnoreCase("b") && !hasil2.equalsIgnoreCase("c") && !hasil2.equalsIgnoreCase("d"));

        if (jawaban[1].equals(hasil2)) {
            bnr2 = 1;
        } else {
            slh2 = 0;
        }

        System.out.println(No++ + " " + soal[2]);
        System.out.println("");
        System.out.println("a)" + pilihan3[0]);
        System.out.println("b)" + pilihan3[1]);
        System.out.println("c)" + pilihan3[2]);
        System.out.println("d)" + pilihan3[3]);
        do {
            System.out.print("Jawab : ");
            hasil3 = a.nextLine();
        } while (!hasil3.equalsIgnoreCase("a") && !hasil3.equalsIgnoreCase("b") && !hasil3.equalsIgnoreCase("c") && !hasil3.equalsIgnoreCase("d"));

        if (jawaban[2].equals(hasil3)) {
            bnr3 = 1;
        } else {
            slh3 = 0;
        }

        System.out.println(No++ + " " + soal[3]);
        System.out.println("");
        System.out.println("a)" + pilihan4[0]);
        System.out.println("b)" + pilihan4[1]);
        System.out.println("c)" + pilihan4[2]);
        System.out.println("d)" + pilihan4[3]);
        do {
            System.out.print("Jawab : ");
            hasil4 = a.nextLine();
        } while (!hasil4.equalsIgnoreCase("a") && !hasil4.equalsIgnoreCase("b") && !hasil4.equalsIgnoreCase("c") && !hasil4.equalsIgnoreCase("d"));

        if (jawaban[3].equals(hasil4)) {
            bnr4 = 1;
        } else {
            slh4 = 0;
        }

        System.out.println("");
        System.out.println("Hasil Akhir");
        System.out.println("Jumlah Jawaban Benar : " + totalbenar(totbenar, bnr1, bnr2, bnr3, bnr4));
        System.out.println("Jumlah Jawaban Salah : " + totalsalah(totsalah, slh1, slh2, slh3, slh4));
        System.out.println("Total Nilai Anda : " + (totalbenar(totbenar, bnr1, bnr2, bnr3, bnr4) * 25));
    }
}