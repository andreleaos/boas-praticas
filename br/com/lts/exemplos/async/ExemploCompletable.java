package br.com.lts.exemplos.async;

import java.util.concurrent.CompletableFuture;

public class ExemploCompletable {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> {
            System.out.println("Tarefa assíncrona");
        });

        System.out.println("Main continua...");
    }
}