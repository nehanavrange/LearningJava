package in.nit;

public class TestCallRun2 extends  Thread{

	//treating as normal obj without star method, not context switching
	
	public void run(){  
		  for(int i=0;i<5;i++){  
		    try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  TestCallRun2 t1=new TestCallRun2();  
		  TestCallRun2 t2=new TestCallRun2();  
		   
		  t1.run();  
		  t2.run();  
		 }  
}
