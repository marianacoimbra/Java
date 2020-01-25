package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("text.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);

		String linha = bf.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = bf.readLine();

			bf.close();
		}

	}

}
