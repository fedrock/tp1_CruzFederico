package ar.edu.unju.fi.ejercio8.model;

public class CalculadoraEspecial {
	
	private int n;

	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public CalculadoraEspecial(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria() {
		int sumatoria = 0;
		
		for (int k = 1; k < this.n; k++) {
			sumatoria = (int) Math.pow((k*k+1)/2, 2);
		}
		
		return sumatoria;
	}
	
	public int calcularProductoria() {
		int productoria = 1;
		for (int k = 1; k < this.n; k++) {
			productoria = k*(k+4);
		}
		return productoria;
	}
	
}
