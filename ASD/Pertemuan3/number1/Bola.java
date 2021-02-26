import java.util.Scanner;
public class Bola {
    Scanner sc = new Scanner(System.in);
    public double s;
    
    public Kubus(double s){
        System.out.print("Sisi : ");
        s =  sc.nextDouble();
        this.s = s;
    }
    
    double volume(){
        double v = s * s * s;
        return v;
    }
    
    double luasPermukaan(){
        double l = s * s;
        return l;
    }
}