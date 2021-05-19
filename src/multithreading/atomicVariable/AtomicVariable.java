package multithreading.atomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

class Operation extends Thread
{

	AtomicInteger  c= new AtomicInteger(1);

	//no need to make synchronized methods because read and write operations are done automatically by Atomic methods(like getAndIncrement,etc)
	//so JVM ensure that another thread knows the updated value
	public  void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread " +this.getName()+" Number:"+c.getAndIncrement());
			try {
				sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
public class AtomicVariable {
	public static void main(String[] args) throws InterruptedException {

		Operation op1 = new Operation();
		Operation op2 = new Operation();

		op1.start();
		op2.start();


		op1.join();
		op2.join();

		System.out.println("Program completed");


	}
}
