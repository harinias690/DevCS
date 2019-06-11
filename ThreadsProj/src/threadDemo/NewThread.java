package threadDemo;

public class NewThread implements Runnable {

	Thread t;

	NewThread(String name) {
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName() + " i=" + i);

		}
		CallMe.displayMsg(t.getName());
	}
}
