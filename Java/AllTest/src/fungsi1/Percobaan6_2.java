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
public class Percobaan6_2 {
    
    static int calculateArea(int lgt, int wdt){
        int a = lgt * wdt;
        return a;
    }
    
    static int calculateVolume(int hgt, int a, int b){
        int vol = calculateArea(a, b) * hgt;
        return vol;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, height, area, volume;
        
        System.out.print("Enter a length value : ");
        length = input.nextInt();
        System.out.print("Enter a width value : ");
        width = input.nextInt();
        System.out.print("Enter a height value : ");
        height = input.nextInt();
        
        area = calculateArea(length, width);
        System.out.println("Area of rectangle is : " + area);
        volume = calculateVolume(height, length, width);
        System.out.println("Volume of block is : " + volume);
    }
}
