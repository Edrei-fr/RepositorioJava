package cajero;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cuenta implements ICuenta {
	private String numeroCuenta;
	private String nombreCliente;
	private float saldo;
	private ArrayList<Movimiento> movimientos;

	public Cuenta(String numeroCuenta, String nombreCliente, float saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.saldo = saldo;
		this.movimientos = new ArrayList<Movimiento>();
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	private float getSaldo() {
		return saldo;
	}

	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	@Override
	public void retirar(float cantidad) {
		saldo -= cantidad;
		movimientos.add(
				new Movimiento(numeroCuenta, nombreCliente, saldo, LocalDateTime.now(), Concepto.RETIRADA, cantidad));

	}

	@Override
	public void ingresar(float cantidad) {
		saldo += cantidad;
		movimientos.add(
				new Movimiento(numeroCuenta, nombreCliente, saldo, LocalDateTime.now(), Concepto.INGRESO, cantidad));
	}

	@Override
	public float consultar() {
		return getSaldo();
	}

}
