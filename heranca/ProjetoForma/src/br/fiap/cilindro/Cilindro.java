package br.fiap.cilindro;

import br.fiap.forma.Forma;
import br.fiap.volume.Volume;

public class Cilindro extends Forma implements Volume{

	private double altura;
	
	public Cilindro(int coordX, int coordY, double raio, double altura) {
		super(coordX, coordY, raio);
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", coordX=" + coordX + ", coordY=" + coordY + ", raio=" + raio + "]";
	}


	@Override
	public double calcularArea() {
		
		return 2*Math.PI * raio *(raio+altura);
	}
	
	public double calcularVolume() {
		return Math.PI * raio * raio * altura;
	}

	
	
}
