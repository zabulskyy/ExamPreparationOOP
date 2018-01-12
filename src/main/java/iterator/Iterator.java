package iterator;

import command.Command;

import java.util.concurrent.CopyOnWriteArrayList;

public interface Iterator {
    Object next();

    boolean hasNext();
}

class Container {
    Iterator iterator;
    String[] names = {"Maria", "John", "Carl", "Anna"};

    Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator {

        int index = 0;

        @Override
        public String next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return index < names.length;
        }
    }

    public static void main(String[] args) {
        Container container = new Container();
        for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }

}
