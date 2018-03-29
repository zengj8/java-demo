

public class JoinMoreRun {
	public static void main(String[] args) {
		try {
			// b.join() 先抢到锁 b，并释放锁 b，之后 a 先抢到锁，执行完后 b.join() 超时，所以先执行 main end，在执行 b 线程
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println("                    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
