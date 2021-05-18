package markerInterface.demo;


class A implements Cloneable{
	int i;
	String s;

	public A(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}



public class Clonable_Interface_Demo {

	public static void main(String[] args) throws CloneNotSupportedException {

		A a=new A(1, "aa");

		//Cloning of obj a to b 
		A b= (A) a.clone();

		System.out.println(b.i+" "+b.s);
	}
}
