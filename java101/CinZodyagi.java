import java.util.Scanner;

/**
  * @author app.patika.dev/aibozlak
  *
  * Kullanıcının Çin Zodyağına göre burcunu veren program ödevi
*/ 

public class CinZodyagi {
 public static void main (String[] arguments){

  Scanner input = new Scanner(System.in);
   
  System.out.println("\nÇin Zodyağına Göre Burcunuzu Bulalım");
  System.out.print("\nLütfen doğum yılınızı giriniz: ");
  int yil = input.nextInt();
   
  System.out.print("\nÇin Zodyağına göre burcunuz: ");
  switch(yil % 12){
    case 0:
      System.out.println("Maymun :)");
      break;
    case 1:
      System.out.println("Horoz");
      break;
    case 2:
      System.out.println("Köpek");
      break;
    case 3:
      System.out.println("Domuz");
      break;
    case 4:
      System.out.println("Fare");
      break;
    case 5:
      System.out.println("Öküz (Pu-ha-ha-ha)");
      break;
    case 6:
      System.out.println("Kaplan (Vayy)");
      break;
    case 7:
      System.out.println("Tavşan");
      break;
    case 8:
      System.out.println("Ejderha (Vayyy)");
      break;
    case 9:
      System.out.println("Yılan");
      break;
    case 10:
      System.out.println("At");  // ---> Veriyi giren kadınsa şu an gülüyor :)
      break;
    case 11:
      System.out.println("Koyun");
      break;
    default: 
      System.out.println("Yok. Maalesef Milattan Önce gelip negatif sayı girenlere hizmet veremiyoruz");         
  }
 }
}
