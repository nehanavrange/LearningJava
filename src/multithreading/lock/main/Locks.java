package multithreading.lock.main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
	int balance;
	Lock lock =new ReentrantLock();
	public Account(int balance) {

		this.balance=balance;
	}

	public void  deposit(int amount)
	{
		lock.lock();
		int temp=balance;
		balance=temp+amount;
		lock.unlock();
	}

	public void withdraw(int amount)
	{
		lock.lock();
		int temp=balance;
		balance=temp-amount;
		lock.unlock();
	}
}

class ATMDepositor extends Thread{
	Account account;
	public ATMDepositor(Account account) {

		this.account=account;
	}
	@Override
	public void run() {

		for (int i = 0; i < 40000; i++) {
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

		for (int i = 0; i < 40000; i++) {
			account.withdraw(200);

		}
	}
}

public class Locks {
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