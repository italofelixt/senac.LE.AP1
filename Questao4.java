package ado01AP;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro:");
		num = sc.nextInt();

		if (num > 256) {
			System.out.println(num + " � maior que 256.");

		} else {
			System.out.println(num + " � menor que 256.");
		}

		sc.close();
	}
}
