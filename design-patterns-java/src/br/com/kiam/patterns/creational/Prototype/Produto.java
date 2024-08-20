package br.com.kiam.patterns.creational.Prototype;

class Produto implements Prototype {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public Prototype clonar() {
        return new Produto(this.nome, this.preco);
    }
}
