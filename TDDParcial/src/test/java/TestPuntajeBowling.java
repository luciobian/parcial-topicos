import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPuntajeBowling {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestPrimerTiro() throws Exception {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(5);
		int resulta = puntaje.mostrarPrimerTiro();
		
		int esperado = 5;
		
		assertEquals(esperado, resulta);
	}
	@Test
	public void TestSegundoTiro() throws Exception {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(5);
		puntaje.setSegundoTiro(5);
		int result= puntaje.mostrarSegundoTiro();
		int esperado = 5;
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void TestSumaDeTiros() throws Exception {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(5);
		puntaje.setSegundoTiro(5);
		int resultado  = puntaje.sumar(puntaje.mostrarPrimerTiro(),puntaje.mostrarSegundoTiro());
		
		int esperado = 10;
		
		assertEquals(esperado, resultado);	
		
	}
	
	@Test 
	public void TestPrimerTiro10Segundo0() throws Exception {
		Puntaje puntaje = new Puntaje();
		puntaje.setPrimerTiro(10);
		int esperado = 0;
		
		int obtenido = puntaje.mostrarSegundoTiro();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test(expected = Exception.class)
	public void TestPrimerTiroMayor10() throws Exception {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setPrimerTiro(11);
	}
	
	@Test(expected = Exception.class)
	public void TestSegundoTiroMayor10() throws Exception  {
		Puntaje puntaje = new Puntaje();
		
		puntaje.setSegundoTiro(11);
	}
	
	@Test (expected = Exception.class)
	public void TestPrimerTiroMenor0() throws Exception {
		Puntaje puntaje = new Puntaje();
		puntaje.setPrimerTiro(-10);
	}
	

}
