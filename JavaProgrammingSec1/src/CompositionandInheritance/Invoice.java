package CompositionandInheritance;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id,Customer customer,double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return 0000;
	}
	
}

