package net.codejava;

public class Aula01ex2var {
	public static void main(String[] args) {	
			int[] vetor = new int[]{35,15,83,29,18,05,10,12,13,25,98,84,76,78,45,26};
						
			for (int i = 0; i < vetor.length; i++) {
				for (int j = 0; j < vetor.length; j++) {
					if (vetor[i] < vetor[j]) {
						int temp = vetor[i];
						vetor[i] = vetor[j];
						vetor[j] = temp;
					}
				}
			}
			
	         
		
			
			System.out.println("\nVetor Ordenado...");
			for (int i : vetor) {
				System.out.print(i+" ");
			}
		}



}
