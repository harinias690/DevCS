package anonymous;

public class Example {

	public static void main(String[] args) {
		new Thread("one") {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread() + " has i:" + i);
				}
			}
		}.start();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			System.out.println(Thread.currentThread() + " has i:" + i);
		}

	}

}
