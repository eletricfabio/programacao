import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		// Fazer um programa para ler diversos números informados pelo usuário usando o comando do while, 
		//e após cada leitura exibir se o número é par ou ímpar. 
		//Considere que ao fornecer um valor negativo o usuário deseja encerrar e entrada de dados.

		int num = 0;
		int contadorpar = 0, contadorimpar = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = s.nextInt();

			if ( num %2 == 0) {
				System.out.println("O número digitado é par: " + contadorpar++);
				num = contadorpar;
			} else 
				System.out.println("O número é impar: " + contadorimpar++);
				num = contadorimpar;
			}
			while ( num >= 0 );
		}
}