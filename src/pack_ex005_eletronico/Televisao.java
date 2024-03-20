package pack_ex005_eletronico;

public class Televisao implements DispositivoEletronico{
	public void ligar() {
		System.out.printf("Televisão ligada!\n");
	}
	
	public void desligar() {
		System.out.printf("Televisão desligada!\n");
	}
}
