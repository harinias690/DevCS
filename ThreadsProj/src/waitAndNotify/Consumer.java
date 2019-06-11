package waitAndNotify;

public class Consumer implements Runnable {
	Q q;
	Thread t;

	public Consumer(Q q) {
		this.q = q;
		t = new Thread(this);

	}

	public void run() {
		for (int i = 0; i < 15; i++) {

			q.get();

		}
	}

}
