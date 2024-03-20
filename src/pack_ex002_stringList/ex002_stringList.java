package pack_ex002_stringList;

import java.util.ArrayList;
import java.util.List;

public class ex002_stringList {
	public static void main(String[] args) {
		List<String> listaMercado = new ArrayList<String>();
		
		String[] itens = {"Leite", "Pão", "Manteiga", "Ovos", "Tomate" };
		
		for(int i=0; i<5; i++) {
			listaMercado.add(itens[i]);
		}
		
		
		System.out.println("Conteúdo da lista do mercado: ");
		for(String item : listaMercado) {
			System.out.println(item);
		}
	}
}