import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SepedaMotor motorMenu = new SepedaMotor();
        SepedaMotor[] mtrArr = new SepedaMotor[4];
        mtrArr[0] = new SepedaMotor("Honda");
        mtrArr[1] = new SepedaMotor("Yamaha");
        mtrArr[2] = new SepedaMotor("Ducati");
        mtrArr[3] = new SepedaMotor("Suzuki");

        for(int i=0;i<mtrArr.length;i++){
            System.out.println((i+1) + " " + mtrArr[i].merk);
        }
        
        System.out.print("Pilih : ");
        int x = sc.nextInt();
        
        switch(x){
            case 1:
                System.out.println("1. Hidupkan Motor");
                System.out.println("2. Matikan Motor");
                System.out.println("3. Tambah Kecepatan Motor");
                System.out.println("4. Kurangi Kecepatan Motor");
                
                System.out.print("o> ");
                int y = sc.nextInt();
                switch(y){
                    case 1:
                        motorMenu.matikanMotor(true);
                        motorMenu.info();
                        break;
                    case 2:
                        motorMenu.matikanMotor(false);
                        motorMenu.info();
                        break;
                    case 3:
                        motorMenu.tambahKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    case 4:
                        motorMenu.kurangiKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    default:
                        System.out.println("Null");
                }
            case 2:
                System.out.println("1. Hidupkan Motor");
                System.out.println("2. Matikan Motor");
                System.out.println("3. Tambah Kecepatan Motor");
                System.out.println("4. Kurangi Kecepatan Motor");
                
                System.out.print("o> ");
                int y = sc.nextInt();
                switch(y){
                    case 1:
                        motorMenu.matikanMotor(true);
                        motorMenu.info();
                        break;
                    case 2:
                        motorMenu.matikanMotor(false);
                        motorMenu.info();
                        break;
                    case 3:
                        motorMenu.tambahKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    case 4:
                        motorMenu.kurangiKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    default:
                        System.out.println("Null");
                }
                break;
            case 3:
                System.out.println("1. Hidupkan Motor");
                System.out.println("2. Matikan Motor");
                System.out.println("3. Tambah Kecepatan Motor");
                System.out.println("4. Kurangi Kecepatan Motor");
                
                System.out.print("o> ");
                int y = sc.nextInt();
                switch(y){
                    case 1:
                        motorMenu.matikanMotor(true);
                        motorMenu.info();
                        break;
                    case 2:
                        motorMenu.matikanMotor(false);
                        motorMenu.info();
                        break;
                    case 3:
                        motorMenu.tambahKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    case 4:
                        motorMenu.kurangiKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    default:
                        System.out.println("Null");
                }
                break;
            case 4:
                System.out.println("1. Hidupkan Motor");
                System.out.println("2. Matikan Motor");
                System.out.println("3. Tambah Kecepatan Motor");
                System.out.println("4. Kurangi Kecepatan Motor");
                
                System.out.print("o> ");
                int y = sc.nextInt();
                switch(y){
                    case 1:
                        motorMenu.matikanMotor(true);
                        motorMenu.info();
                        break;
                    case 2:
                        motorMenu.matikanMotor(false);
                        motorMenu.info();
                        break;
                    case 3:
                        motorMenu.tambahKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    case 4:
                        motorMenu.kurangiKecepatanMotor(5);
                        motorMenu.info();
                        break;
                    default:
                        System.out.println("Null");
                }
                break;
            default:
                System.out.println("Tidak ada pilihan");
        }
    }
}