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
import java.text.DecimalFormat;
public class Currentcy {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,##0.00");
        double price = 100000000;
        
        System.out.println("Price : " + f.format(price));
        
    }
}
