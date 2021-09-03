package exceptionHandling;

import java.io.IOException;

public class ExceptionPropagationUsingChecked {
	// exception propagated to n()
	void m() throws IOException
	{
		System.out.println("device error");


		// checked exception occurred
		throw new IOException("device error");


	}

	// exception propagated to p()
	void n() throws IOException
	{
		m();
	}
	void p()
	{


		try {

			// exception handled 
			n(); 
		} 
		catch (Exception e) {
			System.out.println("exception handled"); }

	}

	public static void main(String args[])
	{
		ExceptionPropagationUsingChecked obj = new ExceptionPropagationUsingChecked();
		obj.p();
		System.out.println("normal flow...");
	}
}
