/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class TestUas {
    public static void main(String[] args) {
        
        int x=5,y=7,z=0, hasil = 0;
        if(x>y && x>z){
            hasil=(x+1)*z;
        }else if(y>x && y>z){
            hasil=(y+2)*x;
        }else{
            hasil=(z+3)*y;
        }
        System.out.println(hasil);
        
    }
}
