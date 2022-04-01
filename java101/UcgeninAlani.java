import java.util.Scanner;

public class UcgeninAlani {
 public static void main (String[] arguments){

/** @author app.patika.dev/aibozlak
  * 
  * Üç kenarının uzunluğunu kullanıcıdan aldığımız bir üçgenin 
  * alanını hesaplayan program:
*/ 

Scanner input = new Scanner(System.in);

System.out.print("\nÜçgenin 1. kenar uzunluğunu giriniz: ");
double kenar1 = input.nextDouble();

System.out.print("Üçgenin 2. kenar uzunluğunu giriniz: ");
double kenar2 = input.nextDouble();

System.out.print("Üçgenin 3. kenar uzunluğunu giriniz: ");
double kenar3 = input.nextDouble();

double cevre = kenar1 + kenar2 + kenar3;
double cevreYarisi = cevre/2;
double alan = Math.sqrt(cevreYarisi * (cevreYarisi-kenar1) * (cevreYarisi-kenar2) * (cevreYarisi-kenar3));

System.out.print("Girdiğiniz kenarlara sahip üçgenin alanı: " + alan);

 }
}