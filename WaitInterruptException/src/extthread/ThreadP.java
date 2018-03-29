package extthread;

import service.Service;

public class ThreadP extends Thread {

    private Object lock;

    public ThreadP(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod2(lock);
    }
}
