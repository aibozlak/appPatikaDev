import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev-1: Kullanıcıların matris oluşturması (Ödevden farklı olarak: Bu programda matris boyutunu kullanıcı belirliyor.)
 * Ödev-2: [0,100) arasında rasgele tamsayı üreten matris
*/

public class MatrisGirme {
	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);		
      int row, col;
      do {
         System.out.print("Satır sayısı: ");
         row = input.nextInt();
      } while (row < 1);
      do {
         System.out.print("Sütun sayısı: ");
         col = input.nextInt();
      } while (col < 1);

      // *************** Elemanları Kullanıcının Gireceği Bölüm ****************

      int[][] matris = new int[row][col];
      for (int i = 0; i < row; i++){
         for (int j = 0; j < col; j++){
            System.out.print((i+1) + ". satır " + (j+1) + ". sütundaki elemanı giriniz: ");
            matris[i][j] = input.nextInt();
         }
      }

      System.out.println("Oluşturduğunuz matris: ");
      for (int i = 1; i <= row; i++){
         for (int j = 1; j <= col; j++){
            System.out.print(matris[i-1][j-1] + "  ");
         }
         System.out.println();
      }

      // *************** Elemanların Rasgele Seçileceği Bölüm ****************

      int[][] matris2 = new int[row][col];
      for (int i = 0; i < row; i++){
         for (int j = 0; j < col; j++){ matris[i][j] = (int) (Math.random() * 100); }
      }

      System.out.println("Aynı boyutta rasgele matris: ");
      for (int i = 1; i <= row; i++){
         for (int j = 1; j <= col; j++){
            System.out.print(matris[i-1][j-1] + "  ");
         }
         System.out.println();
      }
	}
}
