
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class Util {
	private Controle controle = new Controle();
	
public void menu() {
	int opcao=0;
	
	do {
		opcao = parseInt(showInputDialog(gerarMenu()));
		if(opcao < 1 || opcao > 5) {
		showMessageDialog(null, "Opção Inválida");	
		}else {
			switch(opcao) {
			case 1:
			case 2:
				cadastrar(opcao);
				break;
			case 3:
				pesquisar();
				break;
			case 4: 
				listar();
				break;
			}
		}
		
		try {
			opcao = parseInt(showInputDialog(gerarMenu()));
		}catch(NumberFormatException e) {
			showMessageDialog(null, "Você deve digitar um número");
		}
		
	}while(opcao != 5);
}

private void listar() {
	// TODO Auto-generated method stub
	
	showMessageDialog(null, controle.listar());

}

private void pesquisar() {
	// TODO Auto-generated method stub
	long matricula;
	matricula = parseLong(showInputDialog("Matricula"));
	showMessageDialog(null, controle.pesquisar(matricula));
}

private void cadastrar(int opcao) {
	// TODO Auto-generated method stub
	long matricula;
	String nome;
	double totalVendas, comissao;
	int totalHoras;
	double valorHora;
	
	matricula = parseLong(showInputDialog("Matricula"));
	nome = showInputDialog("Nome");
	if(opcao == 1) {
		totalHoras = parseInt(showInputDialog("Total de horas"));
		valorHora = parseDouble(showInputDialog("Valor da Hora"));
		controle.inserir(new EmpregadoHorista(matricula, nome, totalHoras, valorHora));
	}
}

private String gerarMenu(){
	String aux = "";
	aux+= "1. Cadastrar empregado Horista\n";
	aux+="2. Cadastrar empregado Comissionado\n";
	aux+="3. Pesquisar\n";
	aux+="4. Listar\n";
	aux+="5. Finalizar\n";
	return aux;
}
}
