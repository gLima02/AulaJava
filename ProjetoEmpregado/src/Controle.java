import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controle {
private ArrayList<Empregado> lista = new ArrayList<>();
private int indice;

public void inserir(Empregado empregado) {
	lista.add(empregado);
}
public Empregado pesquisar(long matricula) {
	Empregado aux = null;
	for (Empregado e : lista) {
		if(e.matricula == matricula) {
			aux = e;
		}
	}
	return aux;
}

public String listar() {
	String auxHorista = "Empregado Horista\n";
	String auxComissionado = "Empregado Comissionado\n";
	 
	for (Empregado e : lista) {
		if(e instanceof EmpregadoComissionado) {
			auxHorista += e;
		} else {
			auxComissionado += e;
		}
	}
	return auxHorista + auxComissionado;
}
}
