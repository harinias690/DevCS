package ways;

public class DoubleLock {

	private String fname;
	private String lname;
	private int day;
	private static DoubleLock instance;

	private DoubleLock() {}

	private DoubleLock(String fname, String lname, int day) {
		this.fname = fname;
		this.lname = lname;
		this.day = day;
	}

	public static DoubleLock getInstance() {
		return instance;
	}

	public String toString() {
		return fname + " " + lname + " " + " day" + day + " java practice";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
