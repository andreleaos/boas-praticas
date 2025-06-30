package br.com.lts.exemplos.listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("André");
        nomes.add("Lucas");
        nomes.add("Maria");
        nomes.add("André");  // Permite repetição

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
