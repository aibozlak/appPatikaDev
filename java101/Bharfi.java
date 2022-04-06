import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız. (Köşeli B)
 * Not: Harfin boyutunu kullanıcı belirlesin istitorum.
*/

public class Bharfi {

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);	
		System.out.print("B harfinin genişliği için 2'den BÜYÜK bir doğal sayı giriniz: ");
      int genislik = input.nextInt();
      System.out.print("Boyu için 4'den BÜYÜK bir TEK doğal sayı giriniz: ");
      int boy = input.nextInt();

      if (genislik > 2 && boy > 4 && boy % 2 == 1){   // <------ Kullanıcı girdi kontrolü

         String[][] bHarfi = new String[boy][genislik];
         String bosluk = " ";
         for (int k = 2; k <= genislik-2; k++){ bosluk += ""; }  // <-------- " " bosluk eklenmemesi

         for (int i = 0; i < boy; i++){   // <------- Matrise * veya boşluk yerleştirme bölümü
            for (int j = 0; j < genislik; j++){
               if (i == 0 || i == boy-1 || i == (boy-1)/2 || j == 0 || j == genislik-1){ 
                  bHarfi[i][j] = "*";
               } else { 
                  bHarfi[i][j] = bosluk; 
               }
            }
         }

         for (String[] row : bHarfi){  // <----- B harfini bastırma
            for (String cell : row){
               System.out.print(cell);
            }
            System.out.println();
         }

      } else { System.out.println("Harfi oluşturabilmemiz için istenilen koşulları sağlayınız"); }
	}

}
