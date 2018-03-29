package suspend_resume_deal_lock.testpackage;

public class SynchronizedObject {

	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a 线程永远 suspend 了");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}

}
