package wasdev.sample.servlet;

public class Message {
	
	public static  boolean finResult;
	public static  boolean finResult1;
	public static String a = "Miracle";

	public void fun1(){
		System.out.println("Hiiii");
	}
Message(boolean result){
	finResult = result;
}
	
public static void main(String[] args)throws InvalidNumberException {
		// TODO Auto-generated method stub
		boolean finResult=false;
		JUnitTest jtest= new JUnitTest();
		finResult=jtest.testEvenOddNumber();
		a = "xyz" ;
		System.out.println("Result-->"+finResult+a);
		if(finResult)
		{
			System.out.println("Success ");	
		}else{
			
				throw new InvalidNumberException("fail");		
		}
	}
}
