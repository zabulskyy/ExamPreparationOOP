package observer;

import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> observers = new ArrayList<>();

    int value;

    void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update();
        }
    }
}

abstract class Observer {
    Subject subject;

    Observer(Subject subject) {
        this.subject = subject;
        subject.observers.add(this);
    }

    abstract void update();
}

class SquareObserver extends Observer {

    SquareObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println(this.subject.value * this.subject.value);
    }
}


class DoubleObserver extends Observer {

    DoubleObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println(this.subject.value * 2);
    }
}

class Test{
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.value = 10;
        DoubleObserver doubleObserver = new DoubleObserver(subject);
        SquareObserver squareObserver = new SquareObserver(subject);
        subject.notifyObservers();
    }
}