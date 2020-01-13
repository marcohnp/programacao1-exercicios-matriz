import java.util.Random;

public class ExeMatriz07 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que leia uma matriz M[5][5] e que calcule e imprima
		as somas:
		a) da linha 4 de M.
		b) da coluna 2 de M.
		c) da diagonal principal (une o canto superior esquerdo ao canto inferior direito da
		matriz quadrada).
		d) todos os elementos da matriz M.
		Escrever também a matriz.
		Dica para calcular a diagonal principal
		if(i == j){
		soma += matrizM[i][j];
		} */

		Random gerador = new Random();
		final int numLinhas = 5;
		final int numColunas = 5;
		
		int[][] matrizM = new int[numLinhas][numColunas];
		int somaColuna = 0, somaLinha = 0, somaDiagonal = 0;
		
		System.out.println("Matriz M: ");
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matrizM[i][j] = gerador.nextInt(99);
				System.out.printf("%d ", matrizM[i][j]);
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		
		for (int j = 0; j < numColunas; j++) {
			somaLinha = somaLinha + matrizM[4][j];
		}
		
		System.out.printf("A soma da linha 4 é %d.\n", somaLinha);
		
		for (int i = 0; i < numLinhas; i++) {
			somaColuna = somaColuna + matrizM[i][2];
		}
		
		System.out.printf("A soma da coluna 2 é %d.\n", somaColuna);
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				if (i == j) {
					somaDiagonal = somaDiagonal + matrizM[i][j];
				}
			}
		}
		
		System.out.printf("A soma da diagonal principal é %d.\n", somaDiagonal);
	}

}
