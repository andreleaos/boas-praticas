package br.com.lts.exemplos.listas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ExemploNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
    }
}
