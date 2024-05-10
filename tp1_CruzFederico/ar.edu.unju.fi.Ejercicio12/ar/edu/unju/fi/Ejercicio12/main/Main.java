package ar.edu.unju.fi.Ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.Ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy)");
		String fecha = scanner.nextLine();
		Calendar fechaNacimiento =  Calendar.getInstance();
		String[] divisionFecha = fecha.split("/");
		fechaNacimiento.set(Integer.parseInt(divisionFecha[2]), Integer.parseInt(divisionFecha[1]) - 1, Integer.parseInt(divisionFecha[0]));
		Persona persona = new Persona(nombre,fechaNacimiento);
		persona.imprimirDatos();
		scanner.close();
	}

}
