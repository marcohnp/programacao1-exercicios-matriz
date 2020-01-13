import java.util.Random;

public class ExeMatriz03 {

	public static void main(String[] args) {
		/* Faça um algoritmo que gere randomicamente uma matriz de 5 X 5 de
		inteiros positivos e mostre a soma de cada coluna separadamente. */
		
		Random gerador = new Random();
		
		final int numLinhas = 5;
		final int numColunas = 5;
		
		int somaColuna = 0;
		
		int[][] matriz = new int[numLinhas][numColunas];
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matriz[i][j] = gerador.nextInt(99);
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println("");
		}
		
		for (int j = 0; j < numColunas; j++) {
			for (int i = 0; i < numLinhas; i++) {
				somaColuna = somaColuna + matriz[i][j];
			}
			System.out.printf("Soma da coluna %d é: %d.\n", j, somaColuna);
			somaColuna = 0;
		}
	}

}
