package net.codejava;
import java.util.Scanner;
public class PTICCMarco {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a Quantodade de números:");		
		int n = scanner.nextInt();
		int[] vetor = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o "+(i+1)+" valor:");
			vetor[i]= scanner.nextInt();
		}
		scanner.close();
		System.out.printf("\nA amplitude da lista é:");
		System.out.println(amplitude(vetor));

		System.out.printf("\nO vetor é crescente? ");
		System.out.println(Crescente(vetor));     
	}
	public static int amplitude(int vetor[]) {
		int maior = vetor[0];
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior){
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		return (maior - menor);
	}
	public static boolean Crescente(int vetor[]) {
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] <= vetor[i - 1]) {
				return false;
			}
		}
		return true;
	}
}

