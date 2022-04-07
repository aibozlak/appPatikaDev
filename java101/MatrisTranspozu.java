import java.util.Scanner;

/* 
 * app.patika.dev/aibozlak
 * Ödev: Girilen bir Matrisin (tamsayı matrisi) transpozunu yazdıran program:
*/

public class MatrisTranspozu {

	static int[][] transpoz(int[][] matris){
      int[][] transpozu = new int[matris[0].length][matris.length];
      for (int i = 0; i < matris.length; i++){
         for (int j = 0; j < matris[0].length; j++){
            transpozu[j][i] = matris[i][j];
         }
      }
      return transpozu;
   }

	public static void main(String[] arguments) {
		Scanner input = new Scanner(System.in);	
      System.out.print("Transpozunu alacağınız matrisin satır sayısı: ");
      int r = input.nextInt();
      System.out.print("Sütun sayısı: ");
      int c = input.nextInt();

      int[][] girdiMatris = new int[r][c];  // ******* Kullanıcıdan matrisin elemanlarını alma ******
      for (int i = 0; i < r; i++){
         for (int j = 0; j < c; j++){
            System.out.print((i+1) + ". satır " + (j+1) + ". sütundaki tamsayı: ");
            girdiMatris[i][j] = input.nextInt();
         }
      }

      System.out.println("Girdiğiz matris: ");
      for (int[] row : girdiMatris){
         for (int cell : row){
            System.out.print(cell + "  ");
         }
         System.out.println();
      }

      int[][] transpozu = transpoz(girdiMatris);  // ******* Kullanıcıya matrisin transpozunu verme ******
      System.out.println("Girdiğiz matrisin transpozu: ");
      for (int[] row : transpozu){
         for (int cell : row){
            System.out.print(cell + "  ");
         }
         System.out.println();
      }
	}

}