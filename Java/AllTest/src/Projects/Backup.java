/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

/*
RUMUS
dana haji bunga = 6%
konvensional bunga = 2%
Investasi bunga = 8%
tabungan GIRO = 4%

Bunga tabungan : Rp 10.000.000,- X 6% x 30 / 365 = Rp 49.315,-
Bunga sebesar Rp 49.315,- merupakan bunga gross (belum dipotong pajak).
Maka pajak bunga tabungan tersebut: 20% x Rp 49.315 = Rp 9.863,-
Jadi bunga yang diterima oleh nasabah: Rp 49.315,- – Rp 9.863,- = Rp 39.452,-
*/

/**
 *
 * @author irulg
 */
// pemilihan user lalu ada fitur cek saldo, tf, setor, tarik dll
import java.util.Scanner;
import java.time.LocalDate;
public class Backup {
    static Scanner sc = new Scanner(System.in);
    static LocalDate date = LocalDate.now();
    // norek, type(tf,str,tarik),jumlah, 
    static String[][] histories = {
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
    };
    static String[][] typeSaving = {
        {"001", "KONVENSIONAL"},
        {"002", "INVESTASI"},
        {"003", "HAJI"},
        {"004", "GIRO"}
    };
    
    static String[][] data = {
        {"121212","Aulia Gusti","Bondowoso","001","10201029"},
        {"121213","Ahmad Dhani","Surabaya ","001","10201010"},
        {"121214","Tomi Audita","Situbondo","003","10201021"},
        {"121215","Aida Aouron","Jember   ","002","10201022"},
        {"121216","Cintya Kuni","Surabaya ","001","10201023"},
        {"121217","Meliusa Mel","Malang   ","002","10201025"},
        {"121218","Doni Gustam","Pasuruan ","004","10201043"},
        {"121219","Anji Panani","Jember   ","004","10201012"},
        {"","","","",""},
        {"","","","",""}
    };
    static double saldoAwal = 1000000;
    static double[] saldo = {saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal};
    static String[][] sessionData = {{"","","","","",""}};
    static String user = "admin", pass = "admin";
    
    /* start main system */
    
    public static void main(String[] args) {
        header();
        authLog();
        footer();
    }
    
    /* end main system */
    
    /* start login system */
    
    static void authLog(){
        line(30);
        System.out.println("LOGIN PAGE");
        line(30);
        String username, password;
        System.out.print("USERNAME  : ");
        username = sc.nextLine();
        System.out.print("PASSWORD  : ");
        password = sc.nextLine();
        
        if(username.equals(user) && password.equals(pass)){
            menu();
        }else{
            errorMessage(400);
            authLog();
        }
    }
    
    /* end login system */
    
    /* start menu system */
    
    static void menu(){
        try{
            line(30);
            System.out.println("1. LIHAT DATA NASABAH");
            System.out.println("2. INPUT DATA NASABAH");
            System.out.println("3. LIHAT JENIS TABUNGAN");
            System.out.println("4. CARI NASABAH");
            System.out.println("5. CETAK LAPORAN TRANSAKSI");
            System.out.println("6. TRANSAKSI NASABAH");
            System.out.println("0. KELUAR");
            System.out.print("o> ");
            int selected = sc.nextInt();
            sc.nextLine();
            boolean bool = false;
            String msg = "KEMBALI KE MENU ATAU EXIT APLIKASI";
            switch(selected){
                case 1:
                    showData();
                    bool = confirmation(msg);
                    break;
                case 2:
                    addData();
                    bool = confirmation(msg);
                    break;
                case 3:
                    showTypeSaving();
                    bool = confirmation(msg);
                    break;
                case 4:
                    searchData();
                    bool = confirmation(msg);
                    break;
                case 5:
                    showHistories();
                    bool = confirmation(msg);
                    break;
                case 6:
                    checkUser();
                    bool = confirmation(msg);
                    break;
                default:
                    bool = false;
            }

            if(bool == true){
                menu();
            }else{
                errorMessage(407);
                authLog();
            }
        }catch(Exception e){
            e.getMessage();
            errorMessage(408);
            sc.nextLine();
            menu();
        }
    }
    
