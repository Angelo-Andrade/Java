package pack_ex005_poligono;

public class Circulo extends Poligono {
  
  private double raio = 0;
  
  public Circulo (double raio) {
    
    this.raio = raio;
  }
  
  public double area() {
    double area = 0;
    area = 3.14 * raio * raio;
    return area;
  }  
}