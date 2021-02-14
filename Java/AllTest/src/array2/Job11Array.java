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
public class Job11Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = {{10,25,20,25},{15,23,15,25},{12,12,19,23},{13,10,28,20}};
        int y = 4;
        double total = 0;
        
//        System.out.print("Masukkan panjang : ");
//        y = sc.nextInt();
        
//        x = new int[y][y];
        
        // input element
//        for(int i = 0;i<x.length;i++){
//            System.out.printf("------------BARIS %d-------------- \n", i);
//            for(int j = 0;j<x[0].length;j++){
//                System.out.printf("Masukkan nilai ke-[%d][%d] : ", i, j);
//                x[i][j] = sc.nextInt();
//            }
//            
//        }
        
        // output
//        for(int i = 0;i<x.length;i++){
//            for(int j = 0;j<x[0].length;j++){
//                System.out.printf("%d ", x[i][j]);
//            }
//            System.out.println("");
//        }
//        System.out.println("------------------------------");
        
        // menjumlahkan kolom
        for (int kolom = 0; kolom < x[0].length; kolom++){ 
            double jumlah = 0;
            //inisialisasi jumlah total elemen per-kolom 
            for (int baris = 0; baris < x.length; baris++) {
                jumlah += x[baris][kolom];
            }
            total += jumlah;
            System.out.println("Jumlah untuk Kue " + kolom + " adalah " + jumlah); 
        } 
        System.out.println("-------------------------------");
        System.out.printf("Total semuanya : %.2f \n", total);
    }
}
