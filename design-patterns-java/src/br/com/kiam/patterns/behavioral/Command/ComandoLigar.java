package br.com.kiam.patterns.behavioral.Command;

public class ComandoLigar {
    private Luz luz;

    public ComandoLigar(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.ligar();
    }
}
