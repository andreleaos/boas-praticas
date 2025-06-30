package br.com.lts.exemplos.testesunitarios;

public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public String buscarNomeDoClientePorId(Long id) {
        Cliente cliente = repository.buscarPorId(id);
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
        return cliente.getNome();
    }
}

class ClienteRepository {

    public Cliente buscarPorId(Long id) {
        return new Cliente(1, "Andre");
    }
}

class Cliente {

    private int id;
    private String nome;

    public Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return null;
    }
}