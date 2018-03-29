public class ThreadJoinTest {

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableImpl());
        new ThreadTest(t).start();
        t.start();
        try {
            t.join(1000);           // main 线程等 1s
            System.out.println("join Finish");
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
//        System.out.println("join Finish");
    }
}

class RunnableImpl implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread Begin sleep " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("Thread End sleep " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTest extends Thread {
    Thread thread;
    public ThreadTest(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        holdThreadLock();
    }

    public void holdThreadLock() {
        //用当前的线程当做lock
        synchronized (thread) {
            System.out.println("ThreadTest getObjectLock " + System.currentTimeMillis());
            try {
                Thread.sleep(9 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("ThreadTest ReleaseObjectLock " + System.currentTimeMillis());
        }

    }
}
