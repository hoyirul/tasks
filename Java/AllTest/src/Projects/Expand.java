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
public class Expand {
    static Scanner input = new Scanner(System.in);
    static String daerah[][] = {{"KD01","Mojokerto"},{"KD02","Banyuwangi"},{"KD03","Solo"},{"",""},{"",""}};
    static String tipe[] = {"Konsumsi","NonKonsumsi"};
    static String jasa[] = {"Regular","Kilat","Express"};
    
    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        System.out.println("1. Daftar Daerah");
        System.out.println("2. Input Daerah");
        System.out.println("3. Daftar Tipe");
        System.out.println("4. Daftar Jasa Pengiriman");
        System.out.println("5. Pengiriman");
        System.out.println("6. Keluar");
        System.out.print("Pilih Nomor : ");
        int pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
            case 1:
                daftardaerah();// untuk memanggil fungsi kota dan menampilkan data kota
                menu(); // agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 2:
                inputdaerah();// untuk memanggil fungsi kota dan menampilkan data jenis
                menu(); // agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 3:
                daftartipe();// untuk memanggil fungsi kota dan menampilkan data jenis
                menu(); // agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 4:
                daftarjasa();// untuk memanggil fungsi kota dan menampilkan data jenis
                menu();// agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 5:
                pengiriman();// untuk memanggil fungsi kota dan menampilkan data jenis
                break;
            default:
                System.out.println("SELESAI");
        }
    }
    
    static void daftardaerah(){
        System.out.println("=====================================");
        System.out.println("NO KODE DAERAH");
        for(int x=0;x<daerah.length;x++){
            System.out.print(x);
            for(int y=0;y<daerah[0].length;y++){
                System.out.print("   " + daerah[x][y] + "  ");
            }
            System.out.println("");
        }
        System.out.println("=====================================");
    }
    
    static void inputdaerah(){
        System.out.println("=====================================");
        System.out.println("MASUKKAN DAERAH KE 4");
        System.out.print("KODE : ");
        daerah[3][0] = input.nextLine();
        System.out.print("DAERAH : ");
        daerah[3][1] = input.nextLine();
        
        System.out.println("MASUKKAN DAERAH KE 5");
        System.out.print("KODE : ");
        daerah[4][0] = input.nextLine();
        System.out.print("DAERAH : ");
        daerah[4][1] = input.nextLine();
        System.out.println("=====================================");
    }
    
    static void daftartipe(){
        System.out.println("=====================================");
        System.out.println("NO TIPE");
        for(int x=0;x<tipe.length;x++){
            System.out.println(x + "   " + tipe[x]);
        }
        System.out.println("=====================================");
    }
    
    static void daftarjasa(){
        System.out.println("=====================================");
        System.out.println("NO JASA");
        for(int x=0;x<jasa.length;x++){
            System.out.println(x + "   " + jasa[x]);
        }
        System.out.println("=====================================");
    }
    
    static void pengiriman(){
        daftardaerah();
        System.out.println("Pilih Daerah Tujuan");
        System.out.print("Masukkan Nomor Daerah : ");
        int pilihdaerah = input.nextInt();
        input.nextLine();
        System.out.print("Daerah Asal : ");
        String asal = input.nextLine();
        
        switch(pilihdaerah){
            case 0:
                informasibarang(pilihdaerah, asal);
                break;
            case 1:
                informasibarang(pilihdaerah, asal);
                break;
            case 2:
                informasibarang(pilihdaerah, asal);
                break;
            case 3:
                informasibarang(pilihdaerah, asal);
                break;
            case 4:
                informasibarang(pilihdaerah, asal);
                break;
            default:
                System.out.println(pilihdaerah + " Tidak Ada");
        }
    }
    
    static void informasibarang(int daerahtujuan, String daerahasal){ // x sebagai parameter untuk menerima pilih, y sbg menerima asal
        //System.out.println("Daerah Asal    : " + daerahasal);
        //System.out.println("Daerah Tujuan  : " + daerah[daerahtujuan][1]);
        double hargajasa = 0, total = 0;
        System.out.print("Nama Barang  : ");
        String namabarang = input.nextLine();
        System.out.print("Berat barang : ");
        int beratbarang = input.nextInt();
        double biayaberat = 0;
        if(beratbarang > 15){
            biayaberat = 20000;
        }else{
            biayaberat = 10000;
        }
        daftartipe();
        System.out.print("Pilih no Tipe Barang (nomor) : ");
        int pilihtipe = input.nextInt();
        double hargatipe = 0;
        if(pilihtipe == 0){
            hargatipe = 4000;
        }else if(pilihtipe == 1){
            hargatipe = 6000;
        }
        
        daftarjasa();
        System.out.println("Pilih Jenis Jasa ");
        System.out.print("Pilih no Jenis Jasa : ");
        int jenisjasa = input.nextInt();
        hargajasa = biayajasa(jenisjasa);
        
        System.out.println("DETAIL PENGIRIMAN");
        System.out.println("===============================");
        System.out.println("RESI          : AKAN KELUAR SETALAH BAYAR");
        System.out.println("Daerah Asal     : " + daerahasal);
        System.out.println("Daerah Tujuan   : " + daerah[daerahtujuan][1]);
        System.out.println("Nama Barang   : " + namabarang);
        System.out.println("Berat Barang  : " + beratbarang);
        System.out.println("Tipe Barang  : " + tipe[pilihtipe]);
        System.out.println("Tipe Jasa : " + jasa[jenisjasa]);
        System.out.println("-------------------------------");
        System.out.println("Biaya Berat   : " + biayaberat);
        System.out.println("Biaya tipe   : " + hargatipe);
        System.out.println("Biaya Jasa : " + hargajasa);
        System.out.println("-------------------------------");
        total = biayaberat + hargatipe + hargajasa;
        System.out.println("Total         : " + total);
        System.out.println("-------------------------------");
        checkout(total, daerahasal, daerahtujuan);
    }
    
    static double biayajasa(int x){
        double biayajasa = 0;
        if(x == 0){
            biayajasa = 15000;
        }else if(x == 1){
            biayajasa = 25000;
        }else{
            biayajasa = 35000;
        }
        return biayajasa;
    }
    
    static void checkout(double totalharga, String daerahasal, int daerahtujuan){
        System.out.println("CHECKOUT");
        System.out.print("BAYAR : Rp. ");
        double bayar = input.nextDouble();
        input.nextLine();
        if(bayar < totalharga){
            System.out.println("UANG ANDA TIDAK CUKUP");
            checkout(totalharga, daerahasal, daerahtujuan);
        }else{
            System.out.println("CHECKOUT ANDA BERHASIL");
            System.out.println("PENGIRIMAN ANDA AKAN SEGERA DIPROSES");
            menu();
        }
    }
}