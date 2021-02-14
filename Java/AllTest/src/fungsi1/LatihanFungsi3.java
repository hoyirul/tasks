/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi1;

/**
 *
 * @author irulg
 */

import java.util.Scanner;
public class LatihanFungsi3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String arrName[];
        double score[];
        double total = 0, avg;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();
        
        arrName = new String[n];
        score = new double[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Masukkan nama mahasiswa : ");
            arrName[i] = sc.next();
            
            System.out.print("Masukkan nilai mahasiswa : ");
            score[i] = sc.nextDouble();
            System.out.println("--------------------------");
            total += score[i];
        }
        
        // fungsi menampilkan data mahasiswa
        dataMhs(arrName);
        
        System.out.println("------------------------");
        // fungsi rerata
        avg = avgScore(total, score);
        System.out.println("Nilai rata-rata kelas : " + avg);
    }
    
    static void dataMhs(String[] data){
        System.out.println(".:: Daftar Mahasiswa ::.");
        for(int i=0;i<data.length;i++){
            System.out.println((i+1) + ". " + data[i] + " ");
        }
    }
    
    static double avgScore(double total, double[] score){
        double avg = total/score.length;
        return avg;
    }
}