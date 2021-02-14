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
// pemilihan user lalu ada fitur cek saldo, tf, setor, tarik dll
import java.util.Scanner;
import java.time.LocalDate;
public class LastTest {
    static Scanner sc = new Scanner(System.in);
    static LocalDate date = LocalDate.now();
    // norek, type(tf,str,tarik),jumlah, 
    static String[][] histories = {
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
        {"","","",""},{"","","",""},{"","","",""},{"","","",""},
    };
    static String[][] typeSaving = {
        {"001", "KONVENSIONAL"},
        {"002", "INVESTASI"},
        {"003", "HAJI"},
        {"004", "SYARIAH"}
    };
    
    public static void main(String[] args) {
        String[][] data = {
            {"121212","Aulia Gusti","Bondowoso","001","10201029"},
            {"121213","Ahmad Dhani","Malang","001","10201010"},
            {"121214","Tomi Audit","Situbondo","003","10201021"},
            {"121215","Aida Millati","Jember","002","10201022"},
            {"121216","Cintya Sukur","Surabaya","001","10201023"},
            {"121217","Meliusa","Surabaya","002","10201025"},
            {"121218","Doni Gustam","Malang","004","10201043"},
            {"121219","John Lenon","Bondowoso","004","10201012"},
            {"","","","",""},
            {"","","","",""}
        };
        double saldoAwal = 1000000;
        double[] saldo = {saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal,saldoAwal};
        
        menu(data, saldo);
    }
    
    static void menu(String[][] data, double[] saldo){
        System.out.println("1. Lihat data nasabah");
        System.out.println("2. Input data nasabah");
        System.out.println("3. Pilih jenis tabungan");
        System.out.println("4. Cari nasabah");
        System.out.println("------------------------");
        System.out.println("5. Cek saldo");
        System.out.println("6. Setor tabungan");
        System.out.println("7. Ambil tabungan");
        System.out.println("8. Transfer");
        System.out.println("------------------------");
        System.out.println("9. Cetak Laporan Transaksi");
        System.out.println("10. TEST");
        System.out.println("0. Keluar");
        System.out.print("o> ");
        int selected = sc.nextInt();
        sc.nextLine();
        
        switch(selected){
            case 1:
                showData(data, saldo);
                break;
            case 2:
                addData(data, saldo);
                break;
            case 3:
                typeSaving();
                break;
            case 4:
                searchData(data, saldo);
                break;
            case 5:
                checkNumber(selected, data, saldo);
                break;
            case 6:
                checkNumber(selected, data, saldo);
                break;
            case 7:
                checkNumber(selected, data, saldo);
                break;
            case 8:
                checkNumber(selected, data, saldo);
                break;
            case 9:
                showHistories(data, saldo);
                break;
            case 10:
                checkCodeType(data, saldo);
                break;
            default:
        }
    }
    
