package br.com.lts.exemplos.listas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCompleto {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("André", "Lucas", "Ana", "Leonardo", "Amanda");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.length() > 3)         // Nomes com mais de 3 letras
                .map(String::toUpperCase)                  // Converte para maiúsculas
                .sorted()                                  // Ordena
                .collect(Collectors.toList());             // Coleta para uma lista

        System.out.println("Resultado: " + resultado);
    }
}
