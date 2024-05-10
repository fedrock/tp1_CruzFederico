package ar.edu.unju.fi.Ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] numeros = new int [8];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese valor para la posicion "+i+": ");
			numeros[i] = scanner.nextInt();
		}
		System.out.println("---Valores almacenados---");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Valores generados en la posicion "+i+": "+numeros[i]);
		}
		scanner.close();
	}

}
