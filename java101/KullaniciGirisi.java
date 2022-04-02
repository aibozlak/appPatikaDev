import java.util.Scanner;

// @author app.patika.dev/aibozlak

public class KullaniciGirisi {
 public static void main(String[] arguments){

Scanner input = new Scanner(System.in);
String username, password;

System.out.print("\nKullanıcı adınızı giriniz: ");
username = input.nextLine();
System.out.print("Şifrenizi giriniz: ");
password = input.nextLine();

if (username.equals("patika") && password.equals("java123")){
 System.out.println("Giriş yapıldı.");
} else {
 System.out.println("Bilgiler hatalı!");
 System.out.print("Şifrenizi sıfırlamak ister misiniz? Evet için 1, hayır için 0 giriniz: ");
 int sifirlama = input.nextInt();
 
 if (sifirlama == 1){
  System.out.print("Yeni şifrenizi giriniz: " + input.nextLine());  // <------- Burası yeni bilgi -----
  String newPassword = input.nextLine();  

  if (newPassword.equals("java123") || newPassword.equals(password)){
   System.out.println("Şifreniz eski şifre ile veya az önce girdiğiniz şifre ile aynı olamaz!");
  } else {
   System.out.println("Şifreniz güncellendi.");
  }
 }
}
 
 }
}