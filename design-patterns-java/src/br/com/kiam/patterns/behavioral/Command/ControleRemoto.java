package br.com.kiam.patterns.behavioral.Command;

public class ControleRemoto {
    private Comando comandoLigar;
    private Comando comandoDesligar;

    public ControleRemoto(Comando comandoLigar, Comando comandoDesligar) {
        this.comandoLigar = comandoLigar;
        this.comandoDesligar = comandoDesligar;
    }

    public void ligar() {
        comandoLigar.executar();
    }

    public void desligar() {
        comandoDesligar.executar();
    }
}
