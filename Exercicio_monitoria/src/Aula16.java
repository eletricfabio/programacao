import java.util.Scanner; // import (importa��o de bibliotecas) / Scanner (leitura de dados)

public class Aula16 { // public (p�blica, ou seja � vis�vel)

	public static void main(String[] args) { // main (m�todo principal do programa) / void (n�o retorna nenhum valor)
		// Manipula��o de elementos
		Scanner s = new Scanner(System.in); // leitura da entrada de dados
		
		int[][] matriz = new int[3][3]; // int "Matriz" (declata��o de dados intreiros)
		
		System.out.println("Matriz M[3][3]\n"); // \n quebra de linha
		
		for(int linha = 0 ; linha < 3 ; linha ++) { // for (para) entrar no primeiro la�o
			for(int coluna = 0 ; coluna < 3 ; coluna ++) { // for (para) entrar no segundo la�o
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1,coluna + 1); // l� repetidamente a declara��o informada pelo usu�rio // [%d] diretivas de n�meros inteiros
				matriz[linha][coluna]=s.nextInt();
				}
		} // bloco de instru��es do la�o
		
		System.out.println("\nA Matriz ficou: \n");
		for(int linha = 0 ; linha < 3 ; linha ++) {
			for(int coluna = 0 ; coluna < 3 ; coluna ++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]); 
			}
			System.out.println();
		}
		s.close();
	}
}