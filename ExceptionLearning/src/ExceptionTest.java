public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        if (true) {
            throw new Exception("xxx");
        }
        System.out.println("xxxx");
    }
}