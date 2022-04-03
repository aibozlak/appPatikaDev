import java.util.Scanner;

// app.patika.dev/aibozlak
// Ödev: Girilen sayıya kadar 4 ve 5'in kuvvetlerini yazan program

public class DortBesKuvvetleri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\n1'den büyük bir sayı giriniz: ");
		int sayi = input.nextInt();
		
		if (sayi >= 1) {
			for (int x = 1; x <= sayi; x *= 4) {
				System.out.print(x + " ");
			}
			for (int y = 5; y <= sayi; y *= 5) {
				System.out.print(y + " ");
			}
		} else {
			System.out.println("Girdiğiniz sayı en az bir olmalıdır.");
		}
	}

}
