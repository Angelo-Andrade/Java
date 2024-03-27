package pack_ex001_calculadora;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Calculadora calc = new Calculadora();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		float num1 = scan.nextFloat();

		System.out.print("Digite o segundo valor: ");
		float num2 = scan.nextFloat();
		scan.close();
				
		System.out.printf("Soma: %.2f\n", calc.somar(num1, num2));
		System.out.printf("Subtração: %.2f\n", calc.subtrair(num1, num2));
		System.out.printf("Multiplicação: %.2f\n", calc.multiplicar(num1, num2));
		System.out.printf("Divisão: %.2f\n", calc.dividir(num1, num2));
	}
}