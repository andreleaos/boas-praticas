package br.com.lts.exemplos.excecoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {
    public void lerArquivo() throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader("arquivo.txt"));
        String linha = leitor.readLine();
        System.out.println("Linha lida: " + linha);
        leitor.close();
    }

    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo();
        try {
            leitor.lerArquivo();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
