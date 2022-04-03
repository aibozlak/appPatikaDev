import java.util.Scanner;

/*
 *  app.patika.dev/aibozlak
 *  Ödev: Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */

public class UcSayiSiralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nİlk sayıyı (a) giriniz: ");
		int a = input.nextInt();
		System.out.print("\nİlk sayıdan farklı ikinci sayıyı (b) giriniz: ");
		int b = input.nextInt();
		System.out.print("\nİlk iki sayıdan farklı üçüncü sayıyı (c) giriniz: ");
		int c = input.nextInt();

		if (a == b || a == c || b == c) {
			System.out.println("\nSayıları birbirinden farklı girmeniz gerekmekte..");
		} else {
			if (a < b && a < c) {
				if (b < c) {
					System.out.println("a < b < c");
				} else {
					System.out.println("a < c < b");
				}
			} else if (b < a && b < c) {
				if (a < c) {
					System.out.println("b < a < c");
				} else {
					System.out.println("b < c < a");
				}
			} else {
				if (a < b) {
					System.out.println("c < a < b");
				} else {
					System.out.println("c < b < a");
				}
			}
		}

	}
}