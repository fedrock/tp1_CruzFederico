package ar.edu.unju.fi.Ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona3 = new Persona();
		
		//Constructor por defecto
		System.out.println("----Metodo Por Defecto-----");
		System.out.println("Ingrese el dni: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento YYYY-MM-DD: ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		Persona persona1 = new Persona(dni, nombre, fechaNacimiento, nombre);
		System.out.println(persona1.toString());
		System.out.println("Edad: "+persona1.CalculoEdad());
		if(persona1.mayorEdad()) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
		
		
		
		
		//Metodo parametrizado
		System.out.println("----Metodo Parametrizado----");
		System.out.println("Ingrese el dni: ");
		String dni1 = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre1 = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento YYYY-MM-DD: ");
		LocalDate fechaNacimiento1 = LocalDate.parse(scanner.nextLine());
		Persona persona = new Persona(dni1, nombre1, fechaNacimiento1, persona1.getProvincia());
		persona.mostrarDatos();
		
		//Metodo que llevan como parametros el dni, nombre, fecha de nacimiento
		System.out.println("----Metodo con parametros----");
		System.out.println("Ingrese el dni: ");
		String dni2 = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre2 = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento YYYY-MM-DD: ");
		LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
		persona3.setDni(dni2);
		persona3.setNombre(nombre2);
		persona3.setFechaNacimiento(fechaNacimiento2);
		persona3.mostrarDatos();
		
		scanner.close();
	}

}
