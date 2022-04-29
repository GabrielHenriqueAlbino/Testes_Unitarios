package projetorobinson;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalcularTest {


	@Test
	public void testCalcularJuroCompostoCorreto() {
		Calcular calc = new Calcular();
		calc.Capital = 1000d;
		calc.Juros = 2d;
		calc.Meses = 5;
		calc.CalcularJuroComposto();
		assertEquals(1104.08d, calc.Resultado,0.01);		
	}
	
	@Test
	public void testCalcularJuroCompostoIncorreto() {
		Calcular calc = new Calcular();
		calc.Capital = 50d;
		calc.Juros = 2d;
		calc.Meses = 5;
		calc.CalcularJuroComposto();
		assertNotEquals(50d, calc.Resultado,0.0001);		
	}
	
	@Test
	public void testCalcularJuroSimples() {
		Calcular calc = new Calcular();
		calc.Capital = 50d;
		calc.Juros = 2d;
		calc.Meses = 5;
		calc.CalcularJuroSimples();
		assertNotEquals(50d, calc.Resultado,0.0001);		
	}


}
