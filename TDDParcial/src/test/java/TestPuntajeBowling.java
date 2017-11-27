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
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(5);
		puntaje.setSegundoTiro(5);
		int result= puntaje.mostrarSegundoTiro();
		int esperado = 5;
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void TestSumaDeTiros() {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(5);
		puntaje.setSegundoTiro(5);
		int resultado  = puntaje.sumar(puntaje.mostrarPrimerTiro(),puntaje.mostrarSegundoTiro());
		
		int esperado = 10;
		
		assertEquals(esperado, resultado);	
		
	}
	
	@Test 
	public void TestPrimerTiro10Segundo0() {
		Puntaje puntaje = new Puntaje();
		puntaje.setPrimerTiro(10);
		int esperado = 0;
		
		int obtenido = puntaje.mostrarSegundoTiro();
		
		assertEquals(esperado, obtenido);
	}

}
