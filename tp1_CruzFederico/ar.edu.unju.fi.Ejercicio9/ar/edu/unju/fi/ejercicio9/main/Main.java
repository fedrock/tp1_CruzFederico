package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.println("--Ingrese datos de cada producto--");
			System.out.println("-------------------------");
			System.out.println("Ingrese su nombre: ");
			String nombre = scanner.next();
			System.out.println("Ingrese el codigo: ");
			String codigo = scanner.next();
			System.out.println("Ingrese precio del producto: ");
			double precio = scanner.nextDouble();
			System.out.println("Ingrese descuento[%]: ");
			int descuento = scanner.nextInt();
			scanner.nextLine();		
			Producto productos = new Producto();
			productos.setNombre(nombre);
			productos.setCodigo(codigo);
			productos.setPrecio(precio);
			productos.setDescuento(descuento);
			System.out.println("Datos del producto: "+i);
			System.out.println("Nombre: "+productos.getNombre());
			System.out.println("Codigo: "+productos.getCodigo());
			System.out.println("Precio delñ producto: "+productos.getPrecio());
			System.out.println("Descuento: "+productos.getDescuento()+" %");
			System.out.println("Precio con el descuento: " + productos.calcularDescuento());
		}
		
		
		scanner.close();
	}

}
