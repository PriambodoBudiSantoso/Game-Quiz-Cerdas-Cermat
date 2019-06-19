import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FungsiProsedur {
    
    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        
        System.out.println("IZERMA");
        System.out.println("");
        System.out.println("1. Mulai");
        System.out.println("2. Keluar");
        System.out.println("");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                int selectSubject = Integer.valueOf(input.readLine());
                switch (selectSubject) {
                    case 1:
                };
                break;
            case 2:
                soalSejarah();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }
//    String hasil, JwBn = "Jawaban Anda Benar", JwSl = "Jawaban Anda Salah";

    static int benar = 1, salah = 1, totbenar, totsalah, bnr1 = 0, bnr2 = 0, bnr3 = 0, bnr4 = 0, slh1 = 0, slh2 = 0, slh3 = 0, slh4 = 0;
    static String hasil;

    static int koreksi_jawaban() {
                
        
        return 0;
    }
    
    static void soalMatematika(){
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
    }
    
    static void soalSejarah() throws IOException{
        System.out.print("Nama buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }
    
    public static void main(String[] args) throws IOException {
        
        do {
            showMenu();
        } while (isRunning);
        
    }
    
}