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
public class BubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int y = 4, temp = 0;
        
        arr = new int[y];
        
        for(int i=0;i<arr.length;i++){
            System.out.printf("Masukkan array [%d] : ", i);
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0;i<arr.length;i++){
            for(int j=1;j<(arr.length-i);j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Hasil Sorting");
        
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
