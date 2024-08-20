package br.com.kiam.patterns.structural.Proxy;

public class Proxy implements Sujeito {
    private SujeitoReal sujeitoReal;

    @Override
    public void realizarOperacao() {
        if (sujeitoReal == null) {
            sujeitoReal = new SujeitoReal();
        }
        System.out.println("Proxy: Realizando algumas operações antes da chamada ao Sujeito Real.");
        sujeitoReal.realizarOperacao();
        System.out.println("Proxy: Realizando algumas operações após a chamada ao Sujeito Real.");
    }
}
