package aula1005;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Produto> lista = new LinkedList();
		
		//inserindo 3 objetos
		
		lista.add(new Produto(1, "arroz", 25.50));
		lista.add(new Produto(2, "feijoada", 60));
		lista.add(new Produto(3, "caipirinha", 15));
		
		//impressao usando o FOR tradicional
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
	}

}
