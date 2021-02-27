import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Balok[] arrayBalok = new Balok[1];
        Bola[] arrayBola = new Bola[1];
        Kubus[] arrayKubus = new Kubus[1];
        
        int i = 0;
        while(i<1){
            System.out.println("BALOK");
            System.out.print("Input Panjang  = ");
            arrayBalok[i].panjang = sc.nextDouble();
            System.out.print("Input Lebar    = ");
            arrayBalok[i].lebar = sc.nextDouble();
            System.out.print("Input Tinggi   = ");
            arrayBalok[i].tinggi = sc.nextDouble();

            System.out.println("KUBUS");
            System.out.print("Input Sisi = ");
            arrayKubus[i].sisi = sc.nextDouble();

            System.out.println("BOLA"); 
            System.out.print("Input Jari-jari = ");
            arrayBola[i].r = sc.nextDouble();
            i++;
        }
        
        int i = 0;
        while(i<1){
            System.out.println("BALOK");
            System.out.println("Volume  : " + arrayBalok[i].volume());
            System.out.println("Luas Alas  : " + arrayBalok[i].luasAlas());
   
            System.out.println("KUBUS");
            System.out.println("Volume  : " + arrayKubus[i].volume());
            System.out.println("Luas Alas  : " + arrayKubus[i].luasAlas());
         
            System.out.println("BOLA");
            System.out.println("Volume  : " + arrayBola[i].volume());
            System.out.println("Luas Alas  : " + arrayBola[i].luasAlas());
            i++;
        }
    }
}