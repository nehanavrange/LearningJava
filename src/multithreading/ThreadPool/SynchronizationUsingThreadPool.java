package multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Account
{
	int balance;
	public Account(int balance) {

		this.balance=balance;
	}

	public synchronized void deposit(int amount)
	{
		int temp=balance;
		balance=temp+amount;
	}

	public synchronized void withdraw(int amount)
	{
		int temp=balance;
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

public class SynchronizationUsingThreadPool {
	public static void main(String[] args) {

		ExecutorService executor =Executors.newFixedThreadPool(5);
		
		Account suyogacc = new Account(1000);
		ATMDepositor t1 = new ATMDepositor(suyogacc);
		ATMWithrawl t2 = new ATMWithrawl(suyogacc);
		t1.start();
		t2.start();


		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		

		System.out.println("Final amount is :"+ suyogacc.balance);

	}
}

