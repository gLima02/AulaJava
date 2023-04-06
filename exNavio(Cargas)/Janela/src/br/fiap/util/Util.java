package br.fiap.util;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;;
public class Util {

	public void menu() {
				int opcao;
				
				do {
					opcao = parseInt(showInputDialog(gerarMenu()));
				}while(opcao != 6);
	}
	private String gerarMenu() {
		String aux = "Reserva de Cargas\n";
		aux += "1. Realizar reserva\n";
		aux +="2. Pesquisar Reserva\n";
		aux+= "3. Visualizar reservas\n";
		aux+= "4. Capacidade reservada\n";
		aux+= "5. Cancelar reserva\n";
		aux+= "6. Encerrar programa\n";
		return aux;
	}
	
}
