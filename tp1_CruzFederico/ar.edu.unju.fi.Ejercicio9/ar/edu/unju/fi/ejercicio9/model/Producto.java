package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, String codigo, double precio, int descuento) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descuento=" + descuento
				+ "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public double calcularDescuento() {
		if (descuento > 0 && descuento <= 50) {
			double desc= (double )descuento/100;
			double desc1 = precio*desc;
			return precio-desc1;
			
		}else {
			return precio;
		}
	}
	
	
	
}
