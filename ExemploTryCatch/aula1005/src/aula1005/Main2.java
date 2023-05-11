package aula1005;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		String nome;
		double preco;
		
		try {
		
		id = parseInt(showInputDialog("ID"));
		nome = showInputDialog("Nome");
		preco = parseDouble(showInputDialog("Preço"));
		Produto p = new Produto(id, nome, preco);
		} catch (NumberFormatException e) {
			showMessageDialog(null, "Voce deve digitar um numero\n\n" + e);
		}
		}

}
