package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada com arquivo
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("kkkkkkk");
		bw.newLine();
		bw.write("jujuba verde");
		
		fw.close();
		bw.close();
	}

}
