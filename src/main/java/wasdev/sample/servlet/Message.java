package wasdev.sample.servlet;

public class Message {
	
	public boolean finResult;

Message(boolean result){
	finResult = result;
}
	public void fun1(){
		System.out.println("Hiiii");
	}

	
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean finResult=false;
		JUnitTest jtest= new JUnitTest();
		finResult=jtest.testEvenOddNumber();
		System.out.println("Result-->"+finResult);
		if(finResult)
			{
				System.out.println("Success ");	
			}else{
				throw new Exception("fail");
			}
		

	}
}
