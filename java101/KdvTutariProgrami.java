import java.util.Scanner;

public class KdvTutariProgrami {
 public static void main (String[] arguments){

/**
  * @author app.patika.dev/aibozlak
  *
  * Diyelim ki market işletiyoruz ve toptancıdan ürün aldık.
  * Bize kesilen faturadaki KDV'siz miktarı girdiğimizde,
  * aldığımız ürünün KDV'siz ve KDV'li fiyatlarını ve KDV tutarını bize 
  * veren program yazmak istiyoruz.
  *
  * KDV orani ürün fiyatı 1000 TL'den az ise %18, çok ise %8
*/ 

System.out.println("\nKDV Tutarı Hesaplayan Program\n");

Scanner input = new Scanner(System.in);

System.out.print("Faturadaki KDV'siz tutarı giriniz: ");
double kdvSizTutar = input.nextDouble();


//------------- Hesaplama ve Çıktı Verme Bölümü -----------
double kdvCarpani = kdvSizTutar >= 1000 ? 0.08 : 0.18;
double kdvTutari = kdvSizTutar * kdvCarpani;
double kdvLiTutar = kdvSizTutar + kdvTutari; 

System.out.println("KDV Tutari: " + kdvTutari);
System.out.println("Ürünün KDV'li Fiyatı: " + kdvLiTutar);
System.out.println("Ürünün KDV'siz Fiyatı: " + kdvSizTutar + " (Bu bilgiyi neden veriyorsun diyebilirsin. Valla benim suçum yok)");
 }
}