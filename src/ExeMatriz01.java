import java.util.Random;

public class ExeMatriz01 {

	public static void main(String[] args) {
		/* Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9,
		imprima a matriz e calcule e imprima a soma dos seus elementos. */
		
		Random gerador = new Random();
		
		final int numLinhas = 7;
		final int numColunas = 9;
		
		int soma = 0;
		
		int[][] matriz = new int [numLinhas][numColunas];
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matriz[i][j] = gerador.nextInt(99);
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println("");	
		}
		
		
		for (int i = 0; i< numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				soma = soma + matriz[i][j];
			}
		}

		System.out.printf("\nA soma dos elementos encontrados na matriz é: %d.", soma);
		
	}

}
