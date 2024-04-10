public class Quadrado implements FormaGeometrica {
  private double lado;
  private double area;
  private double perimetro;

  public Quadrado (double lado) {
    this.lado = lado;
  }
  
  @Override
  public void calcularArea () {
    area = lado * lado;
  }
  
  @Override
  public void calcularPerimetro () {
    perimetro = lado * 4;
  }
  
  public double getArea () {
    return area;
  }
  
  public double getPerimetro () {
    return perimetro;
  }
}