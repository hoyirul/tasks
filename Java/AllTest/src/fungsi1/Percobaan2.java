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
public class Percobaan2 {
    static void giveGreeting(){
        System.out.println("Hello ! Good morning");
    }
    
    static void saySomething(String expression){
        System.out.println(expression);
    }
    
    public static void main(String[] args) {
        giveGreeting();
        String exp = "Welcome to java programming";
        saySomething(exp);
    }
}

