package br.fiap.circulo;

import br.fiap.forma.Forma;

public class Circulo extends Forma{

	public Circulo(int coordX, int coordY, double raio) {
		super(coordX, coordY, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circulo [coordX=" + coordX + ", coordY=" + coordY + ", raio=" + raio + "]";
	}

	@Override
	public double calcularArea() {
		return Math.PI * (raio*raio);
	}

	
	
}
