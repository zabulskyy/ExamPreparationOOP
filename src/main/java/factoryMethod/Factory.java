package factoryMethod;

abstract class Shape {

}

class Triangle extends Shape {

}

class Rectangle extends Shape {

}

public abstract class Factory {
    abstract Shape makeObject();
}

class RectangleFactory extends Factory {

    @Override
    Shape makeObject() {
        return new Rectangle();
    }
}

class TrangleFactory extends Factory {

    @Override
    Shape makeObject() {
        return new Triangle();
    }
}
