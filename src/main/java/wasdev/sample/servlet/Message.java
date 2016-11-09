package wasdev.sample.servlet;

public class Message {
	
	public static  boolean finResult;


	public void fun1(){
		System.out.println("Hiiii");
	}
//Message(boolean result){
//	finResult = result;
//}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean finResult=false;
		JUnitTest jtest= new JUnitTest();
		finResult=jtest.testEvenOddNumber();
		System.out.println("Result-->"+finResult);
		if(finResult)
		{
			System.out.println("Success ");	
		}else{
			try {
				throw new Exception("fail");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
	
}
