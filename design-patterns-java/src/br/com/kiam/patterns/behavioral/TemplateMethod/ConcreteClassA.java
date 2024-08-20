package br.com.kiam.patterns.behavioral.TemplateMethod;

public class ConcreteClassA extends Template{
    @Override
    protected void primitiveOperation1() {
        System.out.println("Operação primitiva 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Operação primitiva 2");
    }
}
