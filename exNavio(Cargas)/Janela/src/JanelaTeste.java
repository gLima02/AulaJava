import javax.swing.JOptionPane;

public class JanelaTeste {
	public static void main(String[] args) {
		
		
		
		String nome;
		int idade;
		double nota;
		
		
		//JOptionPane.showMessageDialog(null, "msg teste");
	
		//nome = JOptionPane.showInputDialog("Nome: ");
		
		//JOptionPane.showMessageDialog(null,"Boa noite, " +  nome);
	
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		JOptionPane.showMessageDialog(null, idade);
	}
}
