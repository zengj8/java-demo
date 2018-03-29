package a;


class MyObject2 {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject2 obj = new MyObject2();
        obj.clone(); // Compile OK.
    }
}