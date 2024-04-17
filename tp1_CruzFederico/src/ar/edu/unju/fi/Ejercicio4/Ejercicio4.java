package ar.edu.unju.fi.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese un valor del del rango numerico entre [0-10]");
		int verif = ingreso.nextInt();
		
		 if (verif <= 10){
				int cont = 1;
				int fact = 1;
				while (cont<=verif) {
					fact=fact*cont;
					cont++;
				}
				System.out.println("El factorial de ese numero es: "+fact);
		}else {
			System.out.println("Error numero mayor a 10");
		}
		 ingreso.close();
	}

}
