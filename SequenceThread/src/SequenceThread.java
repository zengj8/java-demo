import java.util.ArrayList;

public class SequenceThread {

    public static void main(String ...args) {
        Thread1[] threads = new Thread1[4];
        ArrayList<Integer> lock = new ArrayList<>();
        for (int i = 1; i <= 4; i ++) {
            threads[i - 1] = new Thread1(i, lock);
        }
        for (int i = 3; i >= 0; i --) {
            threads[i].start();
        }
    }
}

class Thread1 extends Thread {

    private ArrayList lock;
    private int num;
    public Thread1(int num, ArrayList lock) {
        this.num = num;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (this.lock) {
            while (this.num != this.lock.size() + 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.add(this.num);
            System.out.println(this.num);
            lock.notifyAll();
        }
    }
}