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
public class Aida {
    static Scanner sc = new Scanner(System.in);
    
    static String barang[][] = {
            //kode //nama brg    //index
            {"A001","KABEL LAN "},//0
            {"A002","LAPTOP    "},//1
            {"A003","TABLET    "},//2
            {"A004","LAMPU     "},//3
            {"",""},//4
            {"",""},//5
            //anggap index itu sebagai penanda barang (ID)
        };
    // jadi stok 20 punya si barang mie sedap karena indexnya 0
    // jadi stok 22 punya si barang roti bakar karena indexnya 1
    // dst
    static String[] pinjam = {"","","","","","","",""};
    static int[] tgl = {0,0,0,0,0,0,0,0};
    static int[] indexPinjam = {0,0,0,0,0,0,0,0};
    
    public static void main(String[] args) {
        // punyamu kan ada di main
        navigasiMenu();
    }
    
    static void navigasiMenu(){
        System.out.println("1. Lihat data barang");
        System.out.println("2. Input data barang");
        System.out.println("3. Peminjaman");
        System.out.println("4. Denda / Perpanjangan");
        System.out.println("5. Pengembalian");
        System.out.println("6. Pencarian");
        System.out.println("7. Laporan");
        System.out.println("0. KELUAR");
        System.out.print("PILIH (angka) : ");
        int pilih = sc.nextInt();
        sc.nextLine();
        
        switch(pilih){
            case 1:
                dataBarang();
                navigasiMenu();
                break;
            case 2:
                inputDataBarang();
                navigasiMenu();
                break;
            case 3:
                dataBarang();
                pinjamBarang();
                break;
            case 4:
                kembalikanBarang();
                break;
            case 5:
                dataBarang();
                System.out.print("Masukkan kode : ");
                String key = sc.nextLine();
                search(key);
                navigasiMenu();
                break;
            case 6:
                //lihatDataBarang();
                break;
            default:
                System.out.println("KELUAR");
                
        }
    }
    
    static void dataBarang(){
        System.out.println("INDEX   KODE   NAMA   STOK");
        for(int i=0;i<barang.length;i++){
            System.out.print("  " + i + "     ");
            for(int j=0;j<barang[0].length;j++){
                System.out.print(barang[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    
    static void inputDataBarang(){
        for(int i=barang.length-2;i<barang.length;i++){
            for(int j=0;j<barang[0].length;j++){
                if(j == 0){
                    System.out.print("INPUT KODE BARANG : ");
                    barang[i][j] = sc.nextLine();
                }else{
                    System.out.print("INPUT NAMA BARANG : ");
                    barang[i][j] = sc.nextLine();
                }
            }
            System.out.println("");
        }
    }
    
    static void dataPeminjam(){
        System.out.println("Nama   TGL    IndexPinjam");
        for(int a=0;a<pinjam.length;a++){
            System.out.println(pinjam[a] + "  " + tgl[a] + "  " + indexPinjam[a]);
        }
    }
    
    static void pinjamBarang(){
        System.out.println("Pilih index barang yang di pinjam ");
        System.out.print("Pilih : ");
        int index = sc.nextInt();
        System.out.println("Masukkan tanggal pinjam ");
        System.out.print("Tanggal : ");
        int tanggal = sc.nextInt();
    }
    
    static void kembalikanBarang(){
        
    }
    
    static double denda(int denda){
        return 0;
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
    
    // CARA PEMANGGILAN
    static void menu(){
        int x = 0;
        switch(x){
            case 1:
                int tanggal, bts;
                System.out.println("Masukkan tanggal : ");
                tanggal = sc.nextInt();
                System.out.println("Masukkan batas   : ");
                bts = sc.nextInt();
                peminjaman(tanggal, bts); // fungsi yang ada parameter
                break;
            case 2:
                peminjaman2(); // fungsi yangtidak ada parameter
                break;
        }
    }
    
    static void peminjaman(int tanggal, int bts){
        System.out.println(tanggal + " " +  bts);
    }
    
    static void peminjaman2(){
        int tanggal, bts;
        System.out.println("Masukkan tanggal : ");
        tanggal = sc.nextInt();
        System.out.println("Masukkan batas   : ");
        bts = sc.nextInt();
        System.out.println(tanggal + " " +  bts);
    }
}
