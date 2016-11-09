package wasdev.sample.servlet;

public class Message {
	
	public static  boolean finResult;
	public static  boolean finResult1;
	public static String a = "Miracle";

	public void fun1(){
		System.out.println("Hiiii");
	}
//Message(boolean result){
//	finResult = result;
//}
	
public  boolean getFinalResult(){ //throws InvalidNumberException {
		// TODO Auto-generated method stub
		boolean finResult=false;
		JUnitTest jtest= new JUnitTest();
		finResult=jtest.testEvenOddNumber();
		a = "xyz" ;
		System.out.println("Result-->"+finResult);
		if(finResult)
		{
			System.out.println("Success ");	
		}else{
			
				//throw new InvalidNumberException("fail");		
		}
	System.out.println("result "+finResult);	
	return finResult;
	}
}

public String getMessage(){
	return "Chanakya!";
}
