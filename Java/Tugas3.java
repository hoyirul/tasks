import java.util.Scanner;
class Tugas3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0, count = 0;
		System.out.print("Masukkan Nilai N : ");
		int n = sc.nextInt();

		for (int i=0;i<=n;i++) {
			// x += i + 1;
			count += 2;
			if (count % 2 == 0) {
				if (count % 4 == 0) {
					continue;
				}
				System.out.print(count + ",");
			}
		}
	}
}