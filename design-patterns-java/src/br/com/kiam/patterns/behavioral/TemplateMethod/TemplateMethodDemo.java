package br.com.kiam.patterns.behavioral.TemplateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Template templateA = new ConcreteClassA();
        templateA.templateMethod();

        System.out.println();

        Template templateB = new ConcreteClassB();
        templateB.templateMethod();
    }
}
