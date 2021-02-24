/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video_game;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class VideoGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoGame vd1 = new VideoGame(1001, 6000, "Joss");
        VideoGame vd2 = new VideoGame(1002, 4500, "Voss");
        VideoGame vd3 = new VideoGame(1003, 7000, "Boss");
        VideoGame vd4 = new VideoGame(1004, 5000, "Yoss");
        VideoGame vd5 = new VideoGame(1005, 3500, "Moss");
        
        System.out.println("============================");
        vd1.tampilGame();
        vd2.tampilGame();
        vd3.tampilGame();
        vd4.tampilGame();
        vd5.tampilGame();
        System.out.println("============================");
        
        System.out.print("Pilih ID Game         : ");
        int pil = sc.nextInt();
        switch(pil){
            case 1001:
                System.out.print("Masukkan Lama Sewa    : ");
                vd1.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                vd1.nama_member = sc.nextLine();
                vd1.tampilSewa();
                break;
            case 1002:
                System.out.print("Masukkan Lama Sewa    : ");
                vd2.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                vd2.nama_member = sc.nextLine();
                vd2.tampilSewa();
                break;
            case 1003:
                System.out.print("Masukkan Lama Sewa    : ");
                vd3.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                vd3.nama_member = sc.nextLine();
                vd3.tampilSewa();
                break;
            case 1004:
                System.out.print("Masukkan Lama Sewa    : ");
                vd4.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                vd4.nama_member = sc.nextLine();
                vd4.tampilSewa();
                break;
            case 1005:
                System.out.print("Masukkan Lama Sewa    : ");
                vd5.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                vd5.nama_member = sc.nextLine();
                vd5.tampilSewa();
                break;
        }
    }
}
