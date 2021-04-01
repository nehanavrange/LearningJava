package multithreading.dummy.test;

class MThread extends Thread{

	int num=0;
	@Override
	public void run() {
		num++;
		System.out.println(currentThread().getName()+":"+num);
	}
}
class MyRunnable implements Runnable{

	int num=0;
	@Override
	public void run() {
		num++;
		System.out.println("Thread is running in Runnable: "+
		Thread.currentThread().getName()+":"+num);

	}

}

public class RunnableVsThreads {
	public static void main(String[] args) {

		MThread mt = new MThread();    //creating new object  
		MThread mt1 = new MThread();  //creating new object
		mt.start();    
		mt1.start();
		Runnable r=new MyRunnable();
		Thread t=new Thread(r); //Both thread sharing same obj
		Thread t1=new Thread(r);
		t.start();
		t1.start();

	}

}
