import java.util.Scanner;

// app.patika.dev/aibozlak

// Ödevler (Döngü konusu): 
// 1- Üç basamaklı Amstrong Sayıları 
// 2- Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

public class UcBasamakliAmstrong {
	public static void main(String[] arguments) {
		
      // ************************** 3 basamaklı Amstrong Sayıları ******************************
      String basilacakYazi = "\n3 basamakli Amstrong sayıları: ";
      
      for (int x = 100; x < 1000; x++){
         int gecici = x;  // ----> Her bir basamaktaki elemanı almak için kullanılacak. En sonki karşılaştırma x ile yapılacak.
         int toplam = 0;
         
         while (gecici != 0){ 
            int kalan = gecici % 10; 
            int carpim = 1;

            for (int j = 1; j < 4; j++){
               carpim *= kalan;
            }
            toplam += carpim;
            gecici /= 10;
         }

         if (toplam == x){ basilacakYazi += toplam + " "; }
      }

      System.out.println(basilacakYazi + "\n-------------------------\n");


      // ************************ Girilen bir sayının basamak sayılarının toplamı **********************
      Scanner input = new Scanner(System.in);
      System.out.print("Bir doğal sayı giriniz: ");
      int sayi = input.nextInt();

      int toplam = 0; 
      while(sayi != 0){
         int kalan = sayi % 10;
         toplam += kalan;
         sayi /= 10;
      }

      System.out.println("Girdiğiniz sayının rakamları toplamı: " + toplam);      
	}
}
