
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

	public int sumar(int mostrarPrimerTiro, int mostrarSegundoTiro) {
		// TODO Auto-generated method stub
		return mostrarPrimerTiro + mostrarSegundoTiro;
	}
	
	

}
