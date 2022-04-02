import java.util.Scanner;

// app.patika.dev/aibozlak

public class SinifGecme {
 public static void main(String[] arguments){

System.out.println("\nSınıf Geçti-Kaldı Hesaplayıcı");
Scanner input = new Scanner(System.in);

System.out.print("\nMatematik not ortalamanızı giriniz: ");
double mat = input.nextDouble();

System.out.print("Fizik not ortalamanızı giriniz: ");
double fizik = input.nextDouble();

System.out.print("Kimya not ortalamanızı giriniz: ");
double kimya = input.nextDouble();

System.out.print("Türkçe not ortalamanızı giriniz: ");
double turkce = input.nextDouble();

System.out.print("Müzik not ortalamanızı giriniz: ");
double muzik = input.nextDouble();



if ((mat >= 0 && mat <= 100) && (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100) && (turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)){
 double ortalama = (mat + fizik + kimya + turkce + muzik)/5;
 System.out.println("\nGenel not ortalamanız: " + ortalama);
 
 if (ortalama >= 55){
  System.out.println("Sınıfı geçtiniz. İyi tatiller..");
 } else {
  System.out.println("Kaldınız.");
 }
} else {
 System.out.println("\nGeçersiz bir not girdiniz !");
}


 }
}
