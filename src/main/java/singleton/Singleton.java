package singleton;

public class Singleton {

    int var = 10;
    private static Singleton instance = new Singleton();

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.var);
        singleton.var = 100;
        System.out.println(singleton.var);

        Singleton newSingleton = Singleton.getInstance();
        System.out.println(newSingleton.var);


    }
}
