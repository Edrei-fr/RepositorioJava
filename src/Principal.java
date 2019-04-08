import java.util.Scanner;

import cajero.Cuenta;
import cajero.Movimiento;

public class Principal {
	static Scanner lector;

	public static void main(String[] args) {
		Cuenta cliente=new Cuenta("JDK32-1234-00001", "Edrei Flores", 310.58f);
		lector = new Scanner(System.in);
		String opc = "";
		do {
			System.out.println("Cuenta de "+cliente.getNombreCliente());
			System.out.println("-------------------------");
			System.out.println(" R - Retirar");
			System.out.println(" I - Ingresar");
			System.out.println(" S - Consultar Saldo");
			System.out.println(" M - Consultar movimientos");
			System.out.println(" F - Fin del programa");
			System.out.println("-------------------------");
			System.out.println("¿Qué operación deseas realizar? ");
			opc = lector.nextLine();
			switch(opc.toUpperCase()) {
			case "R":
				System.out.println("¿Cantidad?");
				float ret=lector.nextInt();
				cliente.retirar(ret);
				System.out.println("Dinero retirado");
				break;
			case "I":
				System.out.println("¿Cantidad?");
				float ing=lector.nextInt();
				cliente.ingresar(ing);
				System.out.println("Ingreso realizado");
				break;
			case "S":
				System.out.println("Tiene "+cliente.consultar()+"€ en su cuenta");
				break;
			case "M":
				for(Movimiento movimiento:cliente.getMovimientos()) {
					System.out.println(movimiento);
				}
			}
		} while (!opc.toUpperCase().equals("F"));
		lector.close();
		
	}
}