import java.util.Arrays;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazma
*/

public class TekrarEdenCiftSayilar {

   // Tekrar eden çift sayi var mi diye kontrol fonksiyonu:
   static boolean tekrarEdenCiftSayiVar(int[] array){
      for (int i = 0; i < array.length; i++){
         for(int j = i+1; j < array.length; j++){
            if (array[i] == array[j] && array[i] % 2 == 0){ return true; }
         }
      }
      return false;
   }

   // Girilen bir dizide girilen bir değerden var mı diye kontrol fonsiyonu:
   static boolean suDizideTekrariVar(int[] array, int value){
      for (int eleman : array){
         if(eleman == value){ return true; }
      }
      return false;
   }

   // Tekrar eden çift sayinin olduğu garantilendikten sonra, bu sayilari/sayiyi çıktı olarak veren fonksiyon:
   static int[] tekrarCiftler(int[] array){  
      int[] tekrarlilar = new int[array.length];
      int indis = 0;
      for (int i = 0; i < array.length; i++){
         for (int j = i+1; j < array.length; j++){
            if (array[i] == array[j] && array[i] % 2 == 0 && suDizideTekrariVar(tekrarlilar,array[i]) == false){
               tekrarlilar[indis] = array[i];
               indis++;
            }
         }
      }
      return tekrarlilar;
   }

	public static void main(String[] arguments) {

		int[] array = {3,4,3,8,-8,5,3,6,5,4,2,-7,12,42,8};	

      if (tekrarEdenCiftSayiVar(array)){
         int[] tekrarliCiftSayilar = tekrarCiftler(array);
         System.out.print("Dizideki tekrar edenler: ");
         for (int eleman : tekrarliCiftSayilar){
            if (eleman != 0){ System.out.print(eleman + "  "); }
         }
         System.out.println();
      } else {
         System.out.println("Dizide tekrar eden sayı yok.");
      }

      System.out.println("Dizi: " + Arrays.toString(array));

	}

}
