import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// 2- Entrar com dois números inteiros e imprimir a seguinte saída:
		//Dividendo:
		//Divisor:
		//Quociente:
		//Resto:
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = s.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = s.nextInt();
		
		
		System.out.printf("\n O dividendo é: %d", num1);
		
		System.out.printf("\n O divisor é: %d", num2);
		
		float qc = (num1/num2);
		System.out.printf("\n O quociente do número é: %.1f", qc);
		
		float re = (num1%num2);
		System.out.printf("\n O resto do número é: %.1f", re);
	}

}
