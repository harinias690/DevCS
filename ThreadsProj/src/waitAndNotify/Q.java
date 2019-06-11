package waitAndNotify;

public class Q {
	int n;
	int j = 1;

	public synchronized int get() {
		int val;
		while (j != 0) {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		val = n;
		System.out.println("n:" + n);
		j = 1;
		notify();
		return val;
	}

	public synchronized void put(int n) {
		while (j != 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		j = 0;
		notify();
	}

}
