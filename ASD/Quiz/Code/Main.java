import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
    }

    static void showMenu(){
        System.out.println("Daftar Menu");
        System.out.println("1. Lihat Barang");
        System.out.println("2. Beli");
        System.out.println("3. Keluar");
        System.out.print("Choose -> ");
        int option = sc.nextInt();

        switch(option){
            case 1:
                showBrg();
                showMenu();
                break;
            case 2:
                orderBrg();
                break;
            default:
            System.out.print("KELUAR");
        }
    }

    static void showBrg(){
        TransaksiBarang viewBrg = new TransaksiBarang();

        viewBrg.showBarang();
    }

    static void orderBrg(){
        char bool;
        int i = 0;
        TransaksiBarang viewBrg = new TransaksiBarang();
        TransaksiBarang checkDetail = new TransaksiBarang();
        viewBrg.showBarang();
        do{
            System.out.println("Input kode");
            System.out.print("Kode -> ");
            sc.nextLine();
            String kdBrg = sc.nextLine();
            System.out.print("Qty -> ");
            int jumlah = sc.nextInt();
            checkDetail.getKdBrg(kdBrg, jumlah);
            System.out.print("Beli Lagi ? Y/n : ");
            bool = sc.next().charAt(0);
            i++;
        }while(bool == 'Y' || bool == 'y');

        showMenu();
    }
}