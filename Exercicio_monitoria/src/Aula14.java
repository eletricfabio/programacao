import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		// Calcule e exiba a soma de todos os n�meros pares contidos entre zero e um n�mero fornecido via teclado 
		// (caso o n�mero fornecido seja par, o mesmo dever� fazer parte da soma).
		
		int num = 0;
		int total;
		int contadorpar = 0, contadorimpar = 0;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Digite um n�mero: ");
		total = s.nextInt();
		
		for (num = 1; num <= total; num++) {
			if ( num %2 == 0) {
				contadorpar++;
			} else {
				contadorimpar++;
			}
		} if (contadorpar >= 1) {
		System.out.println("Total de n�meros pares: " + contadorpar);
		}
			if (contadorimpar >= 1) {
		System.out.println("Total de n�meros impares: " + contadorimpar);
		}
	}
}