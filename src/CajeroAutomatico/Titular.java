package CajeroAutomatico;

public class Titular {
	
	private String nombre;
	private String usuario;
	private String contrasenya;
	public Titular(String nombre, String usuario, String contrasenya) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrasenya = contrasenya;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
}
