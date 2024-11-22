package java_programs;

public class BankCustomer {

	// Fields
	private int acno; // Account number
	private String atype; // Account type
	private double amt; // Account balance

	// Constructor with no arguments
	public BankCustomer() {
		this.acno = 0;
		this.atype = "";
		this.amt = 0.0;
	}

	// Constructor with one argument (account number)
	public BankCustomer(int acno) {
		this.acno = acno;
		this.atype = "";
		this.amt = 0.0;
	}

	// Constructor with two arguments (account number and type)
	public BankCustomer(int acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0;
	}

	// Constructor with three arguments (account number, type, and balance)
	public BankCustomer(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Getters and setters
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

	// toString method to display customer details
	@Override
	public String toString() {
		return "Account Number: " + acno + "\nAccount Type: " + atype + "\nBalance: " + amt;
	}

	// Main method
	public static void main(String[] args) {
		// Create BankCustomer objects using different constructors
		BankCustomer customer1 = new BankCustomer();
		customer1.setAcno(123);
		customer1.setAtype("Savings");
		customer1.setAmt(1000.0);

		BankCustomer customer2 = new BankCustomer(456);
		customer2.setAtype("Current");
		customer2.setAmt(500.0);

		BankCustomer customer3 = new BankCustomer(789, "Fixed Deposit");
		customer3.setAmt(2000.0);

		BankCustomer customer4 = new BankCustomer(1011, "Recurring Deposit", 3000.0);

		// Display customer details
		System.out.println("Customer 1:\n" + customer1);
		System.out.println("\nCustomer 2:\n" + customer2);
		System.out.println("\nCustomer 3:\n" + customer3);
		System.out.println("\nCustomer 4:\n" + customer4);
	}
}
           /* Output 
              Customer 1:
              Account Number: 123
              Account Type: Savings
              Balance: 1000.0
              
              Customer 2:
              Account Number: 456
              Account Type: Current
              Balance: 500.0
              
              Customer 3:
              Account Number: 789
              Account Type: Fixed Deposit
              Balance: 2000.0
              
              Customer 4:
              Account Number: 1011
              Account Type: Recurring Deposit
              Balance: 3000.0 */
