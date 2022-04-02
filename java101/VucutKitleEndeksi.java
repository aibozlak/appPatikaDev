import java.util.Scanner;

/** @author app.patika.dev/aibozlak
 *
 * Ödev:
 * Vücut Kitle İndeksi Hesaplama
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. 
 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 *
 * Formül
 * Kilo (kg) / Boy(m) * Boy(m) 
*/ 


public class VucutKitleEndeksi {
 public static void main(String[] arguments){

Scanner input = new Scanner(System.in);
   
System.out.println("\nVücut Kitle Endeksi Hesaplama");
System.out.print("Kilonuzu giriniz: ");
int kg = input.nextInt();
System.out.print("Boyunuzu metre cinsinden giriniz (virgül kullanarak): ");
double boy = input.nextDouble();

double vki = kg / (boy * boy);
System.out.println("Vücut Kitle Endeksiniz: " + vki);   
  
 }
}