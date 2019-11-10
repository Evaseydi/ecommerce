package testJUnit;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.icommerce.services.impl.Calcul;

public class TestCalcul{
	
	
	@Test
	public void testCalcul() {
		Calcul c =new Calcul();
		
		double result1 = c.add(12, 15); 
		
		double result2 = c.mult(6, 8);
		
		double verif1 = 6 * 8;
		
		double verif = 12 + 11;
		assertTrue("Result  ", result2 == verif1);
		
		//assertTrue("Result  ", result1 == verif);
		
	}

}
