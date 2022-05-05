package ado01AP;

import java.util.Scanner;
import java.util.Locale;

public class Questao6 {

	public static void main(String[] args) {

		double valor;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.print("Digite um valor:");
		valor = sc.nextDouble();

		if (valor >= 20 && valor <= 90) {
			System.out.println("O valor está entre 20 e 90.");
		} else {
			System.out.println("O valor não está entre 20 e 90.");
		}
		sc.close();
	}

}
