import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("¿La tabla de que número deseas? ");
		int numero = lector.nextInt();
		lector.nextLine(); 
		lector.close();
		for (int i=1; i<=10; i++) {
			System.out.println
(numero + " x " + i + " = " + (numero*i));
		}
	}
}
