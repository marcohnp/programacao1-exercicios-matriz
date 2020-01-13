import java.util.Scanner;

public class ExeMatriz05 {

	public static void main(String[] args) {
		/*Dadas duas matrizes A 5x5 e B 5x5 inicializadas pelo usuário via teclado,
		criar e imprimir a matriz S sendo a soma de A e B.*/
		
		Scanner sc = new Scanner(System.in);
		
		final int numLinhas = 5;
		final int numColunas = 5;
		
				
		int[][] matrizA = new int[numLinhas][numColunas];
		int[][] matrizB = new int[numLinhas][numColunas];
		int[][] matrizS = new int[numLinhas][numColunas];
		
		
		System.out.println("Digite valores para a Matriz A: ");
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matrizA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		System.out.println("Digite valores para a Matriz B: ");
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matrizB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				System.out.printf("%d ", matrizA[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				System.out.printf("%d ", matrizB[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.printf("%d ", matrizS[i][j]);
			}
			System.out.println("");
		}
			
		
		
			
		sc.close();	
			
	}
		
		
}

