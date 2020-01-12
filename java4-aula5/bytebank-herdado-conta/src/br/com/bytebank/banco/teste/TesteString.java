package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		String nome = "Alura";
		System.out.println(nome.replace("a", "A"));
		System.out.println(nome.charAt(2));
		System.out.println(nome.replace("Al", "kkk"));
		
		CharSequence cs = new StringBuilder("Aaaaal");
		nome = nome.replace("Al", cs);
		System.out.println(nome);
		
		 StringBuilder nova = new StringBuilder("meu nome eh: ");
		 nova.append("Mariana");
		 System.out.println(nova);
		 
		 
	}
}
