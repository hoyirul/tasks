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
public class ProjectTest {
    static Scanner sc = new Scanner(System.in);
    //static String[][] arrNasabah = new String[0][0];
    static String[][] arrNasabah = {{"112","Andi","mlg"},{"221","Boni","bws"}};
    //static double arrSaldo[];
    //static int codeUser[];
    static long arrSaldo[] = {0,0};
    static int codeUser[] = {123456,654321};

    public static void main(String[] args) {
        loginOption();
    }
    
    static void loginOption(){
        System.out.println(".:: MASUK SEBEGAI ::.");
        System.out.println("1. Admin Bank");
        System.out.println("2. Nasabah");
        System.out.print("o> ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option){
            case 1:
                loginAdmin();
                break;
            case 2:
                loginNasabah();
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA");
                loginOption();
        }
    }
    
    static void loginAdmin(){
        String username = "admin", password = "admin";
        System.out.println(".:: LOGIN ADMIN BANK ::.");
        
        System.out.print("USERNAME -> ");
        String user = sc.nextLine();
        System.out.print("PASSWORD -> ");
        String pass = sc.nextLine();
       
        if(user.equals(username) && pass.equals(password)){
            System.out.println("LOGIN BERHASIL");
            menu();
        }else{
            System.out.println("DATA TIDAK ADA / USER & PASSWORD SALAH");
            loginAdmin();
        }
    }
    
    static void menu(){
        System.out.println(".:: FITUR ::.");
        System.out.println("1. LIHAT DATA NASABAH");
        System.out.println("2. INPUT DATA NASABAH");
        System.out.println("3. PILIH JENIS TABUNGAN");
        System.out.println("------------------------");
        System.out.println(".:: FITUR NASABAH::.");
        System.out.println("4. CEK SALDO");
        System.out.println("5. SETOR");
        System.out.println("6. AMBIL");
        System.out.println("7. CETAK RIWAYAT");
        System.out.println("0. KELUAR");
        System.out.print("o> ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option){
            case 1:
                showNasabah();
                break;
            case 2:
                addNasabah();
                break;
            case 3:
                choiceTabungan();
                break;
            case 4:
                checkSaldo();
                break;
            case 5:
                choiceNasabah();
                break;
            case 6:
                reedem();
                break;
            case 7:
                //deposit();
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA");
                loginOption();
        }
    }
    
    static void addNasabah(){
        System.out.print("Jumlah nasabah : ");
        int min = 10;
        int max = 1000000;
        int row = sc.nextInt();
        int col = 3;
        sc.nextLine();
        
        arrNasabah = new String[row][col];
        arrSaldo = new long[row];
        codeUser = new int[row];
        for(int i=0;i<arrNasabah.length;i++){
            System.out.println("Nasabah ke-" + (i+1));
            for(int j=0;j<arrNasabah[0].length;j++){
                if(j == 0){
                    int random_int = (int)(Math.random() * (max - min + 1) + min);
                    codeUser[i] = random_int;
                    System.out.print("KODE   : " + random_int + "\n");
                    System.out.print("PIN    : ");
                    arrNasabah[i][j] = sc.nextLine();
                }else if(j == 1){
                    System.out.print("Nama   : ");
                    arrNasabah[i][j] = sc.nextLine();
                }else{
                    System.out.print("Alamat : ");
                    arrNasabah[i][j] = sc.nextLine();
                }
            }
            System.out.println("");
        }
        
        menu();
    }
    
    static void showNasabah(){
        int emptyArr = arrNasabah.length;
        if(emptyArr == 0){
            System.out.println(".:: MAAF TIDAK ADA DATA ::."); 
            menu();
        }else{
            System.out.println(".:: DATA NASABAH ::.");
            for(int i=0;i<arrNasabah.length;i++){
                for(int j=0;j<arrNasabah[0].length;j++){
                    if(j == 0){
                        System.out.println("--------------------------------");
                        System.out.println("KODE   : " + codeUser[i] + "  ");
                        System.out.println("PIN    : " + arrNasabah[i][j] + "  ");
                    }else if(j == 1){
                        System.out.println("Nama   : " + arrNasabah[i][j] + "  ");
                    }else{
                        System.out.println("Alamat : " + arrNasabah[i][j] + "  ");
                        System.out.println("Saldo  : " + arrSaldo[i] + "  ");
                        System.out.println("--------------------------------");
                    }
                }
                System.out.println("");
            }
            menu();
        }
    }
    
