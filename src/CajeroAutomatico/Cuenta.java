package CajeroAutomatico;

public class Cuenta {
	
	Titular titular;
	private double cantidad;
	public Cuenta(Titular titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
}
