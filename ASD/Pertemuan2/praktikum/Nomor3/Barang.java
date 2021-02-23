public class Barang {
    String nama;
    int hargaSatuan, jumlah;
    
    Barang(){
        System.out.println("Parameter harus ada");
    }
    
    Barang(String na, int harga, int qty){
        nama = na;
        hargaSatuan = harga;
        jumlah = qty;
    }
    
    int hitungHargaTotal(){
        int total = jumlah * hargaSatuan;
        return total;
    }
    
    int hitungDiskon(){
        int total = hitungHargaTotal();
        int diskon = total;
        return diskon;
    }
    
    int hitungHargaBayar(){
        int total = hitungHargaTotal();
        return total;
    }

    public static void main(String[] args) {
        
        // tanpa diskon
        Barang item1 = new Barang("Baju Bau", 9800, 10);
        
        System.out.println("Item        : " + item1.nama);
        System.out.println("Harga       : Rp. " + item1.hargaSatuan);
        System.out.println("Qty Item    : " + item1.jumlah);
        System.out.println("Total       : Rp. " + item1.hitungHargaBayar());
    }
}