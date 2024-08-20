package br.com.kiam.patterns.creational.FactoryMethod;

public class ProdutoConcretoB implements Produto {
    @Override
    public void operacao() {
        System.out.println("Operação do Produto B");
    }
}
