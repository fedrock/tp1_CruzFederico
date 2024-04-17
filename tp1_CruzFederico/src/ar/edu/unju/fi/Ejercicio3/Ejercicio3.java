package ar.edu.unju.fi.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int valor;
		System.out.println("Ingrese un numero entero: ");
		valor = ingreso.nextInt();
		
		if (valor % 2 == 0 ) {
			valor = valor*3;
			System.out.println("El numero es par: "+valor);

		}else {
			valor = valor*2;
			System.out.println("El numero es impar: "+valor);
		}
		ingreso.close();
	}
}