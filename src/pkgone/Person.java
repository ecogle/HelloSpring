package pkgone;

public abstract class Person {
	
	private String fName;
	private String lName;
	private int age;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String fname, String lname, int age){
		this.fName = fname;
		this.lName = lname;
		this.age = age;
	}

	public   void eat(){
		System.out.println("Eat like a person");
	}
	public void sleep(){
		System.out.println("Person sleeping");
	}
	public void drive(){
		System.out.println("Person driving");
	}
	
}
