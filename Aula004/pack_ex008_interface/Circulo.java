public class Circulo implements FormaGeometrica {
  private double raio=0;
  private double area=0;
  private double perimetro=0;
  
  public Circulo (double raio) {
    this.raio = raio;
  }
  
  @Override
  public void calcularArea () {
    area = Math.PI * raio * raio;
  }
  
  @Override
  public void calcularPerimetro () {
    perimetro = 2 * Math.PI * raio;
  }
  
  public double getArea () {
    return area;
  }
  
  public double getPerimetro () {
    return perimetro;
  }
}