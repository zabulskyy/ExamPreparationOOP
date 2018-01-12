package decorator;

public interface Pizza {
    int getPrice();
}

class PlainPizza implements Pizza {
    public int getPrice() {
        return 20;
    }
}

abstract class Topping implements Pizza {
    private Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }
}

class Cheese extends Topping {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        super(pizza);
    }


    @Override
    public int getPrice() {
        return this.pizza.getPrice() + 10;
    }
}
