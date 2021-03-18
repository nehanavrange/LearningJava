package synchronizationblock;


class Account
{
	int balance;
	public Account(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}

	public void deposit(int amount)
	{
		synchronized (this) {
			int temp=balance;
			balance=temp+amount;	
		}
		
		System.out.println("");
	}

	public  void withdraw(int amount)
	{
		synchronized (this) {
			int temp=balance;
			balance=temp-amount;
			
		}

		System.out.println("");
	}
}

class ATMDepositor extends Thread{
	Account account;
	public ATMDepositor(Account account) {
		// TODO Auto-generated constructor stub
		this.account=account;
	}
	@Override
	public void run() {

		for (int i = 0; i < 10000; i++) {
			account.deposit(200);

		}
	}
}

class ATMWithrawl extends Thread{
	Account account;
	public ATMWithrawl(Account account) {
		// TODO Auto-generated constructor stub
		this.account=account;
	}
	@Override
	public void run() {

		for (int i = 0; i < 10000; i++) {
			account.withdraw(200);

		}
	}
}

public class RaceConditionSolutionUsingSync {
	public static void main(String[] args) throws InterruptedException {
		Account suyogacc = new Account(1000);
		ATMDepositor t1 = new ATMDepositor(suyogacc);
		ATMWithrawl t2 = new ATMWithrawl(suyogacc);
		t1.start();
		t2.start();


		t1.join();
		t2.join();

		System.out.println("Final amount is -"+ suyogacc.balance);


	}
}
