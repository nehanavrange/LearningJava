package multithreading.synchronizationblockanonymousinnerclass;


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



public class RaceConditionSolutionUsingSyncAnony {
	public static void main(String[] args) throws InterruptedException {

		Account suyogacc = new Account(1000);

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					suyogacc.deposit(200);

				}
			}

		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					suyogacc.withdraw(200);

				}
			}

		};


		t1.start();
		t2.start();


		t1.join();
		t2.join();

		System.out.println("Final amount is -"+ suyogacc.balance);


	}
}
