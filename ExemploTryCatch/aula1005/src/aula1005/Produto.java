package aula1005;

public class Produto {
private int id;
private String nome;
private double preco;




@Override
public String toString() {
	return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
}

public Produto(int id, String nome, double preco) {
	super();
	this.id = id;
	this.nome = nome;
	this.preco = preco;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getId() {
	return id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


}
