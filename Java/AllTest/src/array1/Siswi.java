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
public class Siswi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no[] = {101,202,230};
        int x = no.length;
        int y = no.length + 1;
        
//        no = new int[y];
//        for(int i=x;i<no.length;i++){
//            System.out.print("INPUT NILAI ke-" + i + " : ");
            no[3] = 1233;
//        }
        
        for(int i=0;i<no.length;i++){
            System.out.println(i + ". " + no[i]);
        }
        
    }
}
