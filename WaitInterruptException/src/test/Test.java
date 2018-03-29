package test;

import extthread.ThreadP;
import extthread.ThreadT;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadT a = new ThreadT(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();

			Thread.sleep(5000);

			ThreadP b = new ThreadP(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
