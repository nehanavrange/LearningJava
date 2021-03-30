package multithreading.WithoutStatic;

public class Customer {

	private String name="Neha";

	private int amount;


	public Customer(String name,  int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name+ ", amount=" + amount + "]";
	}

}
