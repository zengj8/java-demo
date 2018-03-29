import java.util.ArrayList;
import java.util.List;

class Fruit {
    public void print() {
        System.out.println(1);
    }
}

class Apple extends Fruit {
    @Override
    public void print() {
        System.out.println(2);
    }
}

class Orange extends Fruit {
}

public class GenericWriting {
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Apple());
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}