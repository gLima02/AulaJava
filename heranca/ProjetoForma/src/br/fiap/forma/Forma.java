package br.fiap.forma;

public abstract class Forma {
	protected int coordX;
	protected int coordY;
	protected double raio;
	
	public Forma(int coordX, int coordY, double raio) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Forma [coordX=" + coordX + ", coordY=" + coordY + ", raio=" + raio + "]";
	}
	
	public abstract double calcularArea();
}
