package br.com.kiam.patterns.creational.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Produto produtoOriginal = new Produto("Produto A", 100.0);
        Produto produtoClonado = (Produto) produtoOriginal.clonar();

        System.out.println("Produto Original: " + produtoOriginal.getNome() + " - " + produtoOriginal.getPreco());
        System.out.println("Produto Clonado: " + produtoClonado.getNome() + " - " + produtoClonado.getPreco());
    }
}
