package pack_ex005_poligono;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Poligono poligono = new Poligono();
      double area = poligono.area();
      System.out.printf("%.2f\n", area);
      
      Scanner scan = new Scanner(System.in);
      double num1 = scan.nextDouble();
      double num2 = scan.nextDouble();
      Retangulo retangulo = new Retangulo(num1, num2);
      area = retangulo.area();
      System.out.printf("%.2f\n", area);
      
      num1 = scan.nextDouble();
      Circulo circulo = new Circulo(num1);
      area = circulo.area();
      System.out.printf("%.2f\n", area);
      
      num1 = scan.nextDouble();
      num2 = scan.nextDouble();
      Triangulo triangulo = new Triangulo(num1, num2);
      area = triangulo.area();
      System.out.printf("%.2f\n", area);
      
      scan.close();
  }
}