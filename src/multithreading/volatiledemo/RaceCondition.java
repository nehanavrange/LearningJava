package multithreading.volatiledemo;

// not giving proper output without synchronization
class Operation extends Thread
{
	//Thread t;
	volatile static int number=1;
	//static int number=1;

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread " +this.getName()+" Number:"+number++);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}



public class RaceCondition {
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
