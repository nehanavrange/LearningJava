package multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	public void run() {

		try {
			Long duration = (long) (Math.random() * 5);
			System.out.println("Running Task! Thread Name: " +
					Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Task Completed! Thread Name: " +
					Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class CachedThreadPool {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		// Cast the object to its class type
		ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

		System.out.println("Core threads: " + pool.getCorePoolSize());
		
		//States before tasks execution
		System.out.println("Largest executions: "
				+ pool.getLargestPoolSize());
		System.out.println("Maximum allowed threads: "
				+ pool.getMaximumPoolSize());
		System.out.println("Current threads in pool: "
				+ pool.getPoolSize());
		System.out.println("Currently executing threads: "
				+ pool.getActiveCount());
		System.out.println("Total number of threads(ever scheduled): "
				+ pool.getTaskCount());

		executor.submit(new Task());
		executor.submit(new Task());

		//States after tasks execution
		System.out.println("Core threads: " + pool.getCorePoolSize());
		System.out.println("Largest executions: "
				+ pool.getLargestPoolSize());
		System.out.println("Maximum allowed threads: "
				+ pool.getMaximumPoolSize());
		System.out.println("Current threads in pool: "
				+ pool.getPoolSize());
		System.out.println("Currently executing threads: "
				+ pool.getActiveCount());
		System.out.println("Total number of threads(ever scheduled): "
				+ pool.getTaskCount());

		executor.shutdown();
	}  
}

