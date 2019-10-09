/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantikata;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Ganti Kata
 */
public class Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimatBaru;
        String gantiKat;
        String kataBar;
        String kalimatAwal;
         
        Scanner kalAwal = new Scanner(System.in);
        System.out.print("Masukkan Kalimat = ");
        kalimatAwal = kalAwal.nextLine();
        
        Scanner gantiKata = new Scanner(System.in);
        System.out.print("Ganti Kata = ");
        gantiKat = gantiKata.nextLine();
        
        Scanner kataBaru = new Scanner(System.in);
        System.out.print("Menjadi Kata = ");
        kataBar = kataBaru.nextLine();
        System.out.println();
        
        
        System.out.println("====Hasil Formatting====");
        kalimatBaru = kalimatAwal.replaceAll(gantiKat, kataBar);
        System.out.println("Kalimat Awal = "+kalimatAwal);
        System.out.println("Kalimat Baru = "+kalimatBaru);
        
        
        

    }
    
}
