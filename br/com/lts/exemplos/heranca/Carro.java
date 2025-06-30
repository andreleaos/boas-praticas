package br.com.lts.exemplos.heranca;

public class Carro {
    // Atributos
    private String modelo;
    private int ano;
    private String cor;

    // Construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Métodos
    public void acelerar() {
        System.out.println(modelo + " está acelerando!");
    }

    public void frear() {
        System.out.println(modelo + " está freando!");
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

