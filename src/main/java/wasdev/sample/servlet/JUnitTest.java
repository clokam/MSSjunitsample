package wasdev.sample.servlet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
 
 
public class JUnitTest {
	int value;
 
    @Test
    public boolean testEvenOddNumber() throws Exception{
    	boolean result=false;
        Utility meo = new Utility();
        value=18;
        try{
        assertEquals("10 is a even number", true, meo.isEvenNumber(value));
       result= true;
		if(result=="true")
			{
				System.out.println("Success ");	
			}else{
				throw new Exception("fail");
			}
        
        }catch(Exception e){
        	System.out.println("Exception-->"+e);
        }
        return result;
    }
}
