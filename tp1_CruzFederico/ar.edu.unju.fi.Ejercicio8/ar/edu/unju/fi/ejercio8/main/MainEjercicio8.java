package ar.edu.unju.fi.ejercio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercio8.model.CalculadoraEspecial;

public class MainEjercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.println("Ingrese el numero n: ");
		int n = scanner.nextInt();
		CalculadoraEspecial valor = new CalculadoraEspecial(n);
		int sumatoria = valor.calcularSumatoria();
		
		int productoria = valor.calcularProductoria();
		
		System.out.println("El valor de la sumatoria es: "+sumatoria);
		
		System.out.println("El valor de la productoria es: "+productoria);
		
		scanner.close();
	}

}
