package service;

public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
//				lock.wait();
				Thread.sleep(10000);
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("�����쳣�ˣ���Ϊ��wait״̬���̱߳�interrupt�ˣ�");
		}
	}

	public void testMethod2(Object lock) {
		synchronized (lock) {
			System.out.println("wait��interrupt�Ժ��ͷ�����");
		}
	}
}
