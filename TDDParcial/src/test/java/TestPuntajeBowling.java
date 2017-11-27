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
	
	@Test (expected = Exception.class)
	public void TestSegundoTiroMenor0() throws Exception {
		Puntaje puntaje = new Puntaje();
		puntaje.setSegundoTiro(-10);
	}
	@Test (expected = Exception.class)
	public void TestSumaMenor19() throws Exception {
		Puntaje puntaje = new Puntaje();
		puntaje.sumar(10, 10);
	}
	
	@Test
	public void TestFrame() throws Exception {
		Puntaje puntaje = new Puntaje ();
		puntaje.setPrimerTiro(5);
		puntaje.setSegundoTiro(6);
		int primer = puntaje.mostrarPrimerTiro();
		int segundo = puntaje.mostrarSegundoTiro();
		int resultado[] = puntaje.NuevoFrame(primer, segundo); 
		int esperado[] = {5,6};
		
		assertArrayEquals(esperado, resultado); 
	}
	
	@Test
	public void TestNuevoJuego() {
		Puntaje puntaje = new Puntaje();
		int frameNuevo[] = puntaje.NuevoFrame(5, 5);
		
		puntaje.setNuevoJuego(frameNuevo);
		
		int result[] = puntaje.mostrarFrame();
		int frame[]  = {5,5};
		int esperad[] = frame;
		
		assertArrayEquals(esperad, result);
		
	}
	
	@Test
	public void TestPleno() throws Exception {
		Puntaje puntaje = new Puntaje();
		 puntaje.setPrimerTiro(10);
		 int primerTiro =puntaje.mostrarPrimerTiro();
		int segundoTiro = puntaje.mostrarSegundoTiro();
		int result[] = puntaje.nuevoPleno(primerTiro,segundoTiro);
		int esperado[] = {10,0};
		
		assertArrayEquals(esperado, result);
	}

}
