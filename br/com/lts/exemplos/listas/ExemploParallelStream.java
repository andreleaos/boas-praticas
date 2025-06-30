package br.com.lts.exemplos.listas;

import java.util.List;

public class ExemploParallelStream {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        numeros.parallelStream()
                .forEach(System.out::println);

    }
}

/**
 *
 * 🚀 Quando usar parallelStream()?
 *
 * ✔️ Cenários favoráveis:
 *
 * - Grandes volumes de dados.
 * - Operações independentes, que não precisam ser executadas em sequência.
 * - Operações CPU-bound (processamento intenso) e não IO-bound (espera por rede, disco, etc.).
 *
 * ❌ Evitar quando:
 *
 * - Processamento pequeno (overhead pode ser maior que o ganho).
 * - Operações que dependem de ordem.
 * - Operações com acesso a recursos compartilhados sem sincronização (pode gerar problemas de concorrência).
 */