import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Girilen bir sayının Palindrom sayı olup olmadığını söyleyen program
*/
 
public class Palindrom {

   static boolean isPalindrom(int n){  // ----> Videoyu izlemeden önce tanımladığım fonksiyon
      String x = "" + n;
      int length = x.length();
      for (int i = 1; i <= length; i++){
         if (x.charAt(i-1) != x.charAt(length-i)){ return false; }
      }
      return true;
   }

   static boolean isPalindrom2(int n){ // ****** Videodaki güzel çözüm yöntemi ile tanımlanan fonksiyon *****
      int temp = n, reverseN = 0, lastNumber;
      while (temp != 0){
         lastNumber = temp % 10;
         temp /= 10;
         reverseN = (reverseN * 10) + lastNumber;
      }
      if (reverseN == n){ return true; } else { return false; }
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);
      System.out.print("Bir doğal sayı giriniz: ");
      int n = input.nextInt();

      if (n >= 0){
         if (isPalindrom2(n)){ System.out.println("Girdiğiniz sayı Palindromdur."); }
         else { System.out.println("Girdiğiniz sayı Palindrom değildir."); }
      } else {
         System.out.println("Girdiğiniz sayı doğal sayı değildir..");
      }
	}
}
