package threadDemo;

public abstract class ThreadsJoin {

	public static void main(String[] args) {
		NewThread r1 = new NewThread("one");
		NewThread r2 = new NewThread("two");
		NewThread r3 = new NewThread("three");
		
		System.out.println(r1.t.isAlive());
		System.out.println(r2.t.isAlive());
		System.out.println(r3.t.isAlive());
		
		for(int i=0;i<5;i++){
			System.out.println("Main Thread i="+i);
		}
		
		try {
			r1.t.join();
			System.out.println("thread one joined main");
			r2.t.join();
			System.out.println("thread two joined main");
			r3.t.join();
			System.out.println("thread three joined main");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(r1.t.isAlive());
		System.out.println(r2.t.isAlive());
		System.out.println(r3.t.isAlive());
		

	}

}
