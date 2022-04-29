package projetorobinson;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalcularVelocidadeTest {


	
	@Test
	public void testCalcularVelocidade() {
		CalcularVelocidade calc = new CalcularVelocidade();
		calc.Distancia = 100d;
		calc.Tempo = 20d;
		calc.VelocidadeMedia();
		assertEquals(5d, calc.Velocidade);		
	}

}
