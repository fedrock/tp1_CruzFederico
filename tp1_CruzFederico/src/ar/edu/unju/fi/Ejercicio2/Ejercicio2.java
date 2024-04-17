package ar.edu.unju.fi.Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		String pais = "Argentina";
		int edad = 29;
		double alturaEdi = 9.5;
		double precioM = 1300.94;
		String numTelefono = "3885778815";
		double coseno = Math.cos(0.5);
		
		Mostrar(pais, edad, alturaEdi, precioM, numTelefono, coseno);
		
	}
	
	public static void Mostrar (String pais, int edad, double altura, double precio, String numte, double cos) {
		System.out.println("Nombre del pais: "+pais);
		System.out.println("Edad: "+edad);
		System.out.println("Altura del edificio: "+altura);
		System.out.println("Precio del Dolar: "+precio);
		System.out.println("Numero Telefonico: "+numte);
		System.out.println("El coseno del numero 0.5 es: "+cos);
	}
	
	
}
