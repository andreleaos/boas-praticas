package br.com.lts.exemplos.excecoes;

public class ExemploMultiCatch {
    public static void main(String[] args) {
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (ArithmeticException e) {
            System.out.println("Erro de cálculo.");
        } catch (NullPointerException e) {
            System.out.println("Variável não pode ser nula.");
        }
    }
}

