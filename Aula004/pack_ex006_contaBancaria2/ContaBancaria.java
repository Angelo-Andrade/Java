package pack_ex006_contaBancaria2;
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
	  try {
	    
  		if(saida > saldo) {
  		  throw new IllegalArgumentException("Saque impossibilitado! Ele é maior que o saldo atual!");  
  		}
  		saldo-=saida;
  		verSaldo();
	  }
	  catch (IllegalArgumentException e) {
	    System.out.printf("\nErro: \t%s\n", e.getMessage());
	  }
	}
	
	public void verSaldo () {
		System.out.printf("\nSaldo atual: %.2f\n", saldo);
	}
}
