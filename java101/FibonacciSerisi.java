import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Fibonacci dizisinin n. elemanını ve ilk n elemanının toplamını veren program.
 * Fibonacci dizisi = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, .....]
*/

public class FibonacciSerisi {

   static int fibonacciElemani(int n){
      if (n == 1 || n == 2){ return 1; }
      return fibonacciElemani(n-1) + fibonacciElemani(n-2);
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);	
      System.out.print("Bir sayma sayısı giriniz: ");
      int n = input.nextInt();

      System.out.println(n + ". Fibonacci elemanı: " + fibonacciElemani(n));

      int toplam = 0;
      for (int i = 1; i <= n; i++){ toplam += fibonacciElemani(i); }
      System.out.println("Fibonacci dizisindeki ilk " + n + " elemanın toplamı: " + toplam);
	}
}
