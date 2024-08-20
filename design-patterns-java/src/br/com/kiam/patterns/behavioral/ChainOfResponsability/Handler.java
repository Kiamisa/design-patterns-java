package br.com.kiam.patterns.behavioral.ChainOfResponsability;

abstract class Handler {
    protected Handler proxHandler;

    public void setProxHandler(Handler proxHandler) {
        this.proxHandler = proxHandler;
    }

    public abstract void handleRequest(String request);
}
