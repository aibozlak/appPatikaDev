import java.util.Scanner;

/** @author app.patika.dev/aibozlak
 *
 * Ödev: Manav Kasa Programı
 *
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
*/ 


public class ManavKasaProgrami {
 public static void main(String[] arguments){

Scanner input = new Scanner(System.in);
double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
   
System.out.print("Armut kaç kg : ");
double armutKg = input.nextDouble();
System.out.print("Elma kaç kg : ");
double elmaKg = input.nextDouble(); 
System.out.print("Domates kaç kg : ");
double domatesKg = input.nextDouble();  
System.out.print("Muz kaç kg : ");
double muzKg = input.nextDouble();
System.out.print("Patlıcan kaç kg : ");
double patlicanKg = input.nextDouble();

double tutar = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
System.out.println("\nToplam Tutar: " + tutar);
  
 }
}