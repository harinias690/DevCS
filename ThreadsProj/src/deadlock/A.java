package deadlock;

public class A {
	public synchronized void foo(B b) {
		System.out.println("enter foo method  in class A");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.last();
	}

	public synchronized void last() {
		System.out.println("entered last method of class A");
	}
}
