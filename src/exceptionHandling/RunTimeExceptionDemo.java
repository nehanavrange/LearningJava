package exceptionHandling;

class NullPointerException extends RuntimeException {
	NullPointerException(String str){
		super(str);
	}
	
	
}

public class RunTimeExceptionDemo {

	

	public static void main(String[] args) {
	
		String str = null;
		
		
				validateLength(str);
			
		
		
	}

	private static void validateLength(String str)   {
		
		
		if(str.length()==0) {
			throw new NullPointerException("string is null");
			
		}
		else {
			System.out.println(str.length());	
		}
		
	}

}
