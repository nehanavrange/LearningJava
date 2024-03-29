package multithreading.racecondition;

// not giving proper output without synchronization
class Account
{
	int balance;
	public Account(int balance) {

		this.balance=balance;
	}

	public void deposit(int amount)
	{
		int temp=balance;
		balance=temp+amount;
	}

	public void withdraw(int amount)
	{
		int temp=balance;
		balance=temp-amount;
	}
}

class ATMDepositor extends Thread{
	Account account;
	public ATMDepositor(Account account) {

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

		this.account=account;
	}
	@Override
	public void run() {

		for (int i = 0; i < 10000; i++) {
			account.withdraw(200);

		}
	}
}

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		Account suyogacc = new Account(1000);
		ATMDepositor t1 = new ATMDepositor(suyogacc);
		ATMWithrawl t2 = new ATMWithrawl(suyogacc);
		t1.start();
		t2.start();


		t1.join();
		t2.join();

		System.out.println("Final amount is :"+ suyogacc.balance);


	}
}
