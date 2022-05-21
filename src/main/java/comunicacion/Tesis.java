package comunicacion;


public class Tesis extends Escrito{
	protected String idea;
	protected String[] argumentos;
	String conclusion;
	String referencias;
	String interpretacion;
	
	// constructor
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

		// metodos de la  clase padre
		
		public int palabrasTotales(int palabrasPagina) {
				return 5*getPaginas();
		}
		public String interpretacion() {
				return  interpretacion;
		}
		public String toString() {
				return getOrigen() + "\n" +
						getTitulo() + "\n" +
						getAutor() + "\n" +
						getPaginas() + "\n" +
						getIdea() + "\n"+
						cantidadArgumentos() + "\n" +
						getConclusion() + "\n"+
						getReferencias();
			
		}
		
		// getters  and setters

		public String getIdea() {
			return idea;
		}

		public void setIdea(String idea) {
			this.idea = idea;
		}

		public String[] getArgumentos() {
			return this.argumentos;
		}
		public int cantidadArgumentos() {
			return this.argumentos.length;
		}
		public void setArgumentos(String[] argumentos) {
			this.argumentos = argumentos;
		}

		public String getConclusion() {
			return conclusion;
		}

		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}

		public String getReferencias() {
			return referencias;
		}

		public void setReferencias(String referencias) {
			this.referencias = referencias;
		}

		public String getInterpretacion() {
			return interpretacion;
		}

		public void setInterpretacion(String interpretacion) {
			this.interpretacion = interpretacion;
		}

		
}
