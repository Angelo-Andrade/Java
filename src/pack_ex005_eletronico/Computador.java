package pack_ex005_eletronico;

public class Computador implements DispositivoEletronico {
	public void ligar() {
		System.out.printf("Computador ligado!\n");
	}
	
	public void desligar() {
		System.out.printf("Computador desligado!\n");
	}
}
