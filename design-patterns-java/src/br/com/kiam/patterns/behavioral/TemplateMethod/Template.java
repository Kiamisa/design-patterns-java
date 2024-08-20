package br.com.kiam.patterns.behavioral.TemplateMethod;

abstract public class Template {
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }

    abstract protected void primitiveOperation1();
    abstract protected void primitiveOperation2();

    public void primitiveOperation3() {
        System.out.println("Operação primitiva 1");
     }
}
