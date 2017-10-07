package pkgone;

import java.math.BigDecimal;

public class Employee extends Person {

	private BigDecimal salary;
	private SecurityLevel secLevel;
	
	
	public SecurityLevel getSecLevel() {
		return secLevel;
	}

	public void setSecLevel(SecurityLevel secLevel) {
		this.secLevel = secLevel;
	}

	public Employee(String fname, String lname, int age, BigDecimal salary){
		super(fname,lname,age);
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Employee eating");
	}

	
}
