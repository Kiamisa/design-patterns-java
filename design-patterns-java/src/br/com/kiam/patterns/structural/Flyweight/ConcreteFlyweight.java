package br.com.kiam.patterns.structural.Flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Intrinsic state: " + intrinsicState + " Extrinsic state: " + extrinsicState);
    }
}
