import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPuntajeBowling {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestPrimerTiro() {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(5);
		int resulta = puntaje.mostrarPrimerTiro();
		
		int esperado = 5;
		
		assertEquals(esperado, resulta);
	}
	@Test
	public void TestSegundoTiro() {
		
	}

}
