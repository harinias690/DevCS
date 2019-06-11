package deadlock;

public class DeadLock implements Runnable {
	Thread r;
	A a = new A();
	B b = new B();

	public DeadLock() {
		if(a!=null) System.out.println("a is not null");
		System.out.println("this is " + Thread.currentThread());
		r = new Thread(this, "RacingThread");
		r.start();
		a.foo(b);
	}

	public void run() {
		System.out.println("this is " + Thread.currentThread());
		b.bar(a);
	}

	public static void main(String[] args) {
		new DeadLock();

	}

}
