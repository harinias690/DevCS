package threadDemo;

public class CallMe {
	
	public synchronized static void displayMsg(String msg){
		System.out.println("[");
		System.out.println(msg+"]");
	}

}
