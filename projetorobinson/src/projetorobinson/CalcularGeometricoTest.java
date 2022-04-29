package projetorobinson;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalcularGeometricoTest {


	
	@Test
	public void testCalcularArea() {
		CalcularGeometrico calc = new CalcularGeometrico();
		calc.Base = 50d;
		calc.Altura = 2d;
		calc.CalcularArea();
		assertEquals(50d, calc.Area,0.0001);		
	}

}
