package multithreading.usingLockMethods;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Account
{
	int balance;
	Lock lock= new ReentrantLock();
	 Condition locknewcondition = lock.newCondition();
	 
	 public Account(int balance) {
		this.balance=balance;
	}

	public  void  deposit(int amount) throws InterruptedException
	{
		lock.lock();
		System.out.println("going to deposit..."); 
		int temp=balance;
		balance=temp+amount;
		if(balance>0) {
		    
			locknewcondition.signalAll();
			System.out.println("Wake up from blocking/waiting state");

		}
		//lock.unlock();
		System.out.println("deposite amt:"+amount);
		System.out.println("deposit completed... ");  

		System.out.println("total balance:"+balance);
		lock.unlock();
	}

	public void withdraw(int amount) throws InterruptedException 
	{
		lock.lock();
		System.out.println("going to withdraw...");
		int temp=this.balance;
		if(temp<amount) {
			System.out.println("Balance is insufficient, Please wait while balance get deposited");
			//wait();
			locknewcondition.await();
		}
		balance=this.balance-amount;  
		
		System.out.println("withdraw amt:"+amount);
		System.out.println("withdraw completed..."); 
		System.out.println("total balance:"+balance);
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
		try {
			account.deposit(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		try {
			account.withdraw(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LockMethodsBankAccount {
	public static void main(String[] args) throws InterruptedException {
		Account suyogacc = new Account(0);
		ATMDepositor t1 = new ATMDepositor(suyogacc);
		ATMWithrawl t2 = new ATMWithrawl(suyogacc);
		ATMDepositor t3 = new ATMDepositor(suyogacc);
		ATMWithrawl t4 = new ATMWithrawl(suyogacc);
		
		t2.start();
		t4.start();

		Thread.sleep(5000);
		t1.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();


		System.out.println("Final amount is :"+ suyogacc.balance);


	}
}
