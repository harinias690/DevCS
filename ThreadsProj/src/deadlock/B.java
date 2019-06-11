package deadlock;

public class B {
	
	public synchronized void bar(A a){
		System.out.println("entered bar method in class B");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.last();
	}

	public synchronized void last() {
		System.out.println("entered last method of class B");
	}
	
}
