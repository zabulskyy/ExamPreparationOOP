public class Sandbox implements Interface {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Pet pet = new Pet();
        Dog dog2 = (Dog) pet;

    }

}

interface Interface {
    default void lol() {
        System.out.println("lol");
    }

    static void kek() {
        System.out.println("kek");
    }

}

class Pet {

}

class Dog extends Pet {

}


