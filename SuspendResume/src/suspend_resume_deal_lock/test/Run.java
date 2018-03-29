package suspend_resume_deal_lock.test;

import suspend_resume_deal_lock.testpackage.SynchronizedObject;

public class Run {

	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();

			Thread thread1 = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};

			thread1.setName("a");
			thread1.start();

			Thread.sleep(1000);

			Thread thread2 = new Thread() {
				@Override
				public void run() {
				System.out
						.println("thread2 启动了，但进入不了 printString() 方法！只打印 1 个 begin");
				System.out
						.println("因为 printString() 方法被 a 线程锁定并且永远 suspend 暂停了");
				object.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
