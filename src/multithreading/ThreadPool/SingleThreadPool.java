package multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class WorkerThread1 implements Runnable{

	String message;

	public WorkerThread1(String message) {

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
public class SingleThreadPool {

	public static void main(String[] args) {
		ExecutorService executor =Executors.newSingleThreadExecutor(); //creating a pool of single threads

		for (int i = 0; i < 5; i++) {
			Runnable r= new WorkerThread(""+i);
			executor.execute(r);;
		}

		executor.shutdown();  

	}
}
