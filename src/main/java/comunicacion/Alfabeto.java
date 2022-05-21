package comunicacion;

public class Alfabeto extends Pictograma {
	private String [] letras;
	private String interpretacion;
	
	// constructor
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	// metodos  de la  super clase abstracta
	
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String out = "";
		for(int i = 0; i < letras.length; i++) {
			if(i != (letras.length-1)) {
				out += letras[i] + ", ";
			}
		}
		return out;	
	}
	// metodo propio de  la clase
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	
	//Getters and  setters

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
