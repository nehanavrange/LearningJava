package multithreading.synchronization.waitnotifysyncblock;


class Account
{
	int balance;
	public Account(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}

	public void deposit(int amount)
	{
		System.out.println("going to deposit..."); 
		synchronized (this) {
			int temp=balance;
			balance=temp+amount;
			if(balance>0) {
				notifyAll();
				System.out.println("Wake up from blocking/waiting state");

			}
			System.out.println("deposite amt:"+amount);
			System.out.println("deposit completed... ");  

			System.out.println("total balance:"+balance);
		}

		System.out.println("");
	}

	public  void withdraw(int amount)
	{
		System.out.println("going to withdraw...");
		synchronized (this) {
			int temp=this.balance;
			if(temp<amount) {
				System.out.println("Balance is insufficient, Please wait while balance get deposited");
				try {
					wait();
				} catch (InterruptedException e) {

					System.out.println("Exception");
				}
			}
			balance=this.balance-amount;  
			System.out.println("withdraw amt:"+amount);
			System.out.println("withdraw completed..."); 
			System.out.println("total balance:"+balance);
		}
		

		System.out.println("");
	}
}

class ATMDepositor extends Thread{
	Account account;
	public ATMDepositor(Account account) {
		
		this.account=account;
	}
	@Override
	public void run() {

			account.deposit(1000);
	}
}

class ATMWithrawl extends Thread{
	Account account;
	public ATMWithrawl(Account account) {
		
		this.account=account;
	}
	@Override
	public void run() {
			account.withdraw(1000);
	}
}

public class waitNotifyInSyncBlock {
	public static void main(String[] args) throws InterruptedException {
		Account suyogacc = new Account(000);
		ATMDepositor t1 = new ATMDepositor(suyogacc);
		ATMWithrawl t2 = new ATMWithrawl(suyogacc);
		ATMDepositor t3 = new ATMDepositor(suyogacc);
		ATMWithrawl t4 = new ATMWithrawl(suyogacc);
		t2.start();
		t4.start();

		Thread.sleep(2);
		t1.start();
		t3.start();

		t1.join();
		t2.join();t3.join();
		t4.join();

		System.out.println("Final amount is :"+ suyogacc.balance);


	}

}
