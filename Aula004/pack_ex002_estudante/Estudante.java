package pack_ex002_estudante;

public class Estudante {
	private String nome;
	private int idade;
	private float nota;
	
	public Estudante(String inNome, int inIdade, float inNota) {
		nome = inNome;
		idade = inIdade;
		nota = inNota;
	}
	
	public boolean aprovado () {
		if(nota >= 7) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getName () {
		return nome;
	}
}
