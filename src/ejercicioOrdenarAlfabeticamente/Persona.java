package ejercicioOrdenarAlfabeticamente;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String edad;
	private String anyoNacimiento;
	public Persona(String nombre, String edad, String anyoNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.anyoNacimiento = anyoNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(String anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public static String padRight(String s, int n) { 
		return String.format("%1$-" + n + "s", s); 
	}

	@Override
	public String toString() {
		return padRight(nombre, 10) + padRight(edad, 10)  + padRight(anyoNacimiento, 10);
	}
	
	@Override
	public int compareTo(Persona otraPersona) {
		
		if(this.nombre.compareTo(otraPersona.getNombre()) == 1) {
			return 1;
		}else if(this.nombre.compareTo(otraPersona.getNombre()) == -1) {
			return -1;
		}else {
			if(this.edad.compareTo(otraPersona.getEdad()) == 1) {
				return 1;
			}else if(this.edad.compareTo(otraPersona.getEdad()) == -1) {
				return -1;
			}else {
				return this.anyoNacimiento.compareTo(otraPersona.getAnyoNacimiento());
			}
		}
				
	}
}
