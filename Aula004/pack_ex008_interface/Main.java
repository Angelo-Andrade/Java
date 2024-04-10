import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main (String[] args) {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  boolean loop = true;
	 
	  while (loop) {
  	  System.out.printf("Digite a operação que deseja fazer: \n\t1 -- Calcular a área e o perímetro de uma circunferência"
  	    + "\n\t2 -- Calcular a área e o perímetro de um quadrado\n\t3 -- Calcular a área e o perímetro de um retângulo"
  	    + "\n\t3 -- Sair");
  	 
  	  try {
  	    int op = Integer.parseInt(br.readLine());
  	    switch (op) {
  	      case 1:
  	        primeiraOperacao(br);
  	        break;
  	      case 2:
  	        segundaOperacao(br);
  	        break;
  	      case 3:
  	        terceiraOperacao(br);
  	        break;
  	      case 4:
  	        System.out.printf("\n\nEncerrando...");
  	        loop = false;
  	        break;
  	      default :
  	        System.out.printf("Valor " + op + " é inválido para a operação!");
  	        break;
  	      
  	    }
  	  }
  	  catch (Exception e) {
  	    System.out.printf("\n\nErro: " + e.getMessage());
  	  }
	  }
  }
	
	public static void primeiraOperacao (BufferedReader br) {
	  try {
	    System.out.printf("Digite um valor para o raio da circunferência: ");
	    double raio = Double.parseDouble(br.readLine());
  	  Circulo c = new Circulo(raio);
	    c.calcularArea();
	    System.out.printf("\n\nA área da circunferência é: %.2f", c.getArea());
	    c.calcularPerimetro();
	    System.out.printf("\n\nO perimetro da circunferência é: %.2f\n\n", c.getPerimetro());
	    
	  }
	  catch (Exception e) {
	    System.out.println("\n\nErro: " + e.getMessage());
	  }
	}
	
	public static void segundaOperacao (BufferedReader br) {
	   try {
	    System.out.printf("Digite um valor para o lado do quadrado: ");
	    double lado = Double.parseDouble(br.readLine());
  	  Quadrado q = new Quadrado(lado);
	    q.calcularArea();
	    System.out.printf("\n\nA área do quadrado é: %.2f", q.getArea());
	    q.calcularPerimetro();
	    System.out.printf("\n\nO perimetro do quadrado é: %.2f\n\n", q.getPerimetro());
	     
	   } 
  	 catch (Exception e) {
  	  System.out.println("\n\nErro: " + e.getMessage());
  	 }
	}
	
	public static void terceiraOperacao (BufferedReader br) {
  	  try {
    	  System.out.printf("Digite um valor para o primeiro lado do retângulo: ");
  	    double ladoA = Double.parseDouble(br.readLine());
    	  System.out.printf("Digite um valor para o segundo lado do retângulo: ");
  	    double ladoB = Double.parseDouble(br.readLine());
    	  Retangulo r = new Retangulo(ladoA, ladoB);
  	    r.calcularArea();
  	    System.out.printf("\n\nA área do retângulo é: %.2f", r.getArea());
  	    r.calcularPerimetro();
  	    System.out.printf("\n\nO perimetro do retângulo é: %.2f\n\n", r.getPerimetro());
  	    
  	  }
  	  catch (Exception e) {
  	    System.out.println("\n\nErro: " + e.getMessage()); 
  	  }
	}
}
