class Animal {
    public int num = 0;
    public void cry() {
        System.out.println("xxx");
    }
}

class Tiger extends Animal {
    public int num = 1;
    public void cry() {
        System.out.println("yyy");
    }

    public void bite() {
        System.out.println("zzz");
    }
}


public class PolymorphicTest {
    public static void main(String ...args) {
        Animal a = new Tiger();
        a.cry();
        ((Tiger)a).bite();
        System.out.println(a.num);
    }
}
