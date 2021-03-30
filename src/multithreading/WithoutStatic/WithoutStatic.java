package multithreading.WithoutStatic;

public class WithoutStatic {
public static void main(String[] args) {
	Customer c1= new Customer("suyog", 4000);
	Customer c2= new Customer("neha", 5000);
	Bank b1= new Bank(c1);
	
	
	
}
}
