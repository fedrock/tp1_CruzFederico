package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	private final int ADICIONAL_ESPECIALES_20 = 500;
	private final int ADICIONAL_ESPECIALES_30 = 750;
	private final int ADICIONAL_ESPECIALES_40 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public Pizza(int diametro, double precio, double area, boolean ingredientesEspeciales) {
		this.diametro = diametro;
		this.precio = precio;
		this.area = area;
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	public void calcularPrecio() {
        if (diametro == 20) {
            precio = ingredientesEspeciales ? 4500 + ADICIONAL_ESPECIALES_20 : 4500;
        } else if (diametro == 30) {
            precio = ingredientesEspeciales ? 4800 + ADICIONAL_ESPECIALES_30 : 4800;
        } else if (diametro == 40) {
            precio = ingredientesEspeciales ? 5500 + ADICIONAL_ESPECIALES_40 : 5500;
        } else {
            System.out.println("Diametro incorrecto");
        }
    }
	
	/*public void calcularPrecio () {
		if (this.diametro == 20 && ingredientesEspeciales == false) {
			precio = 4500;
		}else {
			precio = 4500 + ADICIONAL_ESPECIALES_20;
		}
		if (this.diametro == 30 && ingredientesEspeciales == false) {
			precio = 4800;
		}else {
			precio = 4800 + ADICIONAL_ESPECIALES_30;
		}
		if (this.diametro == 40 && ingredientesEspeciales == false) {
			precio = 5500;
		}else {
			precio = 5500 + ADICIONAL_ESPECIALES_40;
		}
	}
	*/
	public void calcularArea () {
		double radio = diametro/2.0;
		area = Math.PI*Math.pow(radio, 2);
	}
}
