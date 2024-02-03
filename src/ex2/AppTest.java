






package ex2;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

	
	
	
	@Test

	public  void exe2min(){

		String result = App.NumberToChar(60);

		String expected_result = "D";

		org.junit.Assert.assertEquals(expected_result , result);

	}

    @Test

    public void exe2min_plus_1(){

    	String result = App.NumberToChar(61);

    	String expected_result = "D";

    	org.junit.Assert.assertEquals(expected_result , result);

    }

    @Test

    public void exe2nominal(){

    	String result = App.NumberToChar(65);

    	String expected_result = "D";

    	org.junit.Assert.assertEquals(expected_result , result);

    }

    @Test

    public void exe2max_minus_1(){

    	String result = App.NumberToChar(68);

    	String expected_result = "D";

    	org.junit.Assert.assertEquals(expected_result , result);

    }

    @Test

    public void exe2max(){

    	String result = App.NumberToChar(69);

    	String expected_result = "D";

    	org.junit.Assert.assertEquals(expected_result , result);

    }
	
	
	
}
