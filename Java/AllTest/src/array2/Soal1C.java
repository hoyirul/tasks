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
public class Soal1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = {{10,25,20,25},{15,23,15,25},{12,12,19,23},{13,10,28,20}}; // deklarasi variable array x
        int y = 4; // panjang / length (baris dan kolom)
        double total = 0, subtotal = 0; // total dan subtotal
        
        //System.out.print("Masukkan panjang : ");
        //y = sc.nextInt();
        
        //x = new int[y][y]; // instansiasi var x
        
        // input element berdasarkan length x
//        for(int i = 0;i<x.length;i++){ 
//            System.out.printf("--------- GEDUNG %d --------- \n", i+1);
//            for(int j = 0;j<x[0].length;j++){
//                if(j == 0){
//                    System.out.printf("Masukkan qty Panckage \t: ");
//                }else if(j == 1){
//                    System.out.printf("Masukkan qty Puding \t: ");
//                }else if(j == 2){
//                    System.out.printf("Masukkan qty Rainbow \t: ");
//                }else{
//                    System.out.printf("Masukkan qty Bakpao \t: ");
//                }
//                x[i][j] = sc.nextInt(); //inputan x
//            }
//            System.out.println("");
//        }
        
        // menjumlahkan perbaris
        for (int baris = 0; baris < x.length; baris++){
            double sumSubtotal = 0; // inisialisasi sumSubtotal agar pergedung bisa di ketahui jumlahnya
            
            System.out.println("----------- Total Di Gedung " + (baris+1) + " ----------- ");
            
            for (int kolom = 0; kolom < x[0].length; kolom++) {
                if(kolom == 0){
                    subtotal = x[baris][kolom] * 3000;
                    System.out.println("Jumlah Panckage : " + x[baris][kolom] + " x " + 3000 + " = Rp. " + subtotal);
                }else if(kolom == 1){
                    subtotal = x[baris][kolom] * 2500;
                    System.out.println("Jumlah Puding \t: " + x[baris][kolom] + " x " + 2500 + " = RP. " + subtotal);
                }else if(kolom == 2){
                    subtotal = x[baris][kolom] * 4000;
                    System.out.println("Jumlah Rainbow \t: " + x[baris][kolom] + " x " + 4000 + " = Rp. " + subtotal);
                }else{
                    subtotal = x[baris][kolom] * 4500;
                    System.out.println("Jumlah Bakpao \t: " + x[baris][kolom] + " x " + 4500 + " = Rp. " + subtotal);
                }
                sumSubtotal += subtotal; // total pergedung di sum/jumlahkan
            }
            total += sumSubtotal;
            System.out.println("-----------------------------------------");
            System.out.println("Total Gedung " + (baris+1) + "\t:\t     Rp. " + sumSubtotal);
            System.out.println("----------------------------------------- \n");
        }
        
        System.out.println("------------- TOTAL SEMUANYA -------------");
        System.out.printf("Total semuanya : Rp. %.2f \n", total);
    }
}