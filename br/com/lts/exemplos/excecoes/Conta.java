package br.com.lts.exemplos.excecoes;

public class Conta {
    private double saldo = 100;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= valor;
    }
}
