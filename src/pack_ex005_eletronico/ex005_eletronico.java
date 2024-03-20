package pack_ex005_eletronico;

public class ex005_eletronico {
	public static void main(String[] args) {
		Televisao televisao = new Televisao();
		Computador computador = new Computador();
		
		televisao.ligar();
		televisao.desligar();
		
		computador.ligar();
		computador.desligar();
	}
}