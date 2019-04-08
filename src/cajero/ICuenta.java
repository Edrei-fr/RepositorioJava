package cajero;

public interface ICuenta {
	public void retirar(float cantidad);

	public void ingresar(float cantidad);

	public float consultar();

}
