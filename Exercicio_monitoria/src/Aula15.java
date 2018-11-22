import java.util.Scanner;

public class Aula15 {

	public static void main(String[] args) {
		// Com tipos primitivos de dados
		Scanner x = new Scanner(System.in);
		
		int a;
		
		int m[][] = new int[2][3];
		
		m[0][1] = 3;
		a = m[0][1];
		System.out.println(a);
	}
}