import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
 *       Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
*/

public class ElemanSiralama {

   // Girilen bir dizide girilen bir değerden var mı diye kontrol fonsiyonu:
   static boolean suDizideTekrariVar(int[] array, int value){
      for (int eleman : array){
         if(eleman == value){ return true; }
      }
      return false;
   }

   // Küçükten büyüğe sıralı dizi çıktısı veren fonksiyon:
   static int[] kucuktenBuyugeSirala(int[] array){
      int[] siralanmisDizi = new int[array.length];
      int iSiralanmisDizi = 0;
      for (int eleman : array){
         int minDeger = Integer.MAX_VALUE;
         for (int i = 0; i < array.length; i++){
            if (array[i] < minDeger && suDizideTekrariVar(siralanmisDizi,array[i]) == false){ minDeger = array[i]; }
         }         
         siralanmisDizi[iSiralanmisDizi] = minDeger;
         iSiralanmisDizi++;
      }

      return siralanmisDizi;
   }

	public static void main(String[] arguments) {

		Scanner input = new Scanner(System.in);	
      int n;
		  do{
         System.out.print("Gireceğiniz eleman sayısı: ");
         n = input.nextInt();
         if (n < 1){ System.out.println("Eleman sayısı 0'dan büyük doğal sayı olamalı!"); }
      } while (n < 1);

      int[] sayilar = new int[n];
      for (int i = 0; i < n; i++){
         System.out.print((i+1) + ". tamsayıyı giriniz: ");
         sayilar[i] = input.nextInt();
      }

      int[] siralanmisSayilar = kucuktenBuyugeSirala(sayilar);
      System.out.println("Girdiğiniz sayılar küçükten büyüğe: ");
      for (int eleman : siralanmisSayilar){
         System.out.print(eleman + "  ");
      }

	}

}
