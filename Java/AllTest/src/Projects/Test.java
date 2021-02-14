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
import java.util.Arrays;
import java.util.Scanner;
public class Test {
    static Scanner sc = new Scanner(System.in);
    static String[] nasabah = {"Test"};
    public static void main(String[] args) {
        String[] array1 = new String[]{"one", "two"};
        String[] array2 = new String[]{"three"};
        String[] array = new String[array1.length + array2.length];
        System.out.println(Arrays.toString(array));
//        System.arraycopy(array1, 0, array, 0, array1.length);
//        System.arraycopy(array2, 0, array, array1.length, array2.length);
        
//        option(nasabah);
    }
    
    static void option(String[] arrData){
        System.out.println("1. Data nasabah");
        System.out.println("2. Tambah data nasabah");
        System.out.print("o> ");
        int x = sc.nextInt();
        
        switch(x){
            case 1:
                showNasabah(arrData);
                break;
            case 2:
                addNasabah(arrData);
                break;
        }
    }
    
    static void showNasabah(String[] arrData){
        System.out.println(" name " + arrData.length);
//        int x = arrData.length;
//        if(x <= 0){
//            System.out.println("Please input data first!!");
//        }else{
//            for(int i=0;i<arrData.length;i++){
//                System.out.println((i+1) + ". " + arrData[i]);
//            }   
//        }
        option(arrData);
    }
    
    static void addNasabah(String[] arrData){
        int y = arrData.length;
        for(int i=y;i>0;i--){
            System.out.print("Nama nasabah : ");
            arrData[i] = sc.next();
        }
        option(arrData);
    }
}
