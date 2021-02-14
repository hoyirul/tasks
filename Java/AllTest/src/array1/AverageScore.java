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
public class AverageScore {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countStudent;
        
         System.out.print("Enter the number of students : ");
         countStudent = sc.nextInt();
        
        int[] score = new int[countStudent];
        double total = 0, average;
        
        for(int i = 0; i < score.length;i++){
            System.out.print("Enter student score " + (i+1) + ": ");
            score[i] = sc.nextInt();
        }
        
        for(int i =0;i < score.length;i++){
            total += score[i];
        }
        average = total / score.length;
         System.out.println("The Class everage score is " + average);
    }
}
