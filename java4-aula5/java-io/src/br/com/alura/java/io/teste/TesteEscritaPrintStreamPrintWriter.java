package br.com.alura.java.io.teste;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		long ini = System.currentTimeMillis();
		
		PrintStream ps = new PrintStream("lorem2.txt"); 
		
		ps.println("Hoje eu estou muito agoniada");
		ps.print("De verdade verdade verdade");
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Durou: " + (fim - ini) + " milisegundos");
		ps.close();
	}
}
