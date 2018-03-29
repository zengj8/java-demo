public class FinalTest {
    public static void main(String[] args) throws Exception {

        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        int i = 2;
        String f = "hello" + i;
        System.out.println(a == c);
        System.out.println(a == e);
        System.out.println(a == f);
        System.out.println(a.equals(c));
        System.out.println(a.equals(e));
        System.out.println(a.equals(f));

        String aa = "hello" + 2;
        System.out.println(aa == a);

        final String bb = getHello();
        System.out.println(bb == a);

    }

    private static String getHello() {
        return "hello";
    }
}
