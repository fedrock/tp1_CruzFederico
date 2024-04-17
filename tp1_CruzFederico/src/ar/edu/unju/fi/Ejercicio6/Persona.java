package ar.edu.unju.fi.Ejercicio6;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	
	@Override
	public String toString() {
		return "Persona dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", provincia="
				+ "Jujuy" + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return "Jujuy";
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int CalculoEdad () {
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}
	
	public boolean mayorEdad () {
		
		return CalculoEdad()>=18;	
	}
	
	public void mostrarDatos () {
		System.out.println("DNI: "+this.dni);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Fecha de Nacimiento: "+this.fechaNacimiento);
		System.out.println("Provincia: "+ getProvincia());
		System.out.println("Edad: "+ CalculoEdad());
		if(mayorEdad()) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	}
}
