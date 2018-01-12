package template;

public abstract class Template {
    void print(){
        step1();
        step2();
        step3();
    }
    abstract void step1();
    abstract void step2();
    abstract void step3();
}

class One extends Template{

    @Override
    void step1() {
        System.out.println("One: step1");
    }

    @Override
    void step2() {
        System.out.println("One: step2");
    }

    @Override
    void step3() {
        System.out.println("One: step3");
    }
}