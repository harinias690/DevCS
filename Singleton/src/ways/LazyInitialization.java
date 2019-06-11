package ways;

public class LazyInitialization {
	
	 String fname;
	private String lname;
	private int day;
	private static final LazyInitialization instance = new LazyInitialization();
	
	private LazyInitialization(){}
	
	public static LazyInitialization getInstance(){
		return instance;
	}
	
	public String toString(){
		return fname+" "+lname+" "+" day"+day+" java practice";
	}
	
	
	public String getFname(){
		return fname;
	}

	public void setFname(String fname){
		this.fname=fname;
	}
	

	public String getLname(){
		return fname;
	}

	public void setLname(String lname){
		this.lname=lname;
	}
	
	public int getDay(){
		return day;
	}

	public void setDay(int day){
		this.day=day;
	}
	
}
