package br.fiap.cliente;

public class Cliente {
private int cnpj;
private String cliente;

public String getDados() {
	String aux="";
	aux += "CNPJ: " + getCnpj() +"\n";
	aux+= "Cliente: " + getCliente() + "\n";
	
	return aux;
}


public int getCnpj() {
	return cnpj;
}
public void setCnpj(int cnpj) {
	this.cnpj = cnpj;
}
public String getCliente() {
	return cliente;
}
public void setCliente(String cliente) {
	this.cliente = cliente;
}
}