    static void choiceTabungan(){
        
    }
    
    
    // menu nasabah
    static void menuNasabah(){
        System.out.println(".:: FITUR ::.");
        System.out.println("1. CEK SALDO");
        System.out.println("2. SETOR");
        System.out.println("3. AMBIL");
        System.out.println("4. KELUAR");
        System.out.print("o> ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option){
            case 1:
                checkSaldo();
                break;
            case 2:
                //deposit();
                break;
            case 3:
                reedem();
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA");
                loginOption();
        }
        //optionNasabah(option);
    }
    
    static void optionNasabah(int selected){
        switch(selected){
            case 1:
                checkSaldo();
                break;
            case 2:
                reedem();
                break;
            case 3:
                //deposit();
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA");
                loginOption();
        }
    }
    
    static void loginNasabah(){
        System.out.println(".:: MASUKKAN PIN ANDA ::.");
        System.out.print("o> ");
        String pin = sc.nextLine();
        
        int emptyArr = arrNasabah.length;
        if(emptyArr == 0){
            System.out.println(".:: MAAF TIDAK ADA DATA ::.");    
        }else{
            for(int i=0;i<arrNasabah.length;i++){
                for(int j=0;j<arrNasabah[0].length;j++){
                    if(pin.equals(arrNasabah[i][0])){
                        System.out.println("BERHASIL");
                        menuNasabah();
                        break;
                    }else{
                        //System.out.println("PIN SALAH");
                        loginNasabah();
                        break;
                    }
                }
            }
        }
    }
    
    static void checkSaldo(){
        System.out.println("1. Lihat Saldo");
        System.out.println("2. Kembali ke Menu");
        System.out.print("o> ");
        int choice = sc.nextInt();
        //sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("MASUKKAN KODE");
                System.out.print("o> ");
                int keyCode = sc.nextInt();
                int index = 0;
                int found = 0;
                for(int i=0;i<codeUser.length;i++){
                    if(keyCode == codeUser[i]){
                        found++;
                        index = i;
                    }
                }
                if(found > 0){
                    mySaldo(index, keyCode);
                }else{
                    System.out.println("MAAF KODE AKSES SALAH");
                    checkSaldo();
                }
                break;
            case 2:
                menu();
                break;
            default:
                checkSaldo();
        }
    }
    
    static void mySaldo(int index, int code){
        System.out.println(".:: SALDO SAYA ::.");
        //for(int i=0;i<codeUser.length;i++){
            if(code == codeUser[index]){
                System.out.println("--------------------------------");
                System.out.println("Saldo  : " + arrSaldo[index] + "  ");
                System.out.println("--------------------------------");
                checkSaldo();
            }else{
                System.out.println("MAAF KODE AKSES SALAH");
                checkSaldo();
            }
        //}
    }
    
    static void choiceNasabah(){
        System.out.println(".:: PILIH NASABAH ::.");
        System.out.println("MASUKKAN KODE NASABAH");
        System.out.print("o> ");
        int keyCode = sc.nextInt();
        int index = 0;
        int found = 0;
        for(int i=0;i<codeUser.length;i++){
            if(keyCode == codeUser[i]){
                found++;
                index = i;
            }
        }
        
        if(found > 0){
            System.out.println("Masukkan Jumlah Setoran : ");
            System.out.print("o> Rp. ");
            long depo = sc.nextLong();
            deposit(index, depo);
            menu();
        }else{
            System.out.println("MAAF KODE AKSES SALAH");
            menu();
        }
    }
    
    static void reedem(){
        
    }
    
    static double deposit(int index, long depo){
        arrSaldo[index] += depo;
        depo = arrSaldo[index];
        return depo;
    }
    
    static void reports(){
        
    }
}
