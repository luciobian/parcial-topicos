
public class Puntaje {

	private int primerTiro;
	private int segundoTiro;
	public void setPrimerTiro(int pt) throws Exception {
		if ((pt > 10) )
			throw new Exception("Tiene que ser menor o igual a 10");
		else if (pt < 0) {
			throw new Exception("Tiene que ser menor o igual a 10");
			}
		else
			this.primerTiro = pt;
	}

	public int mostrarPrimerTiro() {
		// TODO Auto-generated method stub
		return this.primerTiro;
	}

	public void setSegundoTiro(int i) throws Exception {
		// TODO Auto-generated method stub
		if (i > 10 )
			throw new Exception("Tiene que ser menor o igual a 10");
		else if (i < 0) {
			throw new Exception("Tiene que ser menor o igual a 10");
			}
		else
		this.segundoTiro = i;
	}

	public int mostrarSegundoTiro() {
		// TODO Auto-generated method stub
		return this.segundoTiro;
	}

	public int sumar(int mostrarPrimerTiro, int mostrarSegundoTiro) throws Exception {
		// TODO Auto-generated method stub
		int resultado = mostrarPrimerTiro + mostrarSegundoTiro;
		if (resultado > 19)
			throw new Exception("el max resultado es 19");
		else
		return resultado;
	}

	public int[] NuevoJuego(int primer, int segundo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
