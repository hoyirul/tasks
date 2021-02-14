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
public class ArrTesting {
    public static void main(String[] args) {
        int ar[][] = {
            {1,2,4,5},
            {3,2,0,1},
            {4,5,1,2}
        };
        
        int x = 0;
        int y = 0;
        
        for(int i = 0;i<ar.length;i++){
            for(int j = 0;j<ar[0].length;j++){
                x = j;
                if(j > y){
                    y = j;
                }
            }
        }
        
        System.out.println(x + " : " + y);
    }
}
