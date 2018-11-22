import java.util.Scanner; // import (importação de bibliotecas) / Scanner (leitura de dados)

public class Aula16 { // public (pública, ou seja é visível)

	public static void main(String[] args) { // main (método principal do programa) / void (não retorna nenhum valor)
		// Manipulação de elementos
		Scanner s = new Scanner(System.in); // leitura da entrada de dados
		
		int[][] matriz = new int[3][3]; // int "Matriz" (declatação de dados intreiros)
		
		System.out.println("Matriz M[3][3]\n"); // \n quebra de linha
		
		for(int linha = 0 ; linha < 3 ; linha ++) { // for (para) entrar no primeiro laço
			for(int coluna = 0 ; coluna < 3 ; coluna ++) { // for (para) entrar no segundo laço
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1,coluna + 1); // lê repetidamente a declaração informada pelo usuário // [%d] diretivas de números inteiros
				matriz[linha][coluna]=s.nextInt();
				}
		} // bloco de instruções do laço
		
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