package br.com.lts.exemplos.excecoes;

public class ExemploFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);  // Erro de índice
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites!");
        } finally {
            System.out.println("Bloco finally sempre é executado.");
        }
    }
}

