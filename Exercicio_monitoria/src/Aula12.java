import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		// Fazer um programa para ler diversos n�meros informados pelo usu�rio usando o comando do while, 
		//e ap�s cada leitura exibir se o n�mero � par ou �mpar. 
		//Considere que ao fornecer um valor negativo o usu�rio deseja encerrar e entrada de dados.

		int num = 0;
		int contadorpar = 0, contadorimpar = 0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			num = s.nextInt();

			if ( num %2 == 0) {
				System.out.println("O n�mero digitado � par: " + contadorpar++);
				num = contadorpar;
			} else 
				System.out.println("O n�mero � impar: " + contadorimpar++);
				num = contadorimpar;
			}
			while ( num >= 0 );
		}
}