    static void checkCodeType(String[][] data, double[] saldo){
        System.out.println("Masukkan no rek yang di cari");
        System.out.print("o> ");
        String key = sc.nextLine();
        int found = 0;
        int index = 0;
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
                    interest = 0.06; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
                case "002":
                    msg = "INVESTASI";
                    interest = 0.08; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
                case "003":
                    msg = "HAJI";
                    interest = 0.03; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
                case "004":
                    msg = "SYARIAH";
                    interest = 0.04; // bunga 6%
                    interest = interestRate(interest, saldo[index]);
                    taxFee = tax(interest);
                    finalResult = interest - taxFee;
                    break;
            }
            System.out.println("-----------------------------------------------");
            System.out.println("JENIS TABUNGAN " + msg);
            System.out.println("----------------------------");
            System.out.println("Bunga : " + interest + " (Belum dipotong pajak)");
            System.out.println("Pajak : " + taxFee);
            System.out.println("Bunga : " + finalResult + " (Sudah dipotong pajak)");
            System.out.println("Saldo Awal  : " + saldo[index]);
            System.out.println("Saldo Akhir : " + (saldo[index] - finalResult));
            System.out.println("------------------------------------------------");
            menu(data, saldo);
        }else{
            System.out.println("No rekening yang ada cari tidak ada");
            searchData(data, saldo);
        }
    }
    
    static double adminFee(){
        double fee = 25000;
        return fee;
    }
    
    static double interestRate(double interest, double saldo){
        double x = saldo * interest * 0.08; // 0.08 didapt dari 30/365
        return x;
    }
    
    static double tax(double interest){
        double taxFee = 0.20 * interest;
        return taxFee;
    }
    
    static void showData(String[][] data, double[] saldo){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
        menu(data, saldo);
    }

    static void addData(String[][] data, double[] saldo){
        for(int i=data.length-2;i<data.length;i++){
            for(int j=0;j<5;j++){
                if(j == 0){
                    System.out.print("PIN    : ");
                    data[i][j] = sc.nextLine();
                }else if(j == 1){
                    System.out.print("Nama   : ");
                    data[i][j] = sc.nextLine();
                }else if(j == 2){
                    System.out.print("Alamat : ");
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
                    System.out.print("No Rek : " + x);
                }
                //System.out.println("");
            }
            System.out.println();
        }
        
        menu(data, saldo);
    }
    
    static void choiceType(){
        System.out.println("PILIH JENIS TABUNGAN");
        for(int i=0;i<typeSaving.length;i++){
            for(int j=0;j<typeSaving[0].length;j++){
                System.out.print("-> " + typeSaving[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Masukkan kode jenis");
    }

    static void typeSaving(){
        // dana haji bunga = 6%
        // konvensional bunga = 2%
        // Investasi bunga = 8%
        // tabungan syariah = 4%
        /*
            Bunga tabungan : Rp 10.000.000,- X 6% x 30 / 365 = Rp 49.315,-
            Bunga sebesar Rp 49.315,- merupakan bunga gross (belum dipotong pajak).
            Maka pajak bunga tabungan tersebut: 20% x Rp 49.315 = Rp 9.863,-
            Jadi bunga yang diterima oleh nasabah: Rp 49.315,- – Rp 9.863,- = Rp 39.452,-
        */
    } 
    
    static void searchData(String[][] data, double[] saldo){
        System.out.println("Masukkan no rek yang di cari");
        System.out.print("o> ");
        String key = sc.nextLine();
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
            System.out.println("--------------------------------------------------");
            for(int i=0;i<data.length;i++){
                if(i == index){
                    for(int j=0;j<data[0].length;j++){
                        if(j == 0){
                            System.out.print("PIN    : " + data[i][j] + "\n");
                        }else if(j == 1){
                            System.out.print("Nama   : " + data[i][j] + "\n");
                        }else if(j == 2){
                            System.out.print("Alamat : " + data[i][j] + "\n");
                        }else if(j == 3){
                            System.out.print("Tipe   : " + data[i][j] + "\n");
                        }else{
                            System.out.print("No Rek : " + data[i][j] + "\n");
                        }
                    }
                }
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Saldo  : Rp. " + saldo[index]);
            System.out.println("--------------------------------------------------");
            System.out.println("");
            menu(data, saldo);
        }else{
            System.out.println("No rekening yang ada cari tidak ada");
            searchData(data, saldo);
        }
    }
    
    static void checkNumber(int selected, String[][] data, double[] saldo){
        System.out.println("Masukkan Nomor Rekening Nasabah");
        System.out.print("o> ");
        String key = sc.nextLine();
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
            switch(selected){
                case 5:
                    System.out.println("--------------------");
                    System.out.println("Saldo : " + mySaldo(index, saldo));
                    System.out.println("--------------------");
                    menu(data, saldo);
                    break;
                case 6:
                    deposit(key, index, saldo);
                    menu(data, saldo);
                    break;
                case 7:
                    reedem(key, index, data, saldo);
                    menu(data, saldo);
                    break;
                case 8:
                    checkCreditNumber(key, index, data, saldo);
                    break;
            }
        }else{
            System.out.println("PIN salah, silahkan coba lagi");
            checkNumber(selected, data, saldo);
        }
    }
    
    static double mySaldo(int index, double[] saldo){
        double x = saldo[index];
        return x;
    }
    
    static double deposit(String key, int index, double[] saldo){
        System.out.println("Masukkan jumlah setoran");
        System.out.print("o> Rp. ");
        double depo = sc.nextDouble();
        if(depo % 50000 == 0){
            String saldoToString = String.valueOf("+" + depo);
            addHistory(key, "SETORAN", saldoToString);
            saldo[index] += depo;
        }else{
            System.out.println("MAAF SETORAN HARUS KELIPATAN 50000");
            deposit(key, index, saldo);
        }
        return saldo[index];
    }
    
    static double reedem(String key, int index, String[][] data, double[] saldo){
        System.out.println("Masukkan jumlah penarikan");
        System.out.print("o> Rp. ");
        double reed = sc.nextDouble();
        if(reed % 50000 == 0){
            if(reed == 0){
                menu(data, saldo);
            }else if(reed > saldo[index]-5000){
                System.out.println("Ketik 0 untuk kembali");
                System.out.println("Maaf saldo anda kurang");
                reedem(key, index, data, saldo);
            }else{
                saldo[index] -= reed;
            }
        }else{
            System.out.println("MAAF PENARIKAN HARUS KELIPATAN 50000");
            reedem(key, index, data, saldo);
        }
        String saldoToString = String.valueOf("-" + reed);
        addHistory(key, "PENARIKAN", saldoToString);
        return saldo[index];
    }
    
    static void checkCreditNumber(String fromKey, int index, String[][] data, double[] saldo){
        System.out.println("Masukkan nomor rekening tujuan");
        System.out.print("o> ");
        String creditNumber = sc.nextLine();
        
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
            transfer(fromKey, creditNumber, index, tfIndex, data, saldo);
            menu(data, saldo);
        }else{
            //System.out.println("Ketik 0 untuk kembali");
            //lihat data no rek
            System.out.println("Nomor rekening tidak ada");
            checkCreditNumber(fromKey, index, data, saldo);
        }
    }
    
    static double transfer(String fromKey, String toKey, int index, int tfIndex, String[][] data, double[] saldo){
        System.out.println("Jumlah yang akan ditransfer");
        System.out.print("o> Rp. ");
        double tf = sc.nextDouble();
        if(tf > saldo[index]-5000){
            System.out.println("Maaf saldo anda kurang");
            transfer(fromKey, toKey, index, tfIndex, data, saldo);
        }else{
            saldo[tfIndex] += tf;
            String toTfStr = String.valueOf("+" + tf);
            addHistory(toKey, "TRANSFER", toTfStr);

            String fromTfStr = String.valueOf("-" + tf);
            addHistory(fromKey, "TRANSFER", fromTfStr);
            saldo[index] -= tf;
        }
        return saldo[index];
    }
    
//    static void reports(String[][] data, double[] saldo){
//        System.out.println("Masukkan nomor rekening tujuan");
//        System.out.print("o> ");
//        String creditNumber = sc.nextLine();
//        
//        int found = 0;
//        int index = 0;
//        for(int i=0;i<data.length;i++){
//            for(int j=0;j<data[0].length;j++){
//                if(creditNumber.equals(data[i][j])){
//                    found++;
//                    index = i;
//                }
//            }
//        }
//        
//        if(found > 0){
//           
//        }else{
//            //System.out.println("Ketik 0 untuk kembali");
//            //lihat data no rek
//            System.out.println("Nomor rekening tidak ada");
//            reports(data, saldo);
//        }
//    }
    
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
            System.out.println("- SALAH -");
        }
    }
    
    static void showHistories(String[][] data, double[] saldo){
        System.out.println("Masukkan nomor rekening yang akan dicetak");
        System.out.print("o> ");
        String key = sc.nextLine();
        int found = 0;
        if(key == ""){
            System.out.println("Maaf tidak inputan boleh kosong");
            showHistories(data, saldo);
        }else{
            System.out.println("---------------------------------------------");
            System.out.println("---------------- HISTORIES ------------------");
            for(int i=0;i<histories.length;i++){
                for(int j=0;j<histories[0].length;j++){
                    if(histories[i][j].equals(key)){
                        found++;
                        showTransaction(i);
                    }
                }
            }
            System.out.println("---------------------------------------------");
            if(found > 0){
                menu(data, saldo);
            }else{
                System.out.println("Tidak ada riwayat transaksi");
                showHistories(data, saldo);
            }
        }
    }
    
    static void showTransaction(int x){
        for(int j=0;j<histories[0].length;j++){
            System.out.print(histories[x][j] + "  ");
        }
        System.out.println("");
    }
    
    static void message(){
        
    }
    
    static void header(){
        
    }
    
    static void footer(){
        
    }
}
