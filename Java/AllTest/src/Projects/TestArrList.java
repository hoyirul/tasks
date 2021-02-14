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
import java.util.ArrayList;
import java.util.Arrays;
public class TestArrList {
    static Scanner sc = new Scanner(System.in);
    static int array[] = { 1, 2, 3, 4, 5 };
    static int[] copy;
    public static void main(String[] args) {
        //int[] array = new int[20];
        //Arrays.setAll(array, p -> p > 9 ? 0 : p);
        //int array[] = { 1, 2, 3, 4, 5 };
        menu();
    }
    
    static void menu(){
        System.out.println("MENU");
        System.out.println("1. Lihat User");
        System.out.println("2. Tambah User");
        System.out.println("3. Keluar");
        System.out.print("o> ");
        int x = sc.nextInt();
        switch(x){
            case 1:
                showUser();
                break;
            case 2:
                addUser(1);
                break;
            default:
                System.out.println("Salah");
                
        }
    }
    
    static void addUser(int x){
        System.out.println("TAMBAH USER");
        for(int i=0;i<array.length;i++){
            
        }
        copy = Arrays.copyOf(array, array.length+x);
        
        for(int i=array.length;i<copy.length;i++){
            System.out.print("o> ");
            copy[i] = sc.nextInt();
        }
        menu();
    }
    
    static void showUser(){
        for(int i=0;i<copy.length;i++){
            System.out.print(copy[i] + " ");
        }
        menu();
    }
}
