import java.util.Scanner;
public class Balok {
    Scanner sc = new Scanner(System.in);
    public double panjang, lebar, tinggi;
    
    public Balok(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double volume(){
        double v = p * l * t;
        return v;
    }
    
    double luasPermukaan(){
        double lP = p * l;
        return lP;
    }
}