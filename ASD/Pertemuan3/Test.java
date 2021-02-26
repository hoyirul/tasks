class konstruktor_inputberulang{    //nama konstruktor = nama kelas
    String nama;
    //variabel nama dengan type data String
    int umur;
    //variabel umur dengan type data integer
    char lagi = 'y';
     Scanner baca = new Scanner (System.in);
     konstruktor_inputberulang(String x, int y) {
        //konstruktor dengan pemberian parameter
       Scanner baca = new Scanner (System.in);
       System.out.println ("Masukkan Nama = ");
       x = baca.nextLine();
       System.out.println ("Masukkan umur = ");
       y = baca.nextInt();
       nama = x;
       umur = y;
    }

     void tampil () { 
         Scanner baca = new Scanner (System.in);
        System.out.println ("Nama Saya = "+nama);
        System.out.println ("Umur Saya= "+umur);
       }
    public static void main(String[]args){  
         for(String b = "y"; b.equals("y") || b.equals("Y");){ 
      //untuk iput iya atau tidak
      Scanner baca = new Scanner (System.in);
      System.out.println ("Berikut adalah Konstruktor dengan parameter");
       System.out.println ("============================================");
       konstruktor_inputberulang demoConstructor = new konstruktor_inputberulang("nama",2);
       //menginisialisasi & memanggil nama konstruktor
       //dan membaca nilai parameter
       demoConstructor.tampil();
        System.out.print("----------TERIMA KASIH----------");
        System.out.println ("");
        System.out.println ("APAKAH ANDA INGIN MENGULANG? Y/T ");
        b=baca.next();
      }
    
      for(String c = "T"; c.equals("t") || c.equals("T");){
           System.out.print("----------TERIMA KASIH----------");
        System.exit(0);
    }
}
}