import java.util.Scanner;

/**
  * @author app.patika.dev/aibozlak
  * Ödev: Kullanıcı tek sayı girene kadarki girdiği sayılardan 4'ün katı olanların toplamı
*/ 

public class DordunKatlari {
 public static void main (String[] arguments){

  Scanner input = new Scanner(System.in);
   
  int toplam = 0;
  int sayi;
  do{
    System.out.print("\nBir sayı giriniz: ");
    sayi = input.nextInt();
    
    if (sayi % 4 == 0){ toplam += sayi; }
  } while(sayi % 2 == 0);
  
  System.out.println("\nGirdiğiniz sayılardan 4'ün katı olanlarının toplamı: " + toplam);

 }
}