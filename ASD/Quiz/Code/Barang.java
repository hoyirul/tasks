public class Barang{
    public int stok;
    public double harga;
    public String nama; 
    public String kode;

    Barang(String kd, String nm, double hr, int st){
        kode = kd;
        nama = nm;
        harga = hr;
        stok = st;
    }
}