package multithreading.dummy.test;

class MyThread extends Thread{
	public void run() {
		System.out.println("run start");
		System.out.println(getName()+" is paused");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			System.out.println("IE is raised");
		}
		System.out.println(getName()+" is resumed");
		System.out.println("run end");
	}
}
public class InteruptTest extends Thread{
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread mt= new MyThread();
		//mt.interrupt();
		mt.start();
		mt.interrupt(); //interrupting mt thread abnormally
			
		System.out.println("main end");

	}



}
