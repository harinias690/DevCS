package waitAndNotify;

public class PS {

	public static void main(String[] args) {
		Q q = new Q();
		Producer p = new Producer(q);
		p.t.start();
		Consumer c = new Consumer(q);
		c.t.start();

	}

}
