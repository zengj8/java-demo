package suspend_resume_LockStop.mythread;

public class MyThread extends Thread {
	private long i = 0;

	@Override
	public void run() {
		System.out.println("run " + System.out);
		while (true) {
			i++;
			System.out.println(i);
		}
	}
}
