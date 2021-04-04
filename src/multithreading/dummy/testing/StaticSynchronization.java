package multithreading.dummy.testing;


class Chair{  

	synchronized static void printTable(int n){  
		for(int i=1;i<=10;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){}  
		}  
	}  
}

class DemoThread2 extends Thread{  
	public void run(){  
		Chair.printTable(10);  
	}  
} 

class DemoThread1 extends Thread{  
	public void run(){  
		Chair.printTable(1);  
	}  
} 

class DemoThread3 extends Thread{  
	public void run(){  
		Chair.printTable(100);  
	}  
} 
class DemoThread4 extends Thread{  
	public void run(){  
		Chair.printTable(1000);  
	}  
} 


public class StaticSynchronization {
	public static void main(String[] args) {
		DemoThread1 t1 = new DemoThread1();
		DemoThread2 t2 = new DemoThread2();

		DemoThread3 t3 = new DemoThread3();
		DemoThread4 t4 = new DemoThread4();

		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  

	}
}
