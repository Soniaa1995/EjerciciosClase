package ejercicioOrdenarAlfabeticamente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacion {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList();
		personas.add(new Persona("Ana", "26", "2010"));
		personas.add(new Persona("Alba", "21", "1988"));
		personas.add(new Persona("Ana", "26", "2009"));
		personas.add(new Persona("Alba", "26", "2007"));
		
		Collections.sort(personas);
		
		System.out.println("Estos son los datos que tenemos:");
		for(Persona persona : personas) {
			System.out.println(persona);
		}
	}
}
