import java.util.Random;

public class ExeMatriz08 {

	public static void main(String[] args) {
		/* Faça um algoritmo que calcule a média dos elementos da diagonal principal
		de uma matriz 10X10 de inteiros. Criar matriz randomicamente. */
		
		Random gerador = new Random();
		
		final int numLinhas = 10;
		final int numColunas = 10;
		
		int[][] matriz = new int[numLinhas][numColunas];
		int somaDiagonal = 0, mediaDiagonal, divisor = 10;
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matriz[i][j] = gerador.nextInt(99);
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println("");
		}

		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				if (i == j) {
					somaDiagonal += matriz[i][j];	
				}
			}
		}
		
		mediaDiagonal = somaDiagonal / divisor;
		
		System.out.println("");
		
		System.out.printf("A média dos números da diagonal principal da matriz é %d.\n", mediaDiagonal);
	}

}
