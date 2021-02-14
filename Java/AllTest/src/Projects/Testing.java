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
public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataNasabah[][] = new String[0][0]; 
        
        System.out.println(".:: FITUR ::.");
        System.out.println("1. Lihat data nasabah");
        System.out.println("2. Input data nasabah");
        System.out.println("3. pilih jenis tabungan");
        System.out.println("4. Keluar");
        System.out.print("o> ");
        int option = sc.nextInt();
        
        switch(option){
            case 1:
                System.out.println(".:: INPUT DATA NASABAH ::.");
                System.out.print("Berapa nasabah ? ");
                int foo = sc.nextInt();
                dataNasabah = new String[foo][3];
                
                for(int i=0;i<2;i++){
                    System.out.println("Data nasabah ke-" + (i+1));
                    for(int j=0;j<3;j++){
                        System.out.print("Nama : ");
                        dataNasabah[i][j] = sc.next();
                        System.out.print("Alamat : ");
                        dataNasabah[i][j] = sc.next();
                        System.out.print("No Hp : ");
                        dataNasabah[i][j] = sc.next();
                    }
                    System.out.println("");
                }
                break;
            case 2:
                int x = dataNasabah.length;
                if(x > 0){
                    System.out.println(".:: DATA NASABAH ::.");
                    for(int i=0;i<dataNasabah.length;i++){
                        for(int j=0;j<dataNasabah[0].length;j++){
                            System.out.println("Nama : " + dataNasabah[i][j] + " ");
                        }
                    }
                }else{
                    System.out.println("Data tidak ada");
                }
                break;
            case 3:
                
                break;
            default:
                System.out.println("TIDAK ADA PILIHAN");
        }
    }
}
