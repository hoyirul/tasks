/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author irulg
 */
public class QuizElsa {
    public static void main(String[] args) {
        char[][] arr = {
            {'I','N','F','O','R'},
            {'M','A','T','I','K'},
            {'A','P','O','L','I'},
            {'N','E','M','A','E'},
        };
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 'R'){
                    System.out.print(arr[i][j] + " adalah huruf besar (secara abjad) untuk baris 1 kolom 5 \n");
                }else if(arr[i][j] == 'T'){
                    System.out.print(arr[i][j] + " adalah huruf besar (secara abjad) untuk baris 2 kolom 3 \n");
                }else if(arr[i][j] == 'P'){
                    System.out.print(arr[i][j] + " adalah huruf besar (secara abjad) untuk baris 3 kolom 2 \n");
                }else if(arr[i][j] == 'N'){
                    System.out.print(arr[i][j] + " adalah huruf besar (secara abjad) untuk baris 4 kolom 1 \n");
                }
            }
//            System.out.println("");
        }
    }
}
