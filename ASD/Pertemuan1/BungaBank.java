public class BungaBank {
    public static void main(String[] args) {
        double saldo = 1000000;
        int x = 0, i = 0;

        do{
            x++;
            System.out.println("BULAN KE-" + (i+1) + " SALDO ANDA Rp " + Math.ceil(saldo));
            saldo = saldo + (saldo*0.02);
            i++;
        }while(saldo<=1500000);

        System.out.println("PADA BULAN KE - " + x);
    }
}