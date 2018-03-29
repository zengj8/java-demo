package extthread;

import service.Service;

public class ThreadT extends Thread {

	private Object lock;

	public ThreadT(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}

}
