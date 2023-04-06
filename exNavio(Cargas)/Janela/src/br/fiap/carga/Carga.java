package br.fiap.carga;
import java.util.Random;

import br.fiap.cliente.Cliente;

public class Carga {
private int id;
private String destino;
private double peso;
private Cliente cliente;


public String getDados() {
	String aux="";
	aux += "ID: " + id + "\n";
	aux += "Destino: " + getDados() + "\n";
	aux+= "Peso: " + String.format("%.2f", peso) + "\n";
	aux += cliente.getDados();
	return aux;
}

public Carga(String destino, Cliente cliente) {
	super();
	this.destino = destino;
	this.cliente = cliente;
	this.id = gerarId();
	this.peso = gerarPeso();
}

private double gerarPeso() {
	return Math.random()*1000;
}

private int gerarId() {
	Random gerador = new Random();
	return gerador.nextInt(1000, 10000);
	
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public int getId() {
	return id;
}

public Cliente getCliente() {
	return cliente;
}

}
