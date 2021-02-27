import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int n = sc.nextInt();
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("NAMA = ");
            arrayMahasiswa[i].nama = sc.nextLine();
            System.out.print("NIM  = ");
            arrayMahasiswa[i].nim = sc.nextLine();
            System.out.print("JK   = ");
            arrayMahasiswa[i].jenis_kelamin = sc.next().charAt(0);
            System.out.print("IPK  = ");
            arrayMahasiswa[i].ipk = sc.nextDouble();
        }
        
        System.out.println("");
        
        for(int i=0;i<n;i++){
            System.out.println("Mahasiswa ke " + (i+1));
            System.out.println("Nama  = " + arrayMahasiswa[i].nama);
            System.out.println("NIM   = " + arrayMahasiswa[i].nim);
            System.out.println("JK    = " + arrayMahasiswa[i].jenis_kelamin);
            System.out.println("IPK   = " + arrayMahasiswa[i].ipk);
        }
    }
}
