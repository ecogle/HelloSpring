package pkgone;

import java.math.BigDecimal;

public class Employee extends Person {

	private BigDecimal salary;
	
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
}
