package pack_ex005_poligono;

public class Triangulo extends Poligono {

  private double base = 0, altura = 0;
  
  public Triangulo (double base, double altura) {
    
    this.base = base;
    this.altura = altura;
  }
  
  public double area() {
    double area = 0;
    area = (base * altura)/2;
    return area;
  }
}