    static void menuNasabah(){
        try{
            userLogged();
            System.out.println("1. CEK SALDO");
            System.out.println("2. SETOR TABUNGAN");
            System.out.println("3. AMBIL TABUNGAN");
            System.out.println("4. TRANSFER");
            System.out.println("5. RIWAYAT TRANSAKSI");
            System.out.println("0. KELUAR");
            System.out.print("o> ");
            int selected = sc.nextInt();
            sc.nextLine();
            int index = Integer.parseInt(sessionData[0][0]);  
            boolean bool = false;
            String msg = "KEMBALI KE HALAMAN NASABAH / LOGOUT ?";
            switch(selected){
                case 1:
                    checkCodeType();
                    bool = confirmation(msg);
                    break;
                case 2:
                    deposit(sessionData[0][5], index);
                    bool = confirmation(msg);
                    break;
                case 3:
                    withdraw(sessionData[0][5], index);
                    bool = confirmation(msg);
                    break;
                case 4:
                    checkTypeCode(sessionData[0][5], index);
                    break;
                case 5:
                    showMyHistories();
                    bool = confirmation(msg);
                    break;
                default:
                    if(confirmation("YAKIN AKAN KELUAR ? ") == true){
                        menu();
                    }else{
                        menuNasabah();
                    }
                    userLogout();
            }

            if(bool == true){
                menuNasabah();
            }else{
                userLogout();
                menu();
            }
        }catch(Exception e){
            e.getMessage();
            errorMessage(408);
            sc.nextLine();
            if(confirmation("KEMBALI ? ") == true){
                menuNasabah();
            }else{
                userLogout();
                menu();
            }
        }
    }
    
    /* end menu system */
    
    /* start check user system */
    
    static void checkUser(){
        System.out.println("NOMOR REKENING NASABAH");
        System.out.print("o> ");
        String norek = sc.nextLine();
        if(norek == ""){
            errorMessage(405);
            checkUser();
        }else{
            int found = 0, index = 0;
            int i = 0;
            do{
                for(int j=0;j<data[0].length;j++){
                    if(norek.equals(data[i][j])){
                        found++;
                        index = i;
                    }
                }
                i++;
            }while(i<data.length);

            if(found > 0){
                sessionUser(index);
                menuNasabah();
            }else{
                errorMessage(404);
                checkUser();
            }
        }
    }
    
    /* end check user system */
    
    /* start sessio system */
    
    static void sessionUser(int index){
        String x = String.valueOf(index);
        sessionData[0][0] = x;
        sessionData[0][1] = data[index][0];
        sessionData[0][2] = data[index][1];
        sessionData[0][3] = data[index][2];
        sessionData[0][4] = data[index][3];
        sessionData[0][5] = data[index][4];
    }
    
    static void userLogged(){
        line(30);
        System.out.println("SELAMAT DATANG ");
        System.out.println("NOREK : " + sessionData[0][5]);
        System.out.println("NAMA  : " + sessionData[0][2]);
        line(30);
    }
    
    static void userLogout(){
        String x = "";
        sessionData[0][0] = x;
        sessionData[0][1] = x;
        sessionData[0][2] = x;
        sessionData[0][3] = x;
        sessionData[0][4] = x;
        sessionData[0][5] = x;
        //userLogged();
        menu();
    }
    
    /* end session system */
    
    /* start check code type (jenis tabungan) system */
    
    static void checkCodeType(){
        String key = sessionData[0][1];
        int found = 0, index = 0;
        String code = "";
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                if(key.equals(data[i][j])){
                    found++;
                    index = i;
                }
            }
        }
        
        if(found > 0){
            for(int i=0;i<data.length;i++){
                if(i == index){
                    for(int j=0;j<data[0].length;j++){
                        if(j == 3){
                            code = data[i][j];
                        }
                    }
                }
            }
            
            double interest = 0, taxFee = 0, finalResult = 0;
            String msg = "";
            switch (code) {
                case "001":
                    msg = "KONVENSIONAL";
                    interest = 1.10; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
                case "002":
                    msg = "INVESTASI";
                    interest = 1.08; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
                case "003":
                    msg = "HAJI";
                    interest = 1.20; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
                case "004":
                    msg = "GIRO";
                    interest = 1.24; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
            }
            line(40);
            System.out.println("JENIS TABUNGAN " + msg);
            line(20);
            System.out.println("BUNGA        : " + interest + " (Belum dipotong pajak)");
            System.out.println("PAJAK        : " + taxFee);
            System.out.println("BUNGA BERSIH : " + finalResult + " (Sudah dipotong pajak)");
            System.out.println("SALDO AWAL   : " + saldo[index]);
            System.out.println("SALDO AKHIR  : " + (saldo[index] + finalResult));
            line(40);
        }else{
            errorMessage(404);
        }
    }
    
    /* end check code type (jenis tabungan) system */
    
    /* start pajak dan bunga system */
    
    static double interestRate(double interest, double saldo){
        double x = saldo * interest * 0.08; // 0.08 didapt dari 30/365
        return x;
    }
    
    static double tax(double interest){ // pajak
        double taxFee = 0.20 * interest;
        return taxFee;
    }
    
    /* end pajak dan bunga system */
    
    /* start showData(nasabah) system */
    
    static void showData(){
        line(55);
        System.out.println("PIN      NAMA          ALAMAT      CD    NO. REKENING");
        line(55);
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                System.out.print(data[i][j] + "   ");
            }
            System.out.println();
        }
        line(55);
    }
    
    /* end showData(nasabah) system */
    
    /* start showType (jenis tabungan) system */
    
    static void showTypeSaving(){
        line(30);
        System.out.println("  KODE    JENIS");
        line(30);
        for(int i=0;i<typeSaving.length;i++){
            System.out.print("o> ");
            for(int j=0;j<typeSaving[0].length;j++){
                System.out.print(typeSaving[i][j] + "    ");
            }
            System.out.println();
        }
        line(30);
    }
    
    /* end showType (jenis tabungan) system */
    
    /* start addData(nasabah 2 org) system */
    
    static void addData(){
        for(int i=data.length-2;i<data.length;i++){
            for(int j=0;j<5;j++){
                if(j == 0){
                    System.out.print("PIN    : ");
                    data[i][j] = sc.nextLine();
                }else if(j == 1){
                    System.out.print("NAMA   : ");
                    data[i][j] = sc.nextLine();
                }else if(j == 2){
                    System.out.print("ALAMAT : ");
                    data[i][j] = sc.nextLine();
                }else if(j == 3){
                    choiceType();
                    System.out.print("o> ");
                    data[i][j] = sc.nextLine();
                }else{
                    long min = 1, max = 1000000000;
                    long random_int = (long)(Math.random() * (max - min + 1) + min);
                    String x = String.valueOf(random_int);
                    data[i][j] = x;
                    System.out.print("NO REK : " + x);
                }
                //System.out.println("");
            }
            System.out.println();
        }
    }
    
    /* end addData(nasabah 2 org) system */
    
    /* start choiceType(jenis tabungan) system */
    
    static void choiceType(){
        System.out.println("PILIH JENIS TABUNGAN");
        for(int i=0;i<typeSaving.length;i++){
            System.out.print("-> ");
            for(int j=0;j<typeSaving[0].length;j++){
                System.out.print(typeSaving[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("MASUKKAN KODE JENIS TABUNGAN");
    }

    /* end choiceType(jenis tabungan) system */
    
    /* start seacrh system */
    
    static void searchData(){
        System.out.println("NO REKENING YANG DICARI");
        System.out.print("o> ");
        String key = sc.nextLine();
        boolean bool = false;
        if(key == ""){
            errorMessage(405);
            bool = confirmation("APAKAH ANDA AKAN MELAJNUTKAN MENCARI LAGI ?");
            if(bool == true){
                searchData();
            }else{
                menu();
            }
        }else{
            int found = 0;
            int index = 0;
            for(int i=0;i<data.length;i++){
                for(int j=0;j<data[0].length;j++){
                    if(key.equals(data[i][j])){
                        found++;
                        index = i;
                    }
                }
            }

            if(found > 0){
                line(40);
                System.out.print("PIN    : " + data[index][0] + "\n");
                System.out.print("NAMA   : " + data[index][1] + "\n");
                System.out.print("ALAMAT : " + data[index][2] + "\n");
                System.out.print("TIPE   : " + data[index][3] + "\n");
                System.out.print("NO REK : " + data[index][4] + "\n");
                line(40);
            }else{
                errorMessage(404);
                searchData();
            }
        }
    }
    
    /* end seacrh system */
    
    /* start deposit system */
    
    static double deposit(String norek, int index){
        System.out.println("JUMLAH SETORAN");
        System.out.print("o> Rp. ");
        double depo = sc.nextDouble();
        sc.nextLine();
        detailDeposit(depo);
        boolean bool = confirTransaction();
        if(bool == true){
            if(depo % 50000 == 0){
                String saldoToString = String.valueOf("+" + depo);
                addHistory(norek, "SETORAN", saldoToString);
                saldo[index] += depo;
            }else{
                errorMessage(401);
                deposit(norek, index);
            }

            strukDeposit(depo);
            boolean x = confirmation("INGIN BERTRANSAKSI LAGI ?");
            if(x == true){
                deposit(norek, index);
            }else{
                menuNasabah();
            }
        }
        
        return saldo[index];
    }
    
    static void detailDeposit(double depo){
        line(30);
        System.out.println("DETAIL TRANSAKSI SETORAN");
        line(30);
        System.out.println("TANGGAL  : " + date);
        System.out.println("NOREK    : " + sessionData[0][5]);
        System.out.println("JUMLAH   : Rp. " + depo);
        line(30);
        System.out.println("TOTAL    : Rp. " + (depo));
        line(30);
    }
    
    static void strukDeposit(double depo){
        line(30);
        System.out.println("STRUK TRANSAKSI SETORAN");
        line(30);
        System.out.println("MESSAGE  : BERHASIL/SUCCESS");
        System.out.println("TANGGAL  : " + date);
        System.out.println("NOREK    : " + sessionData[0][5]);
        System.out.println("JUMLAH   : Rp. " + depo);
        line(30);
        System.out.println("TOTAL    : Rp. " + (depo));
        line(30);
    }
    
    /* end deposit system */
    
    /* start withdraws system */
    
    static double withdraw(String norek, int index){
        System.out.println("JUMLAH PENARIKAN");
        System.out.print("o> Rp. ");
        double withdraws = sc.nextDouble();
        sc.nextLine();
        detailWithdraw(withdraws);
        boolean bool = confirTransaction();
        if(bool == true){
            if(withdraws % 50000 == 0){
                if(withdraws > saldo[index]-5000){
                    System.out.println("Ketik 0 untuk kembali");
                    errorMessage(402);
                    withdraw(norek, index);
                }else{
                    saldo[index] -= withdraws;
                }
            }else{
                errorMessage(401);
                withdraw(norek, index);
            }
            String saldoToString = String.valueOf("-" + withdraws);
            addHistory(norek, "PENARIKAN", saldoToString);

            strukWithdraw(withdraws);
            boolean x = confirmation("INGIN BERTRANSAKSI LAGI ?");
            if(x == true){
                withdraw(norek, index);
            }else{
                menuNasabah();
            }
        }
        
        return saldo[index];
    }
    
    static void detailWithdraw(double withdraws){
        line(30);
        System.out.println("DETAIL TRANSAKSI PENARIKAN");
        line(30);
        System.out.println("TANGGAL  : " + date);
        System.out.println("NOREK    : " + sessionData[0][5]);
        System.out.println("JUMLAH   : Rp. " + withdraws);
        line(30);
        System.out.println("TOTAL    : Rp. " + (withdraws));
        line(30);
    }
    
    static void strukWithdraw(double withdraws){
        line(30);
        System.out.println("STRUK TRANSAKSI PENARIKAN");
        line(30);
        System.out.println("MESSAGE  : BERHASIL/SUCCESS");
        System.out.println("TANGGAL  : " + date);
        System.out.println("NOREK    : " + sessionData[0][5]);
        System.out.println("JUMLAH   : Rp. " + withdraws);
        line(30);
        System.out.println("TOTAL    : Rp. " + (withdraws));
        line(30);
    }
    
    /* end withdraws system */
    
    /* start transfer system */
    static void checkTypeCode(String fromKey, int index){
        choiceType();
        System.out.print("o> ");
        String codeType = sc.nextLine();
        switch(codeType){
            case "001":
                checkCreditNumber(codeType, fromKey, index);
                break;
            case "002":
                checkCreditNumber(codeType, fromKey, index);
                break;
            case "003":
                checkCreditNumber(codeType, fromKey, index);
                break;
            case "004":
                checkCreditNumber(codeType, fromKey, index);
                break;
            default:
                errorMessage(406);
                checkTypeCode(fromKey, index);
                break;
        }
    }
    
    static void checkCreditNumber(String codeType, String fromKey, int index){
        
        double tfFee = transferFee(codeType);
        System.out.println("NOMOR REKENING TUJUAN");
        System.out.print("o> ");
        String creditNumber = sc.nextLine();
        if(creditNumber == ""){
            errorMessage(405);
            checkCreditNumber(codeType, fromKey, index);
        }else{
            int found = 0;
            int tfIndex = 0;
            for(int i=0;i<data.length;i++){
                for(int j=0;j<data[0].length;j++){
                    if(creditNumber.equals(data[i][j])){
                        found++;
                        tfIndex = i;
                    }
                }
            }

            if(found > 0){
                double tfAmount = transferAmount();
                detailTransfer(creditNumber, index, tfIndex, tfFee, tfAmount);
                boolean bool = confirTransaction();
                if(bool == true){
                    transfer(fromKey, creditNumber, index, tfIndex, tfFee, tfAmount);
                    strukTransfer(creditNumber, index, tfIndex, tfFee, tfAmount);
                    boolean x = confirmation("INGIN BERTRANSAKSI(TRANSFER) LAGI ?");
                    if(x == true){
                        checkTypeCode(sessionData[0][5], index);
                    }else{
                        menuNasabah();
                    }
                }else{
                    menuNasabah();
                }
            }else{
                //System.out.println("Ketik 0 untuk kembali");
                //lihat data no rek
                errorMessage(404);
                checkCreditNumber(codeType, fromKey, index);
            }
        }
    }
    
    static double transferAmount(){
        double x = 0;
        System.out.println("JUMLAH YANG AKAN DITRANSFER");
        System.out.print("o> Rp. ");
        double tfAmount = sc.nextDouble();
        sc.nextLine();
        int index = Integer.parseInt(sessionData[0][0]);
        if(tfAmount > saldo[index]-5000){
            errorMessage(402);
            transferAmount();
        }else{
            x = tfAmount;
        }
        return x;
    }
    
    static double transfer(String fromKey, String toKey, int index, int tfIndex, double tfFee, double tfAmount){
        
        saldo[tfIndex] += tfAmount;
        String toTfStr = String.valueOf("+" + tfAmount);
        addHistory(toKey, "TRANSFER", toTfStr);

        String fromTfStr = String.valueOf("-" + tfAmount);
        addHistory(fromKey, "TRANSFER", fromTfStr);
        saldo[index] -= tfAmount + tfFee; // saldo dikurangi transfer dan biaya transfer
        
        return saldo[index]; // return saldo / update saldo nasabah
    }
    
    static double transferFee(String codeType){
        double fee = 0;
        if(codeType.equals(sessionData[0][4])){
            fee = 0;
        }else{
            fee = 6500;
        }
        return fee;
    }
    
    static void detailTransfer(String toKey, int index, int tfIndex, double tfFee, double tfAmount){
        line(30);
        System.out.println("DETAIL TRANSAKSI TRANSFER");
        line(30);
        System.out.println("TANGGAL  : " + date);
        System.out.println("DARI     : " + sessionData[0][5]);
        System.out.println("KEPADA   : " + toKey);
        System.out.println("JUMLAH   : Rp. " + tfAmount);
        System.out.println("BIAYA TF : Rp. " + tfFee);
        line(30);
        System.out.println("TOTAL    : Rp. " + (tfAmount + tfFee));
        line(30);
    }
    
    static void strukTransfer(String toKey, int index, int tfIndex, double tfFee, double tfAmount){
       line(30);
        System.out.println("STRUK TRANSAKSI TRANSFER");
        line(30);
        System.out.println("STATUS   : BERHASIL/SUCCESS");
        System.out.println("TANGGAL  : " + date);
        System.out.println("DARI     : " + sessionData[0][5]);
        System.out.println("KEPADA   : " + toKey);
        System.out.println("JUMLAH   : Rp. " + tfAmount);
        System.out.println("BIAYA TF : Rp. " + tfFee);
        line(30);
        System.out.println("TOTAL    : Rp. " + (tfAmount + tfFee));
        line(30);
    }
   
    /* end transfer system */
   
    /* start confirmation transaction system */
    
    static boolean confirTransaction(){
        System.out.println("APAKAH ANDA YAKIN AKAN MELANJUTKAN TRANSAKSI INI ? [y/n]");
        System.out.print("o> ");
        char confir = sc.next().charAt(0);
        sc.nextLine();
        boolean bool = false;
        if(confir == 'y' || confir == 'Y'){
            bool = true;
        }else{
            bool = false;
        }
        return bool;
    }
    
    /* end confirmation transaction system */
    
    /* start history system */
   
    static void addHistory(String key, String type, String saldo){
        int index = 0, found = 0;
        String keyFound = "";
        for(int i=0;i<histories.length;i++){
            for(int j=0;j<histories[0].length;j++){
                if(keyFound.equals(histories[i][j])){
                    found++;
                    index = i;
                }
            }
        }
        
        if(found > 0){
            for(int i=0;i<histories.length;i++){
                if(i == index){
                    for(int j=0;j<histories[0].length;j++){
                        if(j == 0){
                            String x = String.valueOf(date);
                            histories[i][j] = x;
                        }else if(j == 1){
                            histories[i][j] = key;
                        }else if(j == 2){
                            histories[i][j] = saldo;
                        }else{
                            histories[i][j] = type;
                        }
                    }
                }
            }
        }else{
            errorMessage(406);
            menuNasabah();
        }
    }
    
    static void showHistories(){
        System.out.println("MASUKKAN NOMOR REKENING YANG AKAN DI CETAK");
        System.out.print("o> ");
        String key = sc.nextLine();
        int found = 0;
        boolean bool = false;
        if(key == ""){
            errorMessage(405);
            bool = confirmation("KEMBALI KE HOME ?");
            if(bool == true){
                menu();
            }else{
                showHistories();
            }
        }else{
            line(45);
            System.out.println("---------------- HISTORIES ------------------");
            for(int i=0;i<histories.length;i++){
                for(int j=0;j<histories[0].length;j++){
                    if(histories[i][j].equals(key)){
                        found++;
                        showTransaction(i);
                    }
                }
            }
            line(45);
            if(found > 0){
                bool = confirmation("KEMBALI KE HOME ?");
                if(bool == true){
                    menu();
                }else{
                    showHistories();
                }
            }else{
                errorMessage(403);
                bool = confirmation("KEMBALI KE HOME ?");
                if(bool == true){
                    menu();
                }else{
                    showHistories();
                }
            }
        }
    }
    
    static void showMyHistories(){
        int found = 0;
        line(45);
        System.out.println("---------------- HISTORIES ------------------");
        for(int i=0;i<histories.length;i++){
            for(int j=0;j<histories[0].length;j++){
                if(histories[i][j].equals(sessionData[0][5])){
                    found++;
                    showTransaction(i);
                }
            }
        }
        line(45);
        if(found > 0){
            System.out.println();
        }else{
            errorMessage(403);
        }
    }
    
    static void showTransaction(int norek){
        for(int j=0;j<histories[0].length;j++){
            System.out.print(histories[norek][j] + "  ");
        }
        System.out.println();
    }
    
    /* end history system */
    
    /* start error message system */
    
    static void errorMessage(int errorCode){
        //error code
        line(50);
        switch(errorCode){
            case 400:
                System.out.println("INVALID USERNAME OR PASSWORD !");
                break;
            case 401:
                System.out.println("WITHDRAWALS/DEPOSITS MUST BE A MULTIPLE OF 50K !"); // kelipatan 50rb
                break;
            case 402:
                System.out.println("SORRY YOUR BALANCE IS NOT ENOUGH !");
                break;
            case 403:
                System.out.println("NO TRANSACTION HISTORY !");
                break;
            case 404:
                System.out.println("INVALID CREDIT NUMBER !");
                break;
            case 405:
                System.out.println("SORRY THE INPUTS CANNOT BE EMPTY !");
                break;
            case 406:
                System.out.println("SOMETHING IS WRONG, PLEASE CHECK AGAIN ! ");
                break;
            case 407:
                System.out.println("YOU ARE ALREADY OUT OF THE APP !");
                break;
            default:
                System.out.println("INPUTS MUST BE NUMBERS/NUMERIC !");
        }
        line(50);
    }
    
    /* end error message system */
    
    /* start confirmation system */
    
    static boolean confirmation(String msg){
        System.out.println(msg +  " [y/n]");
        System.out.print("o> ");
        String confir = sc.nextLine();
        boolean bool = false;
        if(confir.equals("y") || confir.equals("Y")){
            bool = true;
        }else{
            bool = false;
        }
        return bool;
    }
    
    /* end confirmation system */
    
    /* start additional system */
    
    static void header(){
        line(45);
        System.out.println("DATE       : " + date);
        System.out.println("AUTHOR/NIM : MOCHAMMAD HAIRULLAH / 2041720074");
        System.out.println("MATKUL     : DASPRO 2020");
        System.out.println("TOPIK      : PERBANKAN");
        line(45);
    }
    
    static void footer(){
        line(45);
        System.out.println("Copyright | 2020 | Mochammad Hairullah");
        line(45);
    }
    
    static void line(int n){
        for(int i=0;i<n;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    
    /* end additional system */
}