import java.util.Random;

public class ExeMatriz02 {

	public static void main(String[] args) {
		/* Dada uma matriz M[1..6][1..8] criada randomicamente, criar um vetor C
		que contenha em cada posição a quantidade de elementos negativos da linha correspondente
		de M. Tamanho de C igual ao número de linhas da matriz. */
		final int numLinhas = 6;
		final int numColunas = 8;
		
		Random gerador = new Random();
		
		int[][] matrizM = new int[numLinhas][numColunas];
		int[] vetorC = new int[numLinhas];
		int somaNegativo = 0, t = 0;
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matrizM[i][j] = gerador.nextInt();
				System.out.printf("%d ", matrizM[i][j]);
			}
			System.out.println("");
		}
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				if (matrizM[i][j] < 0) {
					somaNegativo++;
				}
			}
			vetorC[t] = somaNegativo;
			t++;
			somaNegativo = 0;
		}
		System.out.println("");
		
		for (int i = 0; i < numLinhas; i++) {
			System.out.printf("Linha %d possui %d n�meros negativos.\n", i, vetorC[i]);
		}

	}

}
