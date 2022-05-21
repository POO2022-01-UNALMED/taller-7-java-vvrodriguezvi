package comunicacion;

public class Periodico extends Escrito {
	String  fecha;
	String  primicia;
	String interpretacion;
	
	// constructor 
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	// metodos de la  clase padre
	
		public int palabrasTotales(int palabrasPagina) {
				return 10*getPaginas();
		}

		public String interpretacion() {
				return interpretacion;
		}
		public String toString() {
				return getOrigen() + "\n" +
						getTitulo() + "\n" +
						getAutor() + "\n" +
						getPaginas() + "\n" +
						getFecha() + "\n" +
						getPrimicia();
			
		}

		// getters  and  setters
		
		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public String getPrimicia() {
			return primicia;
		}

		public void setPrimicia(String primicia) {
			this.primicia = primicia;
		}

		public String getInterpretacion() {
			return interpretacion;
		}

		public void setInterpretacion(String interpretacion) {
			this.interpretacion = interpretacion;
		}

}
