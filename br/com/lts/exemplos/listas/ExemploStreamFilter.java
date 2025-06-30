package br.com.lts.exemplos.listas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ExemploStreamFilter {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("André", "Lucas", "Maria", "Ana", "Leonardo");

        List<String> filtrados = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Nomes que começam com A: " + filtrados);
    }
}