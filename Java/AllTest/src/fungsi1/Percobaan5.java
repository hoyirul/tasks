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
public class Percobaan5 {
    static void Print(String str, int... a){
        System.out.println("String : " + str);
        System.out.println("Number of parameter : " + a.length);
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Print("Basic programming", 85, 90);
        Print("Information Technology", 1,2,3,4,5);
        Print("Politeknik Negeri Malang");
    }
}
