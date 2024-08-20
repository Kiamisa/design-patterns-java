package br.com.kiam.patterns.structural.Proxy;

public class SujeitoReal implements Sujeito {
    @Override
    public void realizarOperacao() {
        System.out.println("Operação realizada pelo Sujeito Real.");
    }
}
