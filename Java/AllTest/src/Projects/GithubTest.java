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
public class GithubTest {
private static String nama;
private int jumlah;
private int saldo;

public GithubTest(String namaNasabah, int jumlah){
    nama = namaNasabah;
    nama ="wanda";
    saldo = 1000000;

}

public void nabung(int sal){
    saldo = saldo + sal;
}

public void ambilUang(int jumlahTarikan){
    saldo = saldo - jumlahTarikan;
}

public int ambilSaldo(){
    return saldo;
}

public void setSaldo(int sal){
    saldo = sal;
}



public static void main(String[] args) {
    
    int jumlahSimpanan = 500000;
    int jumlahTarikan = 200000;
    
    GithubTest bls = new GithubTest("wanda",12345);

    System.out.println("Nama Nasabah             : " + nama);
    System.out.println("Saldo awal               : " + "Rp." + bls.ambilSaldo());
    System.out.println("\nJumlah penyetoran        : " + "Rp." + jumlahSimpanan);
    bls.nabung(jumlahSimpanan);
    System.out.println("Saldo setelah penyetoran : " + "Rp." + bls.ambilSaldo());
    System.out.println("\nJumlah Penarikan         : " + "Rp." + jumlahTarikan);
    bls.ambilUang(jumlahTarikan);
    System.out.println("Saldo setelah penarikan  : " + "Rp." + bls.ambilSaldo());

    }

}
