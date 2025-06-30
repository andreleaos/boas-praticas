package br.com.lts.exemplos.testesunitarios;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;

public class ClienteServiceTest {

    private ClienteRepository repository;
    private ClienteService service;

//    @BeforeEach
//    void setup() {
//        repository = mock(ClienteRepository.class);
//        service = new ClienteService(repository);
//    }
//
//    @Test
//    @DisplayName("Deve retornar o nome do cliente quando encontrado")
//    void deveRetornarNomeCliente() {
//        when(repository.buscarPorId(1L)).thenReturn(new Cliente(1L, "André"));
//
//        String nome = service.buscarNomeDoClientePorId(1L);
//
//        assertEquals("André", nome);
//        verify(repository, times(1)).buscarPorId(1L);
//    }
//
//    @Test
//    @DisplayName("Deve lançar exceção quando cliente não for encontrado")
//    void deveLancarExcecaoQuandoClienteNaoEncontrado() {
//        when(repository.buscarPorId(2L)).thenReturn(null);
//
//        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
//            service.buscarNomeDoClientePorId(2L);
//        });
//
//        assertEquals("Cliente não encontrado.", ex.getMessage());
//    }
}
