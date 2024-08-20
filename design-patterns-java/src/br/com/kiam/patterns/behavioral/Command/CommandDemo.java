package br.com.kiam.patterns.behavioral.Command;

public class CommandDemo {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ComandoLigar comandoLigar = new ComandoLigar(luz);
        ComandoDesligar comandoDesligar = new ComandoDesligar(luz);

        comandoLigar.executar();
        comandoDesligar.executar();
    }
}
