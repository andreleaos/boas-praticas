package br.com.lts.exemplos.listas;

import java.util.List;
import java.util.stream.IntStream;

public class ParaleloVsSequencial {
    public static void main(String[] args) {
        List<Integer> numeros = IntStream.rangeClosed(1, 1000)
                .boxed()
                .toList();

        long inicioSeq = System.currentTimeMillis();
        numeros.stream()
                .map(ParaleloVsSequencial::processar)
                .toList();
        long fimSeq = System.currentTimeMillis();
        System.out.println("Tempo Sequencial: " + (fimSeq - inicioSeq) + "ms");

        long inicioPar = System.currentTimeMillis();
        numeros.parallelStream()
                .map(ParaleloVsSequencial::processar)
                .toList();
        long fimPar = System.currentTimeMillis();
        System.out.println("Tempo Paralelo: " + (fimPar - inicioPar) + "ms");
    }

    private static int processar(int numero) {
        try {
            Thread.sleep(1);  // Simula uma operação pesada (1ms por item)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return numero * 2;
    }
}
