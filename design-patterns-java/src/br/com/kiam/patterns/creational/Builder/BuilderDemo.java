package br.com.kiam.patterns.creational.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Carro carro = new CarroBuilder()
                .setModelo("Fusca")
                .setAno(1970)
                .setCor("Azul")
                .build();

        System.out.println(carro);
    }
}
