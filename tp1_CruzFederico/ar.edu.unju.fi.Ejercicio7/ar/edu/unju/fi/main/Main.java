package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---Ingrese Datos del empleador---");
		System.out.println("Nombre del empleador: ");
		String nombre = scanner.nextLine();
		System.out.println("Legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Salario: ");
		double salario = scanner.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, (double) salario);
		
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		empleado.mostrarDatos();
			
		scanner.close();
	}

}
