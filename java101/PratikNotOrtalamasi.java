import java.util.Scanner;

public class PratikNotOrtalamasi {
 public static void main(String[] arguments){

System.out.println("\nSınıf Geçti-Kaldı Hesaplayıcı");
Scanner input = new Scanner(System.in);

System.out.print("Matematik not ortalamanızı giriniz: ");
double mat = input.nextDouble();

System.out.print("Fizik not ortalamanızı giriniz: ");
double fizik = input.nextDouble();

System.out.print("Kimya not ortalamanızı giriniz: ");
double kimya = input.nextDouble();

System.out.print("Türkçe not ortalamanızı giriniz: ");
double turkce = input.nextDouble();

System.out.print("Tarih not ortalamanızı giriniz: ");
double tarih = input.nextDouble();

System.out.print("Müzik not ortalamanızı giriniz: ");
double muzik = input.nextDouble();

double ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;
System.out.print("Genel not ortalamanız: " + ortalama +" -----> ");
System.out.println(ortalama >= 60 ? "GEÇTİNİZ" : "KALDINIZ");

 }
}

// Dersler: Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik 