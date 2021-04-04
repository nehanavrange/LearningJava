
package multithreading.dummy.testing;

class MyThread1 extends Thread{

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
public class Testjoin
{
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread1 mt= new MyThread1();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
