import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah tanah : ");
        int n = sc.nextInt();
        Tanah[] tanahArray = new Tanah[n];
        
        for(int i=0;i<n;i++){
            System.out.println("TANAH ke-" + (i+1));
            System.out.print("Panjang = ");
            tanahArray[i].panjang =  sc.nextInt();
            System.out.print("Lebar   = ");
            tanahArray[i].lebar =  sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            System.out.println("Luas = " + tanahArray[i].luas());
        }
    }
}