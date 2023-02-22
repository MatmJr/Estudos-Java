package com.br.matmj;

public class PrimeiraClasse {

	public static void main(String[] args) {
		System.out.println("Olá Marco");
		Cliente cliente = new Cliente();
		cliente.setNome("Testudo dos Testes");
		cliente.cadastrarEndereco("Rua dos testes");
		cliente.setCodigo(1);
		String end = cliente.retornarNomeCliente();
		
		System.out.print("Nome do Cliente: ");
		System.out.println(cliente.getNome());
		System.out.print("Código do Cliente: ");
		System.out.println(cliente.getCodigo());	
		System.out.print(end);
		cliente.imprimirEndereco();
		System.out.print("Dinheiro na Carteira: ");
		System.out.println(cliente.dinheiroNaCarteira());
		
		
	}

}
