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
public class NewClass {
    public static void main(String[] args) {
        for (int i = 0; i <10;i++) {
            if (i % 2==0) {
                for (int k = 0;k < i;k++) {
                    System.out.print(i); 
                }
                System.out.println();
            }
        }
    }
}
