package br.com.kiam.patterns.behavioral.ChainOfResponsability;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A processando pedido: " + request);
        } else {
            if (proxHandler != null) {
                proxHandler.handleRequest(request);
            }
        }
    }
}
