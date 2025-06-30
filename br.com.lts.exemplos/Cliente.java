package br.com.lts.exemplos;

public class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente(){

    }

    public Cliente(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("id: %d, Nome: %s, Email: %s", id, nome, email);
    }
}
