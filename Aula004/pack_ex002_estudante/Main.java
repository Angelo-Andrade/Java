package pack_ex002_estudante;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("Digite o nome do aluno: ");
		String nome = scan.nextLine();
		System.out.print("Digite a idade do aluno: ");
		int idade = scan.nextInt();
		System.out.print("Digite a nota do aluno: ");
		float nota = scan.nextFloat();
		scan.close();
		
		Estudante aluno001 = new Estudante(nome, idade, nota);
		boolean situacao = aluno001.aprovado();
		
		if(situacao) {
			System.out.printf("Aluno %s aprovado!", aluno001.getName());
		}
		else {
			System.out.printf("Aluno %s reprovado!", aluno001.getName());
		}
	}
}