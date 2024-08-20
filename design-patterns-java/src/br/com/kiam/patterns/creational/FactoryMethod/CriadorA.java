package br.com.kiam.patterns.creational.FactoryMethod;

public class CriadorA extends Criador {
    @Override
    public Produto criarProduto() {
        return new ProdutoConcretoA();
    }
}
