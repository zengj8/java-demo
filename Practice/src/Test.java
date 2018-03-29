
class A {
    private int x = 1;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class B extends A {
    private int x = 2;

    public int getX() {
        return x;
    }
}

public class Test {
    public static void main(String[] args)  {
        B b = new B();
//        b.setX(232);
        System.out.println(b.getX());
    }
}
