package wasdev.sample.servlet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
 
 
public class JUnitTest {
	int value;
 
    @Test
    public boolean testEvenOddNumber() {
    	boolean result=false;
        Utility meo = new Utility();
        value=17;
        try{
        assertEquals("10 is a even number", true, meo.isEvenNumber(value));
       result= true;
		
        
        }catch(Exception e){
        	System.out.println("Exception-->"+e);
        }
        return result;
    }
}
