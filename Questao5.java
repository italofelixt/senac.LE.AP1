package ado01AP;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		double valor1, valor2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero:");
		valor1 = sc.nextDouble();

		System.out.print("Digite outro n�mero:");
		valor2 = sc.nextDouble();

		if (valor1 > valor2) {
			System.out.println("O primeiro valor � maior que o segundo.");
		} else {
			System.out.println("O segundo valor � maior que o primeiro.");
		}
		sc.close();
	}

}
