package br.com.lts.exemplos.heranca;

public class Cachorro extends Animal {
    public void latir() {
        System.out.println("O cachorro está latindo.");
    }
}

// Sobrecarga
//public void som(String tipo) { }
//public void som(int intensidade) { }

// Sobrescrita
//@Override
//public void comer() {
//    System.out.println("O cachorro está comendo ração.");
//}