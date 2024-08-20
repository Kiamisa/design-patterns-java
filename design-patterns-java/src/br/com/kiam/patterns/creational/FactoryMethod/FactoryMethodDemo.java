package br.com.kiam.patterns.creational.FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Criador criadorA = new CriadorA();
        Produto produtoA = criadorA.criarProduto();
        produtoA.operacao();

        Criador criadorB = new CriadorB();
        Produto produtoB = criadorB.criarProduto();
        produtoB.operacao();
    }
}
