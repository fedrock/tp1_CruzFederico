package ar.edu.unju.fi.Ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Calculo de la Edad
	public int CalculoEdad () {
		Calendar fechaActual = Calendar.getInstance();
		int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		
		if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
		
		return edad;		
	}
	
    public String determinarSignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }
    
    
    public String determinarEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 
        switch (mes) {
            case 1:
            case 2:
            case 12:
                return "Verano";
            case 3:
            case 4:
            case 5:
                return "Otoño";
            case 6:
            case 7:
            case 8:
                return "Invierno";
            case 9:
            case 10:
            case 11:
                return "Primavera";
            default:
                return "Mes inválido";
        }
    }
    

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/" +
                (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" +
                fechaNacimiento.get(Calendar.YEAR));
        System.out.println("Edad: " + CalculoEdad() + " años");
        System.out.println("Signo del zodíaco: " + determinarSignoZodiaco());
        System.out.println("Estación: " + determinarEstacion());
    }
}
