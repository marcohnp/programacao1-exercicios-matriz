import java.util.Random;

public class ExeMatriz06 {

	public static void main(String[] args) {
		/*Elaborar um algoritmo que leia uma matriz M[6][6] e um valor A, e que
		após a leitura multiplique a matriz M pelo valor A e coloque os valores da matriz multiplicados
		por A em um vetor V(36). Escrever o vetor V no final. */
		
		Random gerador = new Random();
		
		final int numLinhas = 6;
		final int numColunas = 6;
		
		int[][] matrizM = new int[numLinhas][numColunas];
		int[] vetorV = new int[36];
		int valorA = 2, t = 0;
		
		System.out.println("Matriz M: ");
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				matrizM[i][j] = gerador.nextInt(99);
				System.out.printf("%d ", matrizM[i][j]);
			}
			System.out.println("");
		}
		
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				vetorV[t] = matrizM[i][j] * valorA;
				t++;
			}
		}
		
		System.out.println("");
		
		System.out.printf("Os valores da Matriz M multiplicados por %d e colocados no Vetor V são: \n", valorA);
		
		for (int i = 0; i < vetorV.length; i++) {
			System.out.printf("%d ", vetorV[i]);
		}

	}

}
