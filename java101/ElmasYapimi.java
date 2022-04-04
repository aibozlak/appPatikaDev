import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Kullanıcıdan alınan satır sayısı kadar elmas yapımı
*/

public class ElmasYapimi {
	public static void main(String[] arguments) {
		Scanner scanner = new Scanner(System.in);
      System.out.print("En uzun satır kaçıncı satır olsun? : ");
      int n = scanner.nextInt();

      // Üst üçgeni oluşturalım:
      for (int i = 1; i <= n; i++){
         for (int j = 1; j <= n - i; j++){ System.out.print(" "); }
         for (int k = 1; k <= 2*i - 1; k++){ System.out.print("*"); }
         System.out.println();
	   }

      // Alt üçgen:
      int m = 2*n - 3;
      for (int i = 1; i <= n-1; i++){
         for (int j = 1; j <= i; j++){ System.out.print(" "); }
         for (int k = 1; k <= m; k++){ System.out.print("*"); }
         System.out.println();
         m -= 2;
      }
   }
}
