package ado01AP;
import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = 6;
		int vetor[] = new int[v];
		int vSoma=0;
		
		for (int i=1; i<=5; i++) {
			System.out.println("Digite o " + i + "o número: ");
				vetor[i] = sc.nextInt();
				vSoma = vSoma + vetor[i] ;
		}
		System.out.println("\nA soma de todos os elementos é "+ vSoma);
		
		sc.close();
		
	}

}
