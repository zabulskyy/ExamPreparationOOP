package adapter;

public class Adapter {

}

class Simple1 {
    static void draw(int x, int y) {
        System.out.println(x + " " + y);
    }
}

class Simple2 {
    static void draw(int y, int x) {
        System.out.println(y + " " + x);
    }
}

interface Shape {
    void draw(int x, int y);
}

class Simple1Adapter implements Shape {
    // Save shape
    public void draw(int x, int y) {
        Simple2.draw(x, y);
    }
}

class Simple2Adapter implements Shape {

    @Override
    public void draw(int x, int y) {
        int newX = y ^ 2;
        int newY = x ^ 2;
        Simple2.draw(newX, newY);

    }
}
