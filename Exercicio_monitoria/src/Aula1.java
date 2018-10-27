import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// 1- Entrar com nome e idade. Imprimir a seguinte saída:
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = s.nextLine();
		System.out.println("Digite o seu idade: ");
		int idade = s.nextInt();
		System.out.printf("\nSeu nome é: %s", nome);
		System.out.printf("\nSua idade é: %d", idade);
	}

}
