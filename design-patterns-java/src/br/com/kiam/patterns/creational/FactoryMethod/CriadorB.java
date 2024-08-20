package br.com.kiam.patterns.creational.FactoryMethod;

public class CriadorB extends Criador {
    @Override
    public Produto criarProduto() {
        return new ProdutoConcretoB();
    }
}
