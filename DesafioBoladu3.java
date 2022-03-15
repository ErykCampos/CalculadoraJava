package Desafios;

import java.util.Scanner;

public class DesafioBoladu3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1;
		double n2;
		String op = "";
		
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a operação: ");
		op = entrada.next();
		
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextDouble();
		
		if(op.equals("+")) {
			System.out.println(n1 + n2);
		} else if (op.equals("-")) {
			System.out.println(n1 - n2);
		} else if (op.equals("*")) {
			System.out.println(n1 * n2);
		} else if (op.equals("/")) {
			System.out.println(n1 / n2);
		} else {
			System.out.println("Operação invalida");
		}
		
		
	
		
			
		
			
		entrada.close();
		
	}
}
