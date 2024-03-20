package pack_ex004_musica;

public class ex004_musica {
	public static void main (String[] args) {
		Piano piano = new Piano();
		Violao violao = new Violao();
		
		piano.afinar("Piano");
		piano.tocar("Piano");
		
		violao.afinar("Violao");
		violao.tocar("Violao");
	}
}