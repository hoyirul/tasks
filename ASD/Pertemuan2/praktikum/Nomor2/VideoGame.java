import java.util.Scanner;
public class VideoGame {
    int id, lama_sewa;
    double harga_sewa;
    String nama_member, nama_game;
    
    VideoGame(int no, double harga, String nama){
        id = no;
        harga_sewa = harga;
        nama_game = nama;
    }
    
    void listGame(){
        System.out.println(id + "   " + nama_game + "   " + harga_sewa + "/hari");
    }
    
    void strukSewa(){
        System.out.println("Nama Penyewa    : " + nama_member);
        System.out.println("ID Game         : " + id);
        System.out.println("Nama Game       : " + nama_game);
        System.out.println("Lama Sewa       : " + lama_sewa + "hari");
        System.out.println("Harga Sewa      : " + harga_sewa + "/hari");
        System.out.println("Total Bayar     : " + bayarSewa());
    }
    
    double bayarSewa(){
        double total = lama_sewa * harga_sewa;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoGame game1 = new VideoGame(1, 20000, "Among US");
        VideoGame game2 = new VideoGame(2, 33000, "Mobile L");
        VideoGame game3 = new VideoGame(3, 16000, "PriPayer");
        VideoGame game4 = new VideoGame(4, 24000, "Pubjimob");
        
        game1.listGame();
        game2.listGame();
        game3.listGame();
        game4.listGame();
        
        System.out.print("Pilih ID Game         : ");
        int opsi = sc.nextInt();
        switch(opsi){
            case 1:
                System.out.print("Masukkan Lama Sewa    : ");
                game1.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                game1.nama_member = sc.nextLine();
                game1.strukSewa();
                break;
            case 2:
                System.out.print("Masukkan Lama Sewa    : ");
                game2.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                game2.nama_member = sc.nextLine();
                game2.strukSewa();
                break;
            case 3:
                System.out.print("Masukkan Lama Sewa    : ");
                game3.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                game3.nama_member = sc.nextLine();
                game3.strukSewa();
                break;
            case 4:
                System.out.print("Masukkan Lama Sewa    : ");
                game4.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                game4.nama_member = sc.nextLine();
                game4.strukSewa();
                break;
        }
    }
}