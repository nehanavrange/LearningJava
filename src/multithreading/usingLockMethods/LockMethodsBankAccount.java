package multithreading.usingLockMethods;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//Expection in this project
class Account
{
	int balance;
	Lock lock= new ReentrantLock();
	public Account(int balance) {
		this.balance=balance;
	}

	public  void  deposit(int amount)
	{
		lock.lock();
		System.out.println("going to deposit..."); 
		int temp=balance;
		balance=temp+amount;
		if(balance>0) {
		   notifyAll();
			System.out.println("Wake up from blocking/waiting state");

		}
		//lock.unlock();
		System.out.println("deposite amt:"+amount);
		System.out.println("deposit completed... ");  

		System.out.println("total balance:"+balance);
		lock.unlock();
	}

	public void withdraw(int amount) 
	{
		lock.lock();
		System.out.println("going to withdraw...");
		int temp=this.balance;
		if(temp<amount) {
			System.out.println("Balance is insufficient, Please wait while balance get deposited");
			try {
				wait();
			} catch (InterruptedException e) {

				System.out.println("Exception");
			}
		}
		balance=temp-amount;  
		
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

public class LockMethodsBankAccount {
	public static void main(String[] args) throws InterruptedException {
		Account suyogacc = new Account(0);
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
