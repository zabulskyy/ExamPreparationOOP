package builder;

class Computer {
    int a, b;

    Computer(ComputerBuilder c) {
        this.a = c.a;
        this.b = c.b;
    }
}

public class ComputerBuilder {
    int a, b;

    ComputerBuilder() {
    }

    void setA(int newA) {
        a = newA;
    }

    void setB(int newB) {
        b = newB;
    }

    Computer build() {
        return new Computer(this);
    }
}
