public class Main(){
    public static void main(String[] args) {
        
        Balok[] blArr = new Balok[1];
        Bola[] blArr = new Bola[1];
        Kubus[] kbArr = new Kubus[1];
        
        for(int i=0;i<1;i++){
            System.out.println("BALOK");
            System.out.print("Masukkan Panjang  = ");
            blArr[i].p = sc.nextDouble();
            System.out.print("Masukkan Lebar    = ");
            blArr[i].l = sc.nextDouble();
            System.out.print("Masukkan Tinggi   = ");
            blArr[i].t = sc.nextDouble();

            System.out.println("KUBUS");
            kbArr[i] = new Kubus(0);
            System.out.println("BOLA"); 
            blArr[i] = new Bola(0,0);
        }
        
        for(int i=0;i<1;i++){
            System.out.println("-------------------------");
            System.out.println("BALOK");
            System.out.println("Panjang : " + blArr[i].p);
            System.out.println("Lebar   : " + blArr[i].l);
            System.out.println("Tinggi  : " + blArr[i].t);
            System.out.println("Volume  : " + blArr[i].volume());
            System.out.println("Luas Permukaan  : " + blArr[i].luasPermukaan());
            System.out.println("-------------------------");
            
            System.out.println("-------------------------");
            System.out.println("KUBUS");
            System.out.println("Sisi : " + kbArr[i].s);
            System.out.println("Volume  : " + kbArr[i].volume());
            System.out.println("Luas Permukaan  : " + kbArr[i].luasPermukaan());
            System.out.println("-------------------------");
            
            System.out.println("-------------------------");
            System.out.println("BOLA");
            System.out.println("Jari Jari : " + blArr[i].r);
            System.out.println("Tinggi   : " + blArr[i].t);
            System.out.println("Volume  : " + blArr[i].volume());
            System.out.println("Luas Permukaan  : " + blArr[i].luasPermukaan());
            System.out.println("-------------------------");
        }
    }
}