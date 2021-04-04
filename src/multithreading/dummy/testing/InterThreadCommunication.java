package multithreading.dummy.testing;

class Customer{  
	int amount=10000;  

	synchronized void withdraw(int amount){  
		System.out.println("going to withdraw...");  

		if(this.amount<amount){  
			System.out.println("Less balance; waiting for deposit...");  
			try{wait();}catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw amt:"+amount);
		System.out.println("withdraw completed..."); 
		System.out.println("total balance:"+this.amount);
	}  

	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposite amt:"+amount);
		System.out.println("deposit completed... ");  
		//notify
		//OR
		notifyAll(); 
		System.out.println("total balance:"+this.amount);
	}  
}  

class InterThreadCommunication{  
	public static void main(String args[]){  
		final Customer c=new Customer();  
		new Thread(){  
			public void run(){c.withdraw(15000);}  
		}.start(); 
		new Thread(){  
			public void run(){c.withdraw(11000);}  
		}.start();  

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new Thread(){  
			public void run(){c.deposit(10000);}  
		}.start(); 


		new Thread(){  
			public void run(){c.deposit(22000);}  
		}.start();  

	}}