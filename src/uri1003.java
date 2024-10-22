import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		double A = sc.nextInt();
		double B = sc.nextInt();
		

		soma = (int) (A + B);

		System.out.println("SOMA = " + soma);

		sc.close();
	}
}
