// 说明 sleep 期间会把执行权交给其他线程
class Run1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("zzzzz");
            Thread.sleep(10000);
            System.out.println("xxxxx");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Run2 implements Runnable {
    @Override
    public void run() {
        System.out.println("yyyyyy");
    }
}

public class SleepTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Run1());
        Thread t2 = new Thread(new Run2());
        t1.start();
        t2.start();
    }
}
