package dummy.test;

public class TestSleepMethod1 extends Thread
{
	public void run(){  
		for(int i=1;i<5;i++){  
			try{Thread.sleep(500);}
			catch(InterruptedException e)
			{System.out.println(e);}  
			 System.out.println(Thread.currentThread().getName()); 
		System.out.println(i);  
	//	System.out.println(Thread.currentThread().getName());
	}  
}

public static void main(String args[]){  
	TestSleepMethod1 t1=new TestSleepMethod1();  
	TestSleepMethod1 t2=new TestSleepMethod1();  
	
	t1.start();  
	
	t2.start();  
}  
}
