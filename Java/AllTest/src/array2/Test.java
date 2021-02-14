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
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x;
        int y, min, location1 = 0, location2 = 0;
        String z = "";
        
        System.out.print("Masukkan panjang : ");
        y = sc.nextInt();
        
        x = new int[y][y];
        
        for(int i = 0;i<x.length;i++){
            for(int j = 0;j<x.length;j++){
                System.out.printf("Masukkan nilai ke-[%d][%d] : ", i, j);
                x[i][j] = sc.nextInt();
            }
            System.out.println("----------------------------------");
        }
        
        min = x[0][0];
        
        for (int i = 0;i<x.length;i++) {
            for (int j = 0; j<x.length; j++) {
                if(x[i][j] < min){
                    min = x[i][j];
                    location1 = i;
                    location2 = j;
                }else if(x[i][j] == 50){
                    z = "ADA";
                }else{
                    z = "TIDAK ADA";
                }
            }
        }
        
        System.out.printf("Nilai terkecil adalah %d berada di elemen ke [%d][%d] \n", min, location1, location2);
        System.out.printf("Nilai terkecil adalah %d jumlahnya %d dan berada di elemen ke [%d][%d] \n", min, x.length, location1, location2);
        System.out.printf("Nilai 50 ? (%s) \n", z);
    }
}
