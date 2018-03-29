package ext;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

	@Override
	protected Object childValue(Object parentValue) {
		return parentValue + " 我在子线程加的~!";
	}


	/**
	 * Computes the child's initial value for this inheritable thread-local
	 * variable as a function of the parent's value at the time the child
	 * thread is created.  This method is called from within the parent
	 * thread before the child is started.
	 * <p>
	 * This method merely returns its input argument, and should be overridden
	 * if a different behavior is desired.
	 *
	 * @param parentValue the parent thread's value
	 * @return the child thread's initial value
	 */
//	protected T childValue(T parentValue) {
//		return parentValue;
//	}
//	这个方法返回的是子线程在第一次get的时候的初始值，如果不重写，默认就是返回父线程的值。在形式上和ThreadLocal的initialValue类似
}
