import java.util.Scanner;
public class Mhs {
    Scanner sc = new Scanner(System.in);
    public String nama;
    public String nim;
    public char jenis_kelamin;
    public double ipk;
    
    public Mahasiswa(String na, String ni, char jk, double my_ipk){
        nama = na;
        nim = ni;
        jenis_kelamin = jk;
        ipk = my_ipk;
    }
}
