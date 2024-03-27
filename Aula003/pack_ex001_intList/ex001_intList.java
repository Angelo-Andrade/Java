package pack_ex001_intList;

import java.util.ArrayList;
import java.util.List;


public class ex001_intList {
	public static void main(String[] args) {
		//criando lista
		List<Integer> listaInt = new ArrayList<Integer>();
				
		//adicionando itens
		for (int i=0; i<6; i++) {
			listaInt.add(i);
		}
		
		
		//demonstrando conteúdo
		for (int i=0; i<6; i++) {
			System.out.println(listaInt.get(i));
		}
		
		
	}
}