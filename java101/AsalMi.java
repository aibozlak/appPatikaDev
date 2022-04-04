import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Java dilinde "Recursive" metot kullanarak, 
   kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/

public class AsalMi {

   static boolean asaldir(int n, int i){
      if (i == n){ return true; }
      if (n % i == 0){ return false; }
      return true && asaldir(n,i+1);  // <------- Bir tane bile false döndüren olursa sonuc false olur.
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);
      System.out.print("Bir doğal sayı giriniz: "); 
      int sayi = input.nextInt();

      if (sayi < 0){ System.out.println("Girdiğiniz sayı doğal sayı değil!"); }
      else if (sayi == 0){ System.out.println("0'ın sonsuz böleni vardır. Asal sayı değildir."); }
      else if (sayi == 1){ System.out.println("Asal sayılarda 1 hariç tutulur. Asal değildir."); }
      else {
         if (asaldir(sayi,2)){ System.out.println("Girdiğiniz sayı asaldır."); }
         else { System.out.println("Girdiğiniz sayı asal değildir."); }
      }
	}
}
