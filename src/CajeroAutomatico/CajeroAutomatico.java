package CajeroAutomatico;

import java.util.Scanner;

public class CajeroAutomatico {
	
	static Scanner sc = new Scanner(System.in);
	static Cuenta[] cuentas;
	static Cuenta cuentaLogueada;

	public static void main(String[] args) {
		creacionCuentas();
		login();
	 	logicaMenu();
	 	sc.close();
	}
	
	public static void creacionCuentas() {
		cuentas = new Cuenta[3];
		
		cuentas[0] = new Cuenta(new Titular ("Marta", "Marta123", "queso789"), 500); 
		cuentas[1] = new Cuenta(new Titular ("Pepe", "PepeA1", "patata32"), 1000); 
		cuentas[2] = new Cuenta(new Titular ("Carla", "Carla2", "tomate89"), 2500);
	}
	
	public static void login() {
		boolean logueado = false;
		do {
			String usuario;
			String contrasenya;
			
			System.out.print("Introduce el nombre de usuario: ");
			usuario = sc.nextLine();
			System.out.print("Introduce la contraseña: ");
			contrasenya = sc.nextLine();
			
			for(int i = 0; i<= cuentas.length - 1; i++) {
				if(usuario.equals(cuentas[i].getTitular().getUsuario()) && contrasenya.equals(cuentas[i].getTitular().getContrasenya())) {
					cuentaLogueada = cuentas[i];
					logueado = true;
					break;
				}
			}
			if(!logueado){
				System.out.println("Error, alguno de los datos introducidos es incorrecto.");
			}
		}while(!logueado);	
	}
	
	public static void mostrarMenu() {
		System.out.println("1 - Ingresar dinero");
    	System.out.println("2 - Sacar dinero");
    	System.out.println("3 - Consultar saldo");
    	System.out.println("4 - SALIR");
    	System.out.println("Elige una de las siguientes opciones:"); 
	}
	
	public static void logicaMenu() {
		String opcion;
		do {
			mostrarMenu();
			opcion = sc.nextLine();
			
			switch (opcion) {
				case "1":
				 	ingresarDinero();
					break;
				case "2":
				 	sacarDinero();
					break;
				case "3":
				 	consultarSaldo();
					break;
			}
			System.out.println();
			
		}while(opcion != "4");
	}
	
	
	public static void ingresarDinero() {
		System.out.println("¿Que cantidad de dinero desea ingresar?");
		double dinero = Double.parseDouble(sc.nextLine());
		if(dinero % 5 == 0) {
			double dineroTotal = dinero + cuentaLogueada.getCantidad();
			cuentaLogueada.setCantidad(dineroTotal);
			System.out.println("Su dinero ha sido ingresado");
		}
		else {
			System.out.println("Error!! La cantidad a ingresar tiene que ser múltiplo de 5");
		}
	}

	public static void sacarDinero() {
		System.out.println("¿Que cantidad de dinero desea sacar?");
		double dinero = Double.parseDouble(sc.nextLine());
		if(dinero < cuentaLogueada.getCantidad() && dinero % 5 == 0) {
			double dineroTotal = cuentaLogueada.getCantidad() - dinero;
			cuentaLogueada.setCantidad(dineroTotal);
			
			double dineroSacar = dinero;
			int billete500 = 0;
			int billete200 = 0;
			int billete100 = 0;
			int billete50 = 0;
			int billete10 = 0;
			int billete5 = 0;
			
			while(dineroSacar >= 500) {
				dineroSacar -= 500;
				billete500++;
			}
			while (dineroSacar >= 200) {
				dineroSacar -=200;
				billete200++;
			}
			while (dineroSacar >= 100) {
				dineroSacar -=100;
				billete100++;
			}
			while (dineroSacar >= 50) {
				dineroSacar -=50;
				billete50++;
			}
			while (dineroSacar >= 10) {
				dineroSacar -=10;
				billete10++;
			}
			while (dineroSacar >= 5) {
				dineroSacar -=5;
				billete5++;
			}
			
			System.out.println("Importe: " + dinero + "€");
			System.out.println("500 x " + billete500);
			System.out.println("200 x " + billete200);
			System.out.println("100 x " + billete100);
			System.out.println("50 x " + billete50);
			System.out.println("10 x " + billete10);
			System.out.println("5 x " + billete5);
		}
		else {
			System.out.println("Error!! La cantidad a retirar debe ser menor a la cantidad total que posee");
		}
	}
	
	public static void consultarSaldo() {
		System.out.println("La cantidad que posee es " + cuentaLogueada.getCantidad() + "€");
	}
}
