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
public class Inventory {
    static Scanner sc = new Scanner(System.in); // agar sc bisa gi gunakan oleh semua fungsi
    
    static String barang[][] = {
            //kode //nama brg    //index
            {"B001","MIE SEDAP  "},//0
            {"B002","ROTI BAKAR "},//1
            {"B003","ROTI GANDU "},//2
            {"B004","SIOMAY ENA "},//3
            {"",""},//4
            {"",""},//5
            //anggap index itu sebagai penanda barang (ID)
        };
    // jadi stok 20 punya si barang mie sedap karena indexnya 0
    // jadi stok 22 punya si barang roti bakar karena indexnya 1
    // dst
    static int[] stokBarang = {20,22,15,23,0,0};
    static int[] barangMasuk = {4,3,6,5,0,0};
    static int[] barangKeluar = {2,4,1,6,0,0};
    
    public static void main(String[] args) {
        navigasiMenu();
    }
    
    static void navigasiMenu(){
        System.out.println("1. Input data barang");
        System.out.println("2. Input data barang masuk");
        System.out.println("3. Input data barang keluar");
        System.out.println("4. Input data barang rusak");
        System.out.println("5. Pencarian data barang");
        System.out.println("6. Lihat data barang");
        System.out.println("7. Lihat data barang masuk");
        System.out.println("8. Lihat data barang keluar");
        System.out.println("9. Lihat data barang rusak");
        System.out.println("10.Laporan data barang");
        System.out.print("PILIH (angka) : ");
        int pilih = sc.nextInt();
        sc.nextLine();
        
        switch(pilih){
            case 1:
                // input data barang kyk punyamu yg tadi
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                lihatDataBarang();
                System.out.print("Masukkan kode : ");
                String key = sc.nextLine();
                search(key);
                navigasiMenu();
                break;
            case 6:
                lihatDataBarang();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
                
        }
    }
    
    static void search(String key){
        int a = 0, b = 0;
        for(int i=0;i<barang.length;i++){
            for(int j=0;j<barang[0].length;j++){
                if(key.equalsIgnoreCase(barang[i][j])){
                    a++;
                    b = i;
                }
            }
        }
        
        if(a == 1){
            System.out.println("KODE "+ key +" BERHASIL DITEMUKAN");
            //print
            System.out.print(barang[b][0] + "   " + barang[b][1]);
            System.out.println("");
        }else{
            System.out.println("KODE "+ key +" TIDAK DITEMUKAN");
        }
    }
    
    static void lihatDataBarang(){
        System.out.println("KODE   NAMA BRG     STOK");
        for(int i=0;i<barang.length;i++){
            for(int j=0;j<barang[0].length;j++){
                System.out.print(barang[i][j] + "   ");
            }
            System.out.println(stokBarang[i] + " ");
        }
    }
    
    static void lihatDataBarangMasuk(){
        
    }
    
    static void inputDataBarangMasuk(){
        
    }
    
    static int masuk(){
        return 0;
    }
    
    static int keluar(){
        return 0;
    }
}
