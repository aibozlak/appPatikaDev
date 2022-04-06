import java.util.Scanner;
import java.util.Arrays;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve büyük en yakın sayıyı bulan programı yazınız.
*/

public class EnYakinKucukBuyuk {

	static boolean girilendenKucukVar(int[] array, int number){
      for (int eleman : array){
         if (eleman < number){ return true; }
      }
      return false;
   }

   static int kucuklerinEnBuyugu(int[] array, int number){ // <---- girilendenKucukVar(int[] array, int number) == true ise çalıştırılacak
      Arrays.sort(array);
      int result = array[0];
      for (int eleman : array){
         if (eleman < number && eleman > result){ result = eleman; }  // Eğer dizide girilen sayıyla aynı sayı varsa bunu vermesini istemiyorum.
      }
      return result;
   }

   static boolean girilendenBuyukVar(int[] array, int number){
      for (int eleman : array){
         if (eleman > number){ return true; }
      }
      return false;
   }

   static int buyuklerinEnKucugu(int[] array, int number){ // <---- girilendenBuyukVar(int[] array, int number) == true ise çalıştırılacak
      Arrays.sort(array);
      int result = array[array.length-1];
      for (int eleman : array){
         if (eleman > number && eleman < result){ result = eleman; }
      }
      return result;
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);
      int[] array = new int[10];
      for (int i = 0; i < array.length; i++){
         array[i] = (int) (Math.random() * 100);
      }

      System.out.print("Bir tamsayı giriniz: ");
      int girilen = input.nextInt();

      String stringArray = Arrays.toString(array);
      if (girilendenKucukVar(array,girilen)){
         System.out.println("Dizide girdiğiniz sayıdan küçük en yakın sayı: " + kucuklerinEnBuyugu(array,girilen));
      } else {
         System.out.println("Dizide girdiğiniz sayıdan küçük sayı yok.");
      }  
      if (girilendenBuyukVar(array,girilen)){
         System.out.println("Dizide girdiğiniz sayıdan büyük en yakın sayı: " + buyuklerinEnKucugu(array,girilen));
      } else {
         System.out.println("Dizide girdiğiniz sayıdan büyük sayı yok.");
      } 
      System.out.println("Dizi: " + stringArray);   	
	}

}
