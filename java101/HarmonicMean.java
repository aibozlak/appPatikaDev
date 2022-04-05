import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Girilen tamsayıların harmonic ortalamasını alan bir program
*/

public class HarmonicMean {

	static double harmonicMean(int[] intArray){
      double sum = 0.0;
      for (int number : intArray){
         double reverseNumber = 1.0/number;
         sum += reverseNumber;
      }
      double result = intArray.length / sum;
      return result;
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);	
      int length;
      do{
         System.out.print("Gireceğiniz sayı miktarını giriniz: ");
         length = input.nextInt();
         if (length == 0){
            System.out.println("Sayı girmek istemiyorsanız bu programda ne işiniz var?");
         } else if (length < 0){
            System.out.println("Eksi bir sayı kadar sayı girmek ne demek, bir anlatır mısınız?");
         }
      } while (length < 1);

      int[] array = new int[length];
      for (int i = 1; i <= length; i++){
         System.out.print(i + ". tamsayıyı giriniz: ");
         array[i-1] = input.nextInt();
      }

      System.out.println("Girdiğiniz sayıların harmonik ortalaması: " + harmonicMean(array));
	}
	
}
