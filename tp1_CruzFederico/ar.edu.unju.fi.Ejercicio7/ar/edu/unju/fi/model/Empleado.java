package ar.edu.unju.fi.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private double salario;
	
	private static final double salarioMinimo = 210000.00;
	
	private static final double salarioMerito = 20000.00;

	public Empleado(String nombre, Integer legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= salarioMinimo) {
			this.salario = salario;
		}else {
			this.salario = salarioMerito;
		}
	}

	public void mostrarDatos () {
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario $ "+this.salario);
		
	}
	
	public void aumentoSalario () {
		 salario+=salarioMerito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getSalariominimo() {
		return salarioMinimo;
	}

	public static double getSalariomerito() {
		return salarioMerito;
	}
	
	

}
