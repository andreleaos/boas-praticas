package br.com.lts.exemplos.excecoes;

public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        }
        System.out.println("Programa continua...");
    }
}

