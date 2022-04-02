import java.util.Scanner;

/** @author app.patika.dev/aibozlak
 *
 * Ödev:
 * Temel Hesap Makinesi (switch-case ile) 
*/ 


public class HesapMakinesi {
 public static void main(String[] arguments){

Scanner input = new Scanner(System.in);

System.out.print("\nİşlem türleri için yazılmaı gereken rakamlar: \nToplama: 1 \nÇıkarma: 2 \nÇarpma: 3, \nBölme: 4 \n\n");
   
// Kullanıcıdan veri alma
System.out.print("İlk sayıyı giriniz: ");
double sayi1 = input.nextDouble();
System.out.print("İşlem türünü giriniz: ");
int islemTuru = input.nextInt();
System.out.print("İkinci sayıyı giriniz: ");
double sayi2 = input.nextDouble();  

switch (islemTuru){
 case 1: 
  System.out.println("Toplam: " + (sayi1 + sayi2)); 
  break;
 case 2: 
  System.out.println("Çıkarma: " + (sayi1 - sayi2)); 
  break;
 case 3: 
  System.out.println("Çarpım: " + (sayi1 * sayi2)); 
  break;
 case 4: 
  if (sayi2 == 0){
   System.out.println("Bölme işleminde bölen sayı (ikinci sayı) 0 olamaz!"); 
  } else {
   System.out.println("Bölüm: " + (sayi1 / sayi2)); 
  }
  break;
 default: 
   System.out.println("Geçersiz işlem türü girdiniz !");
}
  
 }
}