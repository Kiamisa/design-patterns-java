package br.com.kiam.patterns.behavioral.ChainOfResponsability;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B processando pedido: " + request);
        } else {
            if (proxHandler != null) {
                proxHandler.handleRequest(request);
            }
        }
    }
}
