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
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class ArrList {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        
        keyCode();
        
        int y = 0;
        while(y < 2){
            System.out.print("Nama : ");
            String x = sc.nextLine();
            list.add(x);
            System.out.print("PIN  : ");
            String z = sc.nextLine();
            list.add(z);
            y++;
        }
        
        displaydata(list);
    }

    static void keyCode() {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
          //generate random values from 0-24
        int int_random = rand.nextInt(upperbound); 
        double double_random=rand.nextDouble();
        float float_random=rand.nextFloat();

        System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
        System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
        System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
    }
    
    //create a methode to dispaly values from an arraylist
    public static void displaydata(ArrayList l){
         for(int i = 0; i < l.size(); i++){
           System.out.println("Nama : " + l.get(i));
       }
    }
}
