package net.codejava;

public class Aula01 {
				
		static int vetor[] = {35,15,83,29,10,05,10,15,13,25,98,84,76,78,45,26};
		static int valorProcurado = 98; 
		
		static int buscaSequencial(int[] vetor, int valorProcurado) {  
	        for (int i = 0; i < vetor.length; i++) {   
	              if (vetor[i] == valorProcurado) {    
	                              return i;   
	              }  
	        }  return -1; 
			
		}
		public static void main(String[] args) {
			System.out.print(buscaSequencial(vetor, valorProcurado));	
}
}
