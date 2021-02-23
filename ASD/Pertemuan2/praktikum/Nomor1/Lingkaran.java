public class Lingkaran {
    double jari, phi = 3.14;
    
    double hitungLuas(){
        double luas = phi * (jari * jari);
        return luas;
    }
    
    double hitungKeliling(){
        double keliling = 2 * (phi * jari);
        return keliling;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.jari = 7;
        
        System.out.println("Jari-jari          = " + lingkaran1.jari);
        System.out.println("Luas Lingkaran     = " + lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran = " + lingkaran1.hitungKeliling());
    }
}