import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * [1,20] arasında rasgele üretilmiş bir tamsayıyı tahmin etme oyunu: 
   Not: 3 tahmin hakkı vermiştim hiç tutturamayınca 5'e çıkardım :) O halde bile 1 kez kazandım :)
*/

public class SayiTahminEtme {

	public static void main(String[] arguments) {
      int rasgeleSayi = ((int) (Math.random() * 20)) + 1;

		Scanner input = new Scanner(System.in);	
      int tahmin; 
      String sonuc = "Maalesef tutturamadınız";
      System.out.println("1 ile 20 arasında rasgele bir sayı seçildi (1 ve 20 dahil). \nBu sayıyı bulmak için 5 tahmin hakkınız var");
      
      for (int i = 1; i < 6; i++){  // <------- 5 tahmin hakkı verildi 
         System.out.print(i + ". tahmin: ");
         tahmin = input.nextInt(); 
         if (tahmin < 0 || tahmin > 20){
            System.out.println("1 ve 20 aralığında bir tahmin yapmalıydınız. " + i + ". tahmin boşa gitti!");
         }

         if (tahmin == rasgeleSayi){ sonuc = "**** Kazandınız ****"; break; }
      }

      System.out.println("Sonuç: " + sonuc);
      if (sonuc.equals("Maalesef tutturamadınız")){
         System.out.println("Sayı şuydu: " + rasgeleSayi);
      }
	}

}
