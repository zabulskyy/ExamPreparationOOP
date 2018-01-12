package staticFactory;

abstract class Shape {

}

class Triangle extends Shape {

}

class Rectangle extends Shape {

}

public class StaticFactory {
    public static Shape factory(String type) {
        switch (type.toLowerCase()) {
            case "triangle":
                return new Triangle();
            case "rectangle":
                return new Rectangle();
        }
        return null;
    }
}
    