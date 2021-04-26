import java.util.Scanner; // Librari input
class Anton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner
        int[] arr; // Array 1 DIMENSI
        int n, max, min, sum = 0, count = 0; // Deklarasi variable n, max, min, sum dan count
        double avg = 0; // deklarasi var average atau rerata

        System.out.print("Masukkan banyaknya data nilai : ");
        n = sc.nextInt(); // input n
        arr = new int[n]; // jumlah banyaknya nilai yang akan di ulang
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");            
            arr[i] = sc.nextInt();
        }

        max = arr[0]; // max - nilai terbesar
        min = arr[0]; // min - nilai terkecil
        for(int i=0;i<arr.length;i++){
            sum += arr[i]; // menjumlah seluruh nilai array
            count++; // banyaknya data yang ada pada array
            if(arr[i] > max){ // kondisi max
                max = arr[i];
            }else if(arr[i] < min){ // kondisi min
                min = arr[i];
            }
        }

        System.out.println("Data MIN  = " + min); // output min
        System.out.println("Data MAX  = " + max); // output max

        avg = sum / count; // proses average
        System.out.println("RATA-RATA = " + avg); // output average
    }
}