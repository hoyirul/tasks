/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Soal1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = {{10,25,20,25},{15,23,15,25},{12,12,19,23},{13,10,28,20}};
        double total = 0;
        
        // menjumlahkan baris
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Banyaknya kue yang dijual pada setiap kantin di gedung 1 sampai 4");
        System.out.println("-----------------------------------------------------------------");
        for (int baris = 0; baris < x.length; baris++){ 
            double jumlah = 0;
            //inisialisasi jumlah total elemen per-kolom 
            for (int kolom = 0; kolom < x[0].length; kolom++) {
                jumlah += x[baris][kolom];
            }
            total += jumlah;
            System.out.println("Jumlah untuk Gedung " + (baris+1) + " \t: " + jumlah); 
        }
        System.out.println("-------------------------------");
        System.out.printf("Total semuanya \t\t: %.2f \n", total);
    }
}
