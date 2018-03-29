public class Run {
    public static void main(String[] args){

        CountOperate c = new CountOperate();
//        c.start();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive = " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive = " + t1.isAlive());
        System.out.println("main end c isAlive = " + c.isAlive());

    }
}

class CountOperate extends Thread {

    public CountOperate(){
        System.out.println("CountOperate --- begin");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("Thread.currentThread() == this : "+ (Thread.currentThread() == this));
        System.out.println("this.getName = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("CountOperate --- end ");
    }

    @Override
    public void run() {
        System.out.println("run --- begin");
        System.out.println("Thread.currentThread().getName = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("Thread.currentThread() == this : "+ (Thread.currentThread() == this));
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("run --- end");
    }
}
