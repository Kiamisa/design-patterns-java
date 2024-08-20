package br.com.kiam.patterns.creational.FactoryMethod;

public class ProdutoConcretoA implements Produto {
    @Override
    public void operacao() {
        System.out.println("Operação do Produto A");
    }
}
