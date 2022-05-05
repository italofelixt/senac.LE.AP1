package ado01AP;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número e direi se ele é divisível por 10, por 5 ou por 2: ");
		num = sc.nextInt();

		if (num % 10 == 0) {
			System.out.println("Ele é divisível por 10.");
		}
		if (num % 5 == 0) {
			System.out.println("Ele é divisível por 5.");
		}
		if (num % 2 == 0) {
			System.out.println("Ele é divisível por 2.");
		} else {
			System.out.println("Ele não divisível por nenhum.");
		}

		sc.close();
	}

}
