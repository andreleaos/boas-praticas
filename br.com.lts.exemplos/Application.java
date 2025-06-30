package br.com.lts.exemplos;

import br.com.lts.exemplos.heranca.Carro;

public class Application {
    public static void main(String[] args) {
        int op = 3;

        switch (op){
            case 1:
                exemploSimplesOO();
                break;

            case 2:
                exemploFibonacci();
                break;

            case 3:
                exemploOO();
                break;

        }
    }

    static void exemploSimplesOO(){
        Cliente cliente = new Cliente(1,"Andre", "andreleaos@gmail.com");
        System.out.println(cliente.toString());
    }

    static void exemploFibonacci(){

        int n = 10;

        for(int i =1; i<=n;i++){
             int r = Utilitario.fibonacci(i);
            System.out.println(r);
        }
    }

    static void exemploOO(){
        Carro meuCarro = new Carro("Fox", 2014, "Preto");
        meuCarro.acelerar();
        meuCarro.frear();
    }
}
