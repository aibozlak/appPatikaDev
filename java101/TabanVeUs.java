import java.util.Scanner;

// app.patika.dev/aibozlak
// Tabanı ve üssü girilen sayıyı bulma (For Döngüsü ile)

public class TabanVeUs {
	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nTaban: ");
		double taban = input.nextDouble();
      System.out.print("Bir doğal sayı üs giriniz: ");
      int us = input.nextInt();

      double carpim = 1;
      for (int i = 1; i <= us; i++){
         carpim *= taban;
      }
      
      System.out.println("\n" + taban + " sayısının " + us + ". kuvveti: " + carpim);
	}
}
