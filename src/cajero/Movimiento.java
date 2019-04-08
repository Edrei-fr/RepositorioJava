package cajero;

import java.time.LocalDateTime;

public class Movimiento extends Cuenta {
	private LocalDateTime fechaHora;
	private Concepto concepto;
	private float cantidad;

	public Movimiento(String numeroCuenta, String nombreCliente, float saldo, LocalDateTime fechaHora,
			Concepto concepto, float cantidad) {
		super(numeroCuenta, nombreCliente, saldo);
		this.fechaHora = fechaHora;
		this.concepto = concepto;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Movimiento [fechaHora=" + fechaHora.getDayOfMonth() + "-" + fechaHora.getMonthValue() + "-"
				+ fechaHora.getYear() + " " + fechaHora.getHour() + ":" + fechaHora.getMinute() + ", concepto="
				+ concepto + ", cantidad=" + cantidad + "]";
	}

}
