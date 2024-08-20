package br.com.kiam.patterns.creational.Builder;

public class CarroBuilder {
    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setAno(int ano) {
        carro.setAno(ano);
        return this;
    }

    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    public Carro build() {
        return carro;
    }
}
