package pack_ex003_livro2;

public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	
	public Livro (String titulo, String autor, int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public void imprimirDetalhes () {
		System.out.printf("\nDados do livro %s\n"
				+ " Autor: %s\n Ano de Publicação: %d\n\n", titulo, autor, anoDePublicacao);
	}
}
