package br.com.kiam.patterns.behavioral.Command;

public class ComandoDesligar {
    private Luz luz;

    public ComandoDesligar(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.desligar();
    }
}
