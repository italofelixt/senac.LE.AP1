package ado01AP;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		double valor1, valor2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número:");
		valor1 = sc.nextDouble();

		System.out.print("Digite outro número:");
		valor2 = sc.nextDouble();

		if (valor1 > valor2) {
			System.out.println("O primeiro valor é maior que o segundo.");
		} else {
			System.out.println("O segundo valor é maior que o primeiro.");
		}
		sc.close();
	}

}
