import java.util.Scanner;

// @author: app.patika.dev/aibozlak

public class UcakBileti {
 public static void main(String[] arguments){

  System.out.println("\nUçak Bileti Fiyatı Hesaplayan Program");
  Scanner input = new Scanner(System.in);

  // Veri alma Bölümü:
  System.out.print("\nGidilecek Mesafe (km): ");
  int km = input.nextInt();
  System.out.print("\nYaşınız: ");
  int yas = input.nextInt();
  System.out.print("\nYolculuk Tipi (Tek yön ise 1, Gidiş-Dönüş ise 2 giriniz): ");
  int yolculukTipi = input.nextInt();

  // Kod Bölümü:
  double birimFiyat = 0.10;
  double tekYonFiyati = birimFiyat * km;
  double ciftYonFiyati = 2 * tekYonFiyati;
   
  if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)){
   if (yolculukTipi == 2){
    if (yas < 12){
     System.out.println("\nBilet Fiyatı: " + (ciftYonFiyati * 0.3));  // ----> Toplam %70 indirim
    } else if (yas < 24){
     System.out.println("\nBilet Fiyatı: " + (ciftYonFiyati * 0.7));  // -----> Toplam %30 indirim
    } else if (yas < 65){
     System.out.println("\nBilet Fiyatı: " + ciftYonFiyati);  // -----> İndirimsiz
    } else {
     System.out.println("\nBilet Fiyatı: " + (ciftYonFiyati * 0.5));  // -----> Toplam %50 indirim
    }
   } else {
    if (yas < 12){
     System.out.println("\nBilet Fiyatı: " + (tekYonFiyati * 0.5));  // ---->  %50 indirim
    } else if (yas < 24){
     System.out.println("\nBilet Fiyatı: " + (tekYonFiyati * 0.9));  // -----> %10 indirim
    } else if (yas < 65){
     System.out.println("\nBilet Fiyatı: " + tekYonFiyati);  // -----> İndirimsiz
    } else {
     System.out.println("\nBilet Fiyatı: " + (tekYonFiyati * 0.7));  // -----> %30 indirim
    }
   }
  } else {
   System.out.println("\nHatalı Veri Girdiniz !");
  }
  
 }
}

/*
ÖDEV:
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
