
public class Interrupt {

    public static void main(String[] args) throws Exception {
        Interrupt t = new Interrupt();
        t.start();
    }

    public void start() {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            Thread.sleep(3000);
            myThread.cancel();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class MyThread extends Thread {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("test");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    //抛出 InterruptedException 后中断标志被清除，标准做法是再次调用interrupt恢复中断
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("stop");
        }

        public void cancel(){
            interrupt();
        }
    }
}