import java.util.Arrays;  // <------ toString() kullanabilmek için eklendi.

/* 
 * app.patika.dev/aibozlak
 * Ödev: Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
*/

public class DizidekiElemanlarinFrekansi {

   // Girilen bir dizide girilen bir değerden var mı diye kontrol fonsiyonu:
   static boolean suDizideTekrariVar(int[] array, int value){
      for (int eleman : array){
         if(eleman == value){ return true; }
      }
      return false;
   }

   // Girilen dizideki elemanların frekanslarını (tekrar sayılarını) yazdıran fonksiyon:
	static void elemanlarinFrekansiniYazdir(int[] array){
      int[] taranmisElemanlar = new int[array.length]; 
      int sayici, taranmisIndis = 0;  // <---------- taranmisIndis: taranmisElemanlar dizisine eleman ekleneceğinde bir sonraki indise geçmek için.
      for (int i = 0; i < array.length; i++){
         if (suDizideTekrariVar(taranmisElemanlar,array[i])){ continue; }
         sayici = 1;
         for (int j = i+1; j < array.length; j++){
            if (array[i] == array[j]){ sayici++; }
         }
         System.out.println(array[i] + " elemanından " + sayici + " tane var");

         taranmisElemanlar[taranmisIndis] = array[i];
         taranmisIndis++;
      }

      // Dizideki son eleman için:
      if (suDizideTekrariVar(taranmisElemanlar,array[array.length-1]) == false){
         System.out.println(array[array.length-1] + " elemanından 1 tane var");
      }
   }

	public static void main(String[] arguments) {
      int[] array1 = {10, 20, 20, 10, 10, 20, 5, 20, -4};
      elemanlarinFrekansiniYazdir(array1);
      System.out.println("Dizi: " + Arrays.toString(array1));
	}

}
