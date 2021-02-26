import java.util.Scanner;
public class Kubus {
    Scanner sc = new Scanner(System.in);
    public double sisi;
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    double volume(){
        double volume = sisi * sisi * sisi;
        return volume;
    }
    
    double luasPermukaan(){
        double luas = sisi * sisi;
        return luas;
    }
}