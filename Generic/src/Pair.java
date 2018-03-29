public class Pair<T> {
    private T first = null;
    private T second = null;

    public Pair() {
    }

    public Pair(T fir, T sec) {
        this.first = fir;
        this.second = sec;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setFirst(T fir) {
        this.first = fir;
    }

    public void setSecond(T sec) {
        this.second = sec;
    }

    public static void main(String[] args) {
//        Pair<? extends Fruit> pair = new Pair<Apple>(new Apple(), new Apple());
//        Fruit f = pair.getFirst();
//        pair.setFirst(new Apple());

//        Pair<? super Apple> pair = new Pair<Apple>(new Apple(), new Apple());
//        Object o = pair.getFirst();
//        Apple apple = pair.getFirst();
//        pair.setFirst(new Apple());

        Pair p = new Pair("xx", "yy");
        p.setFirst("zz");
        System.out.println(p.getFirst());
    }

    public static <T extends Comparable<T>> T[] maxTwo(T[] array) {
        Object[] result = new Object[2];
        return (T[]) result; // Type safety: Unchecked cast from Object[] to T[]
    }
}


class SonPair extends Pair<String> {
    @Override
    public String getFirst() {
        return super.getFirst();
    }

    public void setFirst(String fir) {
        setFirst(fir);
    }
}