package exceptionHandling;

class InValidAgeException extends Exception {


	public InValidAgeException(String str) { 
		super(str); 
	}


}

public class CustomException{
	public static void main(String[] args) {
		try {
			validateAge(13);
		} catch (InValidAgeException e) {

			System.out.println("Exception is caught");
			System.out.println("Ex:"+e);
			//e.printStackTrace();
		}
	}

	private static void validateAge(int age) throws InValidAgeException {
		if(age<=18) {
			throw new InValidAgeException("age is not valid to vote");
		}
		else {
			System.out.println("age is valid to vote");
		}

	}
}










