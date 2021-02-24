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
public class VideoGame {
    int id, lama_sewa;
    double harga_sewa;
    String nama_member, nama_game;
    
    VideoGame(){
        
    }
    
    VideoGame(int id, double harga_sewa, String nama_game){
        this.id = id;
        this.harga_sewa = harga_sewa;
        this.nama_game = nama_game;
    }
    
    void tampilGame(){
        //System.out.println("ID  Game   Harga");
        System.out.println(id + "   " + nama_game + "   " + harga_sewa);
    }
    
    void tampilSewa(){
        System.out.println("Nama Penyewa    : " + nama_member);
        System.out.println("ID/Nama Game    : " + id + "/" + nama_game);
        System.out.println("Harga Sewa      : " + harga_sewa);
        System.out.println("Lama Sewa       : " + lama_sewa);
        System.out.println("Total Bayar     : " + pembayaran());
    }
    
    double pembayaran(){
        double x = (lama_sewa * harga_sewa);
        return x;
    }
}
