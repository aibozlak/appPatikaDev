import java.util.Scanner;

// Girilen bir sayma sayısının harmonik serisini veren program

public class GirilenSayininHarmonikSerisi {
	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);
		System.out.print("\n0'dan farklı bir doğal sayı giriniz: ");
      int n = input.nextInt();

      double toplam = 0;
      for (int i = 1; i <= n; i++){
         double birBoluI = 1.0/i;   // -------> Java'da int/int (atanacak değikeni double olarak tanımlasak bile) int veriyor.
         toplam += birBoluI;
      }

      System.out.println("Girdiğiniz " + n + " sayısının harmonik serisi: " + toplam);
      
	}
}
