package multithreading.dummy.test;

public class TestCallRun extends Thread {
	public void run(){  
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			 System.out.println("running..."); 
		}
		   
		 }  
		 public static void main(String args[]){  
			 TestCallRun t1=new TestCallRun();  
		  t1.run();//fine, but does not start a separate call stack  

		  t1.run();
		 }  
}
