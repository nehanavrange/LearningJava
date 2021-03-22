package multithreading.waitnotify;


class Account
{
	int balance;
	public Account(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}

	public synchronized void  deposit(int amount)
	{
	    
		int temp=balance;
		balance=temp+amount;
		if(balance>0) {
			notify();
			System.out.println("Wake up from blocking/waiting state");
		}
	}

	public void withdraw(int amount) 
	{
		
		int temp=balance;
		if(temp<=0) {
			System.out.println("Balance is not sufficient, Please wait while balance get diposited");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance=temp-amount;
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

		//for (int i = 0; i < 2; i++) {
			account.deposit(1000);

		//}
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

		//for (int i = 0; i < 2; i++) {
			account.withdraw(1000);

		//}
	}
}

public class WaitNotifyBankAccount {
	public static void main(String[] args) {
		Account suyogacc = new Account(0);
		ATMDepositor t1 = new ATMDepositor(suyogacc);
		ATMWithrawl t2 = new ATMWithrawl(suyogacc);
	
		t2.start();
		//Thread.sleep(500);
        t1.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Final amount is :"+ suyogacc.balance);


	}
}
