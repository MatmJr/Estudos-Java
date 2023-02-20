package net.codejava;

import java.util.Arrays;

public class Aula01ex2 {

	static int vetor[] = {35,15,83,29,18,05,10,12,13,25,98,84,76,78,45,26};
	static int valorProcurado = 26; 
		
	static int buscaSequencial(int[] vetor, int valorProcurado) {
		Arrays.parallelSort(vetor);
				
        for (int i = 0; i < vetor.length; i++) {
        	if (vetor[i] == valorProcurado) {    
                return i;   
			}  
        }  
        return -1; 
		}
	
	public static void main(String[] args) {
		Arrays.parallelSort(vetor);
		System.out.println("\nVetor Ordenado");
		for (int i : vetor) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nPosição Encontrada");
		System.out.print(buscaSequencial(vetor, valorProcurado));	
}

	}


