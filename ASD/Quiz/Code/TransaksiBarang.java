public class TransaksiBarang{
    public Barang[] barangs = new Barang[5];
    public Barang[] pembelians = new Barang[1];
    public String brg, kdBrg;
    public int jumlah;
    public double hargaBrg, subTotal;

    TransaksiBarang(){
        
    }

    TransaksiBarang(String kd, String brgs, double harga, int jumlahs){
        kdBrg = kd;
        brg = brgs;
        hargaBrg = harga;
        jumlah = jumlahs;
        subTotal = hargaBrg * jumlahs;
    }

    void dataBrg(){
        barangs[0] = new Barang("K01", "Test1", 1000, 10);
        barangs[1] = new Barang("K02", "Test2", 1500, 15);
        barangs[2] = new Barang("K03", "Test3", 4000, 12);
        barangs[3] = new Barang("K04", "Test4", 3000, 11);
        barangs[4] = new Barang("K05", "Test5", 2000, 11);
    }

    void showBarang(){
        dataBrg();
        for(int i=0;i<barangs.length;i++){
            System.out.println(barangs[i].kode + "  " + barangs[i].nama + "  " + barangs[i].harga + "  " + barangs[i].stok);
        }
    }

    void getKdBrg(String str, int jumlah){
        dataBrg();
        int index = 0, c = 0;
        for(int i=0;i<barangs.length;i++){
            if(str.equals(barangs[i].kode)){
                index = i;
                c++;
            }
        }

        if(c > 0){
            System.out.println("=============================================");
            System.out.println("Data Pembelian");
            System.out.println("Kode   - " + barangs[index].kode);
            System.out.println("Barang - " + barangs[index].nama);
            System.out.println("Harga  - " + barangs[index].harga);
            System.out.println("Jumlah - " + jumlah);
            System.out.println("Total  - " + jumlah * barangs[index].harga);
            System.out.println("=============================================");
        }else{
            System.out.println("Kode Tidak ditemukan");
        }

        //pembelians[0] = new Barang(barangs[index].kode, barangs[index].nama, barangs[index].harga, barangs[index].stok);
    }
}