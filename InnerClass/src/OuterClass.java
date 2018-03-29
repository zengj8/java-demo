
abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}

public class OuterClass {

    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {
        OuterClass test = new OuterClass();
        int x = 1000;
        test.test(new Bird() {

            public int fly() {
                return x;
            }

            public String getName() {
                return "大雁";
            }
        });
    }
}