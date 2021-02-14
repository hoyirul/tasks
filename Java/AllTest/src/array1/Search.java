/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int y = 4, hasil = 0, key = 0;
        
        arr = new int[y];
        
        for(int i=0;i<arr.length;i++){
            System.out.printf("Masukkan array [%d] : ", i);
            arr[i] = sc.nextInt();
        }
        
        System.out.printf("Cari nilai array : ");
        key = sc.nextInt();
        
        for(int i = 0;i<arr.length;i++){
            if(key == arr[i]){
                hasil = i;
                break;
            }
        }
        System.out.println("Key anda : " + key);
        System.out.println("Key ada di array ke : " + hasil);
    }
}
