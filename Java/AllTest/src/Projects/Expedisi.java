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
public class Expedisi {
    static Scanner input = new Scanner(System.in);
    static String prov[][] = {{"KD01","Malang"},{"KD02","Jakarta"},{"KD03","Surabaya"},{"",""},{"",""}};
    static String tipebarang[] = {"Konsumsi","NonKonsumsi"};
    static String tipepengiriman[] = {"Regular","Kilat","Express"};
    
    public static void main(String[] args) {
        daftar();
    }
    
    static void daftar(){
        System.out.println("1. Daftar Kota");
        System.out.println("2. Input Kota");
        System.out.println("3. Daftar Jenis");
        System.out.println("4. Daftar Layanan Pengiriman");
        System.out.println("5. Pengiriman");
        System.out.println("6. Keluar");
        System.out.print("Pilih angka : ");
        int pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
            case 1:
                daftarkota();// untuk memanggil fungsi kota dan menampilkan data kota
                daftar(); // agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 2:
                inputkota();// untuk memanggil fungsi kota dan menampilkan data jenis
                daftar(); // agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 3:
                daftarjenis();// untuk memanggil fungsi kota dan menampilkan data jenis
                daftar(); // agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 4:
                daftarlayanan();// untuk memanggil fungsi kota dan menampilkan data jenis
                daftar();// agar setelah melihat daftar kota bisa kembali lagi ke fungsi daftar
                break;
            case 5:
                pengiriman();// untuk memanggil fungsi kota dan menampilkan data jenis
                break;
            default:
                System.out.println("SELESAI");
        }
    }
    
    static void daftarkota(){
        System.out.println("=====================================");
        System.out.println("NO  KODE   KOTA");
        for(int x=0;x<prov.length;x++){
            System.out.print(x);
            for(int y=0;y<prov[0].length;y++){
                System.out.print("   " + prov[x][y] + "  ");
            }
            System.out.println("");
        }
        System.out.println("=====================================");
    }
    
    static void inputkota(){
        System.out.println("=====================================");
        System.out.println("INPUT KOTA KE 4");
        System.out.print("KODE : ");
        prov[3][0] = input.nextLine();
        System.out.print("KOTA : ");
        prov[3][1] = input.nextLine();
        
        System.out.println("INPUT KOTA KE 5");
        System.out.print("KODE : ");
        prov[4][0] = input.nextLine();
        System.out.print("KOTA : ");
        prov[4][1] = input.nextLine();
        System.out.println("=====================================");
    }
    
    static void daftarjenis(){
        System.out.println("=====================================");
        System.out.println("NO  JENIS");
        for(int x=0;x<tipebarang.length;x++){
            System.out.println(x + "   " + tipebarang[x]);
        }
        System.out.println("=====================================");
    }
    
    static void daftarlayanan(){
        System.out.println("=====================================");
        System.out.println("NO  LAYANAN");
        for(int x=0;x<tipepengiriman.length;x++){
            System.out.println(x + "   " + tipepengiriman[x]);
        }
        System.out.println("=====================================");
    }
    
    static void pengiriman(){
        daftarkota();
        System.out.println("Pilih kota tujuan");
        System.out.print("Masukkan Nomor kota : ");
        int kemana = input.nextInt();
        input.nextLine();
        System.out.print("Kota Asal : ");
        String darimana = input.nextLine();
        
        switch(kemana){
            case 0:
                informasibarang(kemana, darimana);
                break;
            case 1:
                informasibarang(kemana, darimana);
                break;
            case 2:
                informasibarang(kemana, darimana);
                break;
            case 3:
                informasibarang(kemana, darimana);
                break;
            case 4:
                informasibarang(kemana, darimana);
                break;
            default:
                System.out.println(kemana + " Tidak ada");
        }
    }
    
    static void informasibarang(int kotatujuan, String kotaasal){ // x sebagai parameter untuk menerima pilih, y sbg menerima asal
        // nama variabel di ganti
        double biayaberat = 0, hargajenis = 0;
        System.out.print("Nama Barang  : ");
        String namabarang = input.nextLine();
        System.out.print("Berat barang : ");
        int beratbarang = input.nextInt();
        if(beratbarang < 8){
            biayaberat = 7000;
        }else{
            biayaberat = 14000;
        }
        daftarjenis();
        System.out.print("Pilih no jenis barang (angka) : ");
        int pilihjenis = input.nextInt();
        if(pilihjenis == 0){
            hargajenis = 4000;
        }else if(pilihjenis == 1){
            hargajenis = 6000;
        }
        
        daftarlayanan();
        System.out.println("Pilih Jenis layanan ");
        System.out.print("Pilih no jenis layanan : ");
        int jenislayanan = input.nextInt();
        double hargalayanan = biayalayanan(jenislayanan);
        
        System.out.println("DETAIL PENGIRIMAN");
        System.out.println("===============================");
        System.out.println("RESI          : AKAN KELUAR SETALAH BAYAR");
        System.out.println("Kota Asal     : " + kotaasal);
        System.out.println("Kota Tujuan   : " + prov[kotatujuan][1]);
        System.out.println("Nama Barang   : " + namabarang);
        System.out.println("Berat Barang  : " + beratbarang);
        System.out.println("Jenis Barang  : " + tipebarang[pilihjenis]);
        System.out.println("Jenis Layanan : " + tipepengiriman[jenislayanan]);
        System.out.println("-------------------------------");
        System.out.println("Biaya Berat   : " + biayaberat);
        System.out.println("Biaya Jenis   : " + hargajenis);
        System.out.println("Biaya Layanan : " + hargalayanan);
        System.out.println("-------------------------------");
        double total = biayaberat + hargajenis + hargalayanan;
        System.out.println("Total         : " + total);
        System.out.println("-------------------------------");
        pembayaran(total, kotaasal, kotatujuan);
    }
    
    static double biayalayanan(int x){
        double biayalayanan = 0;
        if(x == 0){
            biayalayanan = 13000;
        }else if(x == 1){
            biayalayanan = 20000;
        }else{
            biayalayanan = 30000;
        }
        return biayalayanan;
    }
    
    static void pembayaran(double totalbiaya, String kotaasal, int kotatujuan){
        System.out.println("PEMBAYARAN");
        System.out.print("BAYAR : Rp. ");
        double bayar = input.nextDouble();
        input.nextLine();
        if(bayar < totalbiaya){
            System.out.println("UANG ANDA KURANG");
            pembayaran(totalbiaya, kotaasal, kotatujuan);
        }else{
            System.out.println("PEMBYARAN BERHASIL");
            System.out.println("PENGIRIMAN AKAN SEGERA DIPROSES");
            cetak(kotaasal, kotatujuan);
            daftar();
        }
    }

    static void cetak(String kotaasal, int kotatujuan){
        System.out.println("CETAK RESI PENGIRIMAN");
        System.out.println("===============================");
        System.out.println("RESI          : AG03ID29I37J6");
        System.out.println("Kota Asal     : " + kotaasal);
        System.out.println("Kota Tujuan   : " + prov[kotatujuan][1]);
        System.out.println("Nama Barang   : " + namabarang);
        System.out.println("Berat Barang  : " + beratbarang);
        System.out.println("Jenis Barang  : " + tipebarang[pilihjenis]);
        System.out.println("Jenis Layanan : " + tipepengiriman[pilihlayanan]);
        System.out.println("-------------------------------");
        System.out.println("Biaya Berat   : " + biayaberat);
        System.out.println("Biaya Jenis   : " + hargajenis);
        System.out.println("Biaya Layanan : " + hargalayanan);
        System.out.println("-------------------------------");
        total = biayaberat + hargajenis + hargalayanan;
        System.out.println("Total         : " + total);
        System.out.println("-------------------------------");
    }
}
