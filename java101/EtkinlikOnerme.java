import java.util.Scanner;

// @author: app.patika.dev/aibozlak

// Not: Videodaki koşullar kabul edildi. Ödev kısmına koşullar yanlış yazılmış sanırım. 
//      Koşullarda çakışma yok çünkü.

public class EtkinlikOnerme {
 public static void main(String[] arguments){

System.out.println("\nHava Sıcaklığına Göre Etkinik Önerme");
Scanner input = new Scanner(System.in);

System.out.print("\nHava sıcaklığını giriniz: ");
int heat = input.nextInt();

if (heat < 5){
 System.out.println("\nKayak yapmayı düşünebilirsiniz");
} else if (heat < 10){
 System.out.println("\nSinemaya gitmeyi düşünebilirsiniz");
} else if (heat < 15){
 System.out.println("\nSinemaya gitmeyi veya piknik yapmayı düşünebilirsiniz");
}  else if (heat < 25){
 System.out.println("\nPiknik yapmayı düşünebilirsiniz");
} else {
 System.out.println("\nYüzme düşünebilirsiniz");
}

 }
}
