/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi1;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Percobaan4 {
    static int multiplication(int c, int d){
        int h;
        h = (c + 10) % (d + 19);
        return h;
    }
    
    static int substraction(int a, int b){
        int x;
        a = a + 7;
        b = b + 4;
        x = multiplication(a, b);
        return x;
    }
    
    public static void main(String[] args) {
        int value1, value2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input value 1 : ");
        value1 = input.nextInt();
        System.out.print("Input value 2 : ");
        value2 = input.nextInt();
        int result = substraction(value1, value2);
        System.out.println("The result is " + result);   
    }
}
