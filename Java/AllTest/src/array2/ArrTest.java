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
public class ArrTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahBaris,jumlahKolom,z,y,baris,kolom,total=0;
        Scanner input = new Scanner (System.in);
        System.out.print("jumlah baris =");
        jumlahBaris=input.nextInt();
        System.out.print("jumlah kolom =");
        jumlahKolom=input.nextInt();
        int[] b = new int[jumlahKolom];
        int[][] a = new int[jumlahBaris][jumlahKolom];
        for (z=0;z<jumlahKolom;z++)
        {
            for (y=0;y<jumlahBaris;y++)
            {
                kolom=z+1;
                baris=y+1;
                System.out.print("input baris ke-"+baris+"kolom ke-"+kolom+":");
                a[y][z]=input.nextInt();
                
            }
            System.out.print("\n");
        }
        for (z=0;z<jumlahKolom;z++)
        {
            int jum=0;
            for (y=0;y<jumlahBaris;y++)
            {
            jum=jum+a[y][z];   
                
            }
            kolom=z+1;
            
            b[z]=jum;
            total=total+b[z];
            System.out.println("jumlah nilai kolom ke-"+kolom+"="+b[z]);
           
        }
        System.out.println("total nilai semua baris dan kolom = "+total);
        
        
        
         
        
               
    }
    
}
