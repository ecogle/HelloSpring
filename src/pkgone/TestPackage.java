package pkgone;

import java.math.BigDecimal;

public class TestPackage {

	public static void main(String[] args) {
		Person emp = new Employee("Chad", "Ogle",44, new BigDecimal("123400.98"));
		
		emp.eat();
		emp.drive();
		
		
	}
}
