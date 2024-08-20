package br.com.kiam.patterns.structural.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Sujeito sujeito = new Proxy();
        sujeito.realizarOperacao();
    }
}
