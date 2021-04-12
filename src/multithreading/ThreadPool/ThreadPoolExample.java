package multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

	String message;

	public WorkerThread(String message) {

		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start) message:"+message);
		try {  
			Thread.sleep(2000);  
		}
		catch (InterruptedException e) 
		{ e.printStackTrace(); 
		}
		System.out.println(Thread.currentThread().getName()+" (End)");
	}

}
public class ThreadPoolExample {
	public static void main(String[] args) {

		ExecutorService executor =Executors.newFixedThreadPool(5); //creating a pool of 5 threads

		for (int i = 0; i < 10; i++) {
			Runnable r= new WorkerThread(""+i);
			executor.execute(r);
		}
		
		executor.shutdown();  
		  
	}
}
