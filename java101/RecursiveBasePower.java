import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini 
 * "Recursive" metot kullanarak yapan programı yazınız.
*/

public class RecursiveBasePower {

   static double usAl(double taban, int us){
      if (us == 0){ return 1; }
      return taban * usAl(taban, us-1);
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);
      System.out.print("Şu sayının: "); 
      double taban = input.nextDouble();
      System.out.print("Şu doğal sayı kuvveti: "); 
      int us = input.nextInt();

      if (us < 0 || (taban == 0 && us == 0)){
         System.out.println("Geçersiz bir sayı girdiniz!");
      } else {
         System.out.println("Sonuç: " + usAl(taban,us));
      }
	}
}
