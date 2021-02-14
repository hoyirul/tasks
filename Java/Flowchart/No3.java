import java.util.Scanner;
class Seconds{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int days, hours, minutes, seconds, remTime;

		System.out.print("Input detik(n) : ");
		n = sc.nextInt();

		days = n / 86400;
		remTime = n % 86400;
		hours = remTime / 3600;
		remTime = remTime % 3600;
		minutes = remTime / 60;
		remTime = remTime % 60;
		seconds = remTime;

		System.out.print(days + " Days " + hours + " Hours " + minutes + " Minutes " + seconds + " Seconds ");
	}
}