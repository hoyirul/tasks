/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class TestProjectAll {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] data = {
                {"112321", "CINTYA "},// baris 0 = cintya
                {"112322", "ASW    "},// baris 1 = asw
                {"112323", "ANJG   "},
                {"112324", "BOY    "},
                {"", ""},
                {"", ""}
            };
        
        // kolom => tugas, uas, quis, uts
        double nilai[][] = {
                {0,0,0,0}, //baris 0 = cintya
                {0,0,0,0}, //baris 1 = asw
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
            };
        
        menu(data, nilai);
    }
    
    static void menu(String[][] data, double[][] nilai){
        System.out.println("MENU");
        System.out.println("1. tampil data");
        System.out.println("2. tambah data");
        System.out.println("3. tampil nilai");
        System.out.println("4. tambah nilai");
        System.out.println("5. cari data");
        System.out.print("pilih : ");
        int x = sc.nextInt();
        sc.nextLine();
        
        switch(x){
            case 1:
                tampilData(data, nilai);
                menu(data, nilai);
                break;
            case 2:
                tambahData(data, nilai);
                menu(data, nilai);
                break;
            case 3:
                tampilNilai(data, nilai);
                menu(data, nilai);
                break;
            case 4:
                tambahNilai(data, nilai);
                menu(data, nilai);
                break;
            case 5:
                tampilData(data, nilai);
                System.out.print("Masukkan NIM : ");
                String key = sc.nextLine();
                search(key, data, nilai);
                menu(data, nilai);
                break;
        }
    }
    
    static void tambahData(String[][] data, double[][] nilai){
        for(int i=data.length-2;i<data.length;i++){ // kenapa -2 karena data yg blum terisi index ke 4 dan 5
            for(int j=0;j<data[0].length;j++){
                if(j == 0){
                    System.out.print("NIM  : ");
                    data[i][j] = sc.nextLine();
                }else{
                    System.out.print("NAMA :");
                    data[i][j] = sc.nextLine();
                }
            }
        }
    }
    
    static void tampilData(String[][] data, double[][] nilai){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    static void tampilNilai(String[][] data, double[][] nilai){
        for(int i=0;i<nilai.length;i++){ 
            System.out.print(data[i][1]);
            for(int j=0;j<nilai[0].length;j++){
                System.out.print(nilai[i][j] + "   ");
            }
            System.out.println();
        }
    }
    
    static void tambahNilai(String[][] data, double[][] nilai){
        for(int i=0;i<nilai.length;i++){ 
            for(int j=0;j<nilai[0].length;j++){
                System.out.print("NILAI : ");
                nilai[i][j] = sc.nextDouble();
            }
        }
        sc.nextLine();
    }
    
    static void search(String key, String data[][], double[][] nilai){
        int a = 0, b = 0;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                if(key.equalsIgnoreCase(data[i][j])){
                    a++;
                    b = i;
                }
            }
        }
        
        if(a == 1){
            System.out.println("KODE "+ key +" BERHASIL DITEMUKAN");
            //print
            System.out.print(data[b][0] + "   " + data[b][1]);
            System.out.println("");
        }else{
            System.out.println("KODE "+ key +" TIDAK DITEMUKAN");
        }
    }
}
