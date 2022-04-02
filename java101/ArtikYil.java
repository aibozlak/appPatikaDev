import java.util.Scanner;

/**
  * @author app.patika.dev/aibozlak
  *
  * Kullanıcının girdiği yılın artık yıl olup olmadığı
*/ 

public class ArtikYil {
 public static void main (String[] arguments){

  Scanner input = new Scanner(System.in);
   
  System.out.println("\nGirilen Yılın Artık Yıl Olup Olmadığı");
  System.out.print("\nBir yıl giriniz: ");
  int yil = input.nextInt();
  
  String sonuc = "";
  if (yil % 400 == 0 || (yil % 4 == 0  &&  yil % 100 != 0)){
    sonuc += "artık yıl";  
  } else {
    sonuc += "artık yıl değil";  
  }
  
  System.out.println("\nGirdiğiniz yıl: " + sonuc);

 }
}