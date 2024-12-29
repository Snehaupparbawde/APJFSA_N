package java_programs;

import java.io.Serializable;

public class BankAccountBean implements Serializable {

	// Private fields for account details
	private int acno;
	private String atype;
	private double amt;

	// No-arg constructor
	public BankAccountBean() {
	}

	// Parameterized constructor
	public BankAccountBean(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Getters
	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "BankCustomer [acno=" + acno + ", atype=" + atype + ", amt=" + amt + "]";
	}

	public static void main(String[] args) {
		// Create BankCustomer object using no-arg constructor
		BankAccountBean obj1 = new BankAccountBean();
		obj1.setAcno(12345);
		obj1.setAtype("Savings");
		obj1.setAmt(10000.0);

		// Create BankCustomer object using parameterized constructor
		BankAccountBean obj2 = new BankAccountBean(67890, "Current", 5000.0);

		// Display account details
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
          /* Output
             BankCustomer [acno=12345, atype=Savings, amt=10000.0]
             BankCustomer [acno=67890, atype=Current, amt=5000.0] */