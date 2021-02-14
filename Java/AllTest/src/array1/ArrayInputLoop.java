package array1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class ArrayInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] finalScore = new int[6];
        
        for(int i = 0; i < finalScore.length;i++){
            System.out.print("Enterthe final score " + i + ": ");
            finalScore[i] = sc.nextInt();
        }
        
        for(int i =0;i < finalScore.length;i++){
            if(finalScore[i] > 70){
                System.out.println("Student " + i + " Passed ");
            }else{
                System.out.println("Student " + i + " Failed ");
            }
        }
    }
}
