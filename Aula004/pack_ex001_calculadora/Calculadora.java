package pack_ex001_calculadora;

public class Calculadora {
	private double x, y;

	public Calculadora (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public float somar () return x+y;
	
	public float subtrair () return x-y;
	
	public float multiplicar return x*y;
	
	public float dividir (float x, float y) {
		if(y == 0){
			return 0;
		}
		return x/y;
	}
}
