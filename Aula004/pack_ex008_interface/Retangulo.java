public class Retangulo implements FormaGeometrica {
  private double ladoA, ladoB; 
  private double area;
  private double perimetro;
  
  public Retangulo (double ladoA, double ladoB) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
  }
  
  @Override
  public void calcularArea () {
    area = ladoA * ladoB; 
  }
  
  @Override
  public void calcularPerimetro () {
    perimetro = (ladoA * 2) + (ladoB * 2);
  }
  
  public double getArea () {
    return area;
  }
  
  public double getPerimetro () {
    return perimetro;
  }
}