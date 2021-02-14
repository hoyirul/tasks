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
public class LatihanArr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x;
        int y = 4, a;
        double total = 0, totalBaris = 0, totalKolom = 0;
        String z = "";
        
//        System.out.print("Masukkan panjang : ");
//        y = sc.nextInt();
        
        x = new int[2][y];
        
        // input element
        for(int i = 0;i<x.length;i++){
            System.out.printf("------------BARIS %d-------------- \n", i);
            for(int j = 0;j<x[0].length;j++){
                System.out.printf("Masukkan nilai ke-[%d][%d] : ", i, j);
                x[i][j] = sc.nextInt();
            }
            
        }
        
        // output
        for(int i = 0;i<x.length;i++){
            for(int j = 0;j<x[0].length;j++){
                System.out.printf("%d ", x[i][j]);
            }
            System.out.println("------------------------------");
            System.out.println("");
        }
        
        // menjumlahkan baris
        for (int baris = 0; baris < x.length; baris++){ 
            double jumlah = 0;
            //inisialisasi jumlah total elemen per-kolom 
            for (int kolom = 0; kolom < x[0].length; kolom++) {
                jumlah += x[baris][kolom];
            }
            totalBaris += jumlah;
            System.out.println("Jumlah untuk baris " + baris + " adalah " + jumlah + " Jumlah semuanya " + totalBaris);
            System.out.println("---------------------------------------------------------");
        } 
        
        // menjumlahkan kolom
        for (int kolom = 0; kolom < x[0].length; kolom++){ 
            double jumlah = 0;

            //inisialisasi jumlah total elemen per-kolom 
            for (int baris = 0; baris < x.length; baris++) {
                jumlah += x[baris][kolom];
            }
            totalKolom += jumlah;
            System.out.println("Jumlah untuk kolom " + kolom + " adalah " + jumlah + " Jumlah semuanya " + totalKolom); 
        } 
//        for (int j = 0; j < x[0].length; j++){ 
//            //inisialisasi jumlah total elemen per-kolom 
//            for (int i = 0; i < x.length; i++) total += x[i][j];
//            System.out.println("Jumlah untuk kolom " + j + " adalah " + total); 
//        }
        
//        System.out.printf("Nilai terkecil adalah %d berada di elemen ke [%d][%d] \n", min, location1, location2);
//        System.out.printf("Nilai terkecil adalah %d jumlahnya %d dan berada di elemen ke [%d][%d] \n", min, x.length, location1, location2);
//        System.out.printf("Total (%s) \n", total);
    }
}
