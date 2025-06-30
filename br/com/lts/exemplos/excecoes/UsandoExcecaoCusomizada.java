package br.com.lts.exemplos.excecoes;

public class UsandoExcecaoCusomizada {

    public static void main(String[] args) {
        Conta conta = new Conta();
        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
