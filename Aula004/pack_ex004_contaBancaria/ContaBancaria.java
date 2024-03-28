package pack_ex004_contaBancaria;

public class ContaBancaria {
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria (int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void depositar (double entrada) {
		saldo+=entrada;
		verSaldo();
	}
	
	public void sacar (double saida) {
		saldo-=saida;
		verSaldo();
	}
	
	public void verSaldo () {
		System.out.printf("\nSaldo atual: %.2f\n", saldo);
	}
}

