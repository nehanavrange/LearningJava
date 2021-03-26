package multithreading.dummy.test;


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


public class StaticSynchronization {
	public static void main(String[] args) {
		DemoThread1 t1 = new DemoThread1();
		DemoThread2 t2 = new DemoThread2();

		t1.start();  
		t2.start();  

	}
}
