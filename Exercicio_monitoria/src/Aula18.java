import java.util.Scanner;

public class Aula18 {

	public static void main(String[] args) {
		// Fun��o com par�metro (sub-programa)
		Scanner s = new Scanner(System.in);
		//double a = abs(-100);
		//escreva(Double.toString(a));
		
		System.out.println("Digite um n�mero para saber o valor absoluto: ");
		double b = s.nextDouble();
		
		double c = abs(b);
		escreva(Double.toString(c));
	}
	
	static void escreva(String texto) {
		System.out.println(texto);
	}
	
	static double abs (double x) {
		if (x < 0)
			return -x;
		else
			return x;
	}
}