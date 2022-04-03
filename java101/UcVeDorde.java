import java.util.Scanner;

/**
  * @author app.patika.dev/aibozlak
  * Ödev: Girilen sayıya kadar 3 ve 4'e tam bölünen sayıların ortalamasını bulan program
*/ 

public class UcVeDorde {
 public static void main (String[] arguments){

  Scanner input = new Scanner(System.in);
   
  System.out.print("\nBir pozitif tamsayı giriniz: ");
  int sayi = input.nextInt();
  
  // Bir sayının 3 ve 4 e tam bölünebilmesi için 12'ye tam bölünmeli
  int toplam = 0;
  int adet = 0;
  
  for (int i = 12; i <= sayi; i += 12){
    toplam += i;  
    adet++;
  }
  adet = (sayi < 12) ? 1 : adet;
  int ortalama = toplam / adet;
  
  System.out.println("\nGirilen sayıya kadar 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

 }
}