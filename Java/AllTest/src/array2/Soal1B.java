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
public class Soal1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = {{10,25,20,25},{15,23,15,25},{12,12,19,23},{13,10,28,20}};
        double total = 0;
        
        // menjumlahkan kolom
        for (int kolom = 0; kolom < x[0].length; kolom++){ 
            double jumlah = 0;
            //inisialisasi jumlah total elemen per-kolom 
            for (int baris = 0; baris < x.length; baris++) {
                jumlah += x[baris][kolom];
            }
            
            total += jumlah;
            
            if(kolom == 0){
                System.out.println("Jumlah untuk Panckage \t: " + jumlah); 
            }else if(kolom == 1){
                System.out.println("Jumlah untuk Puding \t: " + jumlah); 
            }else if(kolom == 2){
                System.out.println("Jumlah untuk Rainbow \t: " + jumlah); 
            }else{
                System.out.println("Jumlah untuk Bakpao \t: " + jumlah); 
            }
        } 
        System.out.println("-------------------------------");
        System.out.printf("Total semuanya \t\t: %.2f \n", total);
    }
}
