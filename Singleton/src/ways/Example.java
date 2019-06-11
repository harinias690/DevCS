package ways;

public class Example {

	public static void main(String[] args) {
		LazyInitialization.getInstance().setFname("harini");
		LazyInitialization.getInstance().setLname("akula");
		LazyInitialization.getInstance().setDay(1);

		System.out.println(LazyInitialization.getInstance());

			}

}
