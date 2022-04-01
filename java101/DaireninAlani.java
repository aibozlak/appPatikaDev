import java.util.Scanner;

public class DaireninAlani {
 public static void main (String[] arguments){

/** @author app.patika.dev/aibozlak
  *
  * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
  * 𝜋 sayısını = 3.14 alınız. 
*/ 

Scanner input = new Scanner(System.in);

System.out.print("\nDairenin yarıçap uzunluğu : ");
double r = input.nextDouble();

System.out.print("Dairenin merkez açısının derece cinsinden ölçüsü: ");
double alpha = input.nextDouble();

double pi = 3.14;

double alan = (pi * (r * r)) * (alpha/360);

System.out.println("Girdiğiniz değerlerdeki daire (veya daire parçasının) alanı : " + alan); 

 }
}