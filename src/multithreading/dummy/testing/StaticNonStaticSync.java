package multithreading.dummy.testing;

class MyThread3{
	String name;
	int no;

	synchronized static void display(String name,int no) {
		System.out.println(no);
		System.out.println(name);
	
		

	}

	 void show(int no) {

		System.out.println(no);
	}


}
public class StaticNonStaticSync {

	public static void main(String[] args) {
		MyThread3 mt=new MyThread3();
		Thread t1=new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {	
					MyThread3.display("neha",2*3);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {	
					mt.show(i*1);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};


		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
}
