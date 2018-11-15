import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		// Calcule e exiba a soma de todos os números pares contidos entre zero e um número fornecido via teclado 
		// (caso o número fornecido seja par, o mesmo deverá fazer parte da soma).
		
		int num = 0;
		int total;
		int contadorpar = 0, contadorimpar = 0;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		total = s.nextInt();
		
		for (num = 1; num <= total; num++) {
			if ( num %2 == 0) {
				contadorpar++;
			} else {
				contadorimpar++;
			}
		} if (contadorpar >= 1) {
		System.out.println("Total de números pares: " + contadorpar);
		}
			if (contadorimpar >= 1) {
		System.out.println("Total de números impares: " + contadorimpar);
		}
	}
}