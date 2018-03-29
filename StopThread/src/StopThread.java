public class StopThread {
    public static void main(String[] args) {
        try {
            Thread t = new Thread() {
                //对于方法进行了同步操作，锁对象就是线程本身
                public synchronized void run() {
                    try {
                        long start=System.currentTimeMillis();
                        //开始计数
                        for (int i = 0; i < 100000; i++)
                            System.out.println("runing.." + i);
                        System.out.println((System.currentTimeMillis()-start)+"ms");
                    } catch (Throwable ex) {
                        System.out.println("Caught in run: " + ex);
                        ex.printStackTrace();
                    }
                }
            };
            //开始计数
            t.start();
            //主线程休眠100ms
            Thread.sleep(10);
            //停止线程的运行
            t.stop();
        } catch (Throwable t) {
            System.out.println("Caught in main: " + t);
            t.printStackTrace();
        }

    }
}
