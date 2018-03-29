package suspend_resume_LockStop.test;

import suspend_resume_LockStop.mythread.MyThread;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			System.out.println("main " + System.out);
			Thread.sleep(10);
			thread.suspend();
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
