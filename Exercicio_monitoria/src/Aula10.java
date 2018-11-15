import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		// 10- Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
		// calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá, digite a sua altura: ");
		double alt = s.nextDouble();
		
		double peso = ((72.7 * alt) - 58);
		System.out.printf("\nO seu peso ideal é: %.1f", peso);
		
	}

}