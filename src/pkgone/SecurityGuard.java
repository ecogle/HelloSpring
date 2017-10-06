package pkgone;

import java.math.BigDecimal;

public class SecurityGuard extends Employee implements SecurityClearance{

	private SecurityClearance clearance;
	
	public SecurityClearance getClearance() {
		return clearance;
	}

	public void setClearance(SecurityClearance clearance) {
		this.clearance = clearance;
	}

	public SecurityGuard(String fname, String lname, int age, BigDecimal salary) {
		super(fname, lname, age, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SecurityLevel getSecurityLevel(Employee emp) {
		
		if(emp.getSecLevel() != null){
			return emp.getSecLevel();
		}
		return new SecurityLevel();
	}

	

}
