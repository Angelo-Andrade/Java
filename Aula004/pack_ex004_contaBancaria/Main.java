package pack_ex004_contaBancaria;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		ContaBancaria conta123 = new ContaBancaria(123, 500);
		
		conta123.verSaldo();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor para depósitar: ");
		double deposito = scan.nextDouble();
		conta123.depositar(deposito);

		System.out.print("Digite um valor para sacar: ");
		double saque = scan.nextDouble();
		conta123.sacar(saque);
		scan.close();
		
	}
}
