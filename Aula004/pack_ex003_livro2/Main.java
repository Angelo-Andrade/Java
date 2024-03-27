package pack_ex003_livro2;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o titulo do livro: ");
		String titulo = scan.nextLine();

		System.out.print("Digite o autor do livro: ");
		String autor = scan.nextLine();

		System.out.print("Digite o ano de publicação do livro: ");
		int anoPubli = scan.nextInt();
		scan.close();
		
		Livro TLOR = new Livro(titulo, autor, anoPubli);
		TLOR.imprimirDetalhes();
	}
}