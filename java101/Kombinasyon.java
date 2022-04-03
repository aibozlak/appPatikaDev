import java.util.Scanner;

// app.patika.dev/aibozlak
// Ödev: Girilen bir sayinin yine girilen bir sayıya göre kombinasyonunu veren program

public class Kombinasyon {
	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nŞu kadar elemana sahip bir topluluktan: ");
		int n = input.nextInt();
       		System.out.print("Şu kadar elemanı seçeceğim: ");
		int r = input.nextInt();

		if (r < n && r > 0 && n > 0){
			int nFactoriel = 1, rFactoriel = 1, n_rFactoriel = 1;
			for (int x = 2; x <= n; x++){ nFactoriel *= x; }
			for (int y = 1; y <= r; y++){ rFactoriel *= y; }
			for (int z = 1; z <= n-r; z++){ n_rFactoriel *= z; }

			double sonuc = nFactoriel / (rFactoriel * n_rFactoriel);
			System.out.println("\nŞu kadar farklı biçimde seçim yapabilirsiniz: " + sonuc);
		} else if (r > n){
			System.out.println("\nSeçmek istediğiniz sayı toplam eleman sayısından büyük olamaz!");
		} else if (r == n){
			System.out.println("\nSeçmek istediğiniz sayı toplam eleman sayısıyla aynı ise tek seçeneğiniz var.");
		} else {
			System.out.println("\nToplam eleman sayısı veya seçmek istediğiniz miktar negatif olamz!");
		}

	}
}
