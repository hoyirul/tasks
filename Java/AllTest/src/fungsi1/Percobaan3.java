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
public class Percobaan3 {
    static int squareArea(int side){
        int area = side * side;
        return area;
    }
    
    public static void main(String[] args) {
        int a = squareArea(5);
        System.out.println("Area of a square with side = 5 is " + a);
    }
}
