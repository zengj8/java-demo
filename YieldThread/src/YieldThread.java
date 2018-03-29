public class YieldThread {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        System.out.println(beginTime);
        int count = 0, x = 0;
        // 说明 yield 让出 CPU 以后从以前中断的地方开始执行
        for (int i = 0; i < 5000; i ++) {
            System.out.println(++ x);
            Thread.yield();
            System.out.println(++ x);
            count += i + 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime));
    }
}