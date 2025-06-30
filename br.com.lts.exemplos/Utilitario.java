package br.com.lts.exemplos;

public class Utilitario {

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
