import java.util.Random;

public class ExeMatriz04 {

	public static void main(String[] args) {
		/* Faça um algoritmo que gere randomicamente uma matriz de 10 X 10 de
		inteiros. Calcule e mostre a soma das linhas pares da matriz. */
		
		Random gerador = new Random();
		
		final int numLinhas = 10;
		final int numColunas = 10;
		
		int somaLinhas = 0;
		
		int[][] matriz = new int[numLinhas][numColunas];
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matriz[i][j] = gerador.nextInt(99);
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				if (i%2==0) {
					somaLinhas = somaLinhas + matriz[i][j];
				}
			}
			if (i%2==0) {
				System.out.printf("Soma da linha %d é: %d.\n", i, somaLinhas);
			}	
			somaLinhas = 0;
		}
	}

}
