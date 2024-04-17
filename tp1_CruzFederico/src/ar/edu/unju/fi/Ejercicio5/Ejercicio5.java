package ar.edu.unju.fi.Ejercicio5;

import java.util.Scanner;



public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese un numero entero comprendido entre [1-9]");
		int valor = ingreso.nextInt();
		int finalM = 11;
		Multiplicacion(valor,finalM);	
		ingreso.close();
		}
		
	public static void Multiplicacion (int val, int fin) {
		
		for (int i = 0; i < fin; i++) {
			int multi = val*i;
			System.out.println(val+" x "+i+" = "+multi);
		}
		
	}


}
	

