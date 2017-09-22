public class ONG {

	private String nome;
	private String responsavel;
	private String estado;

	// ToString
	@Override
	public String toString() {
		return "ONG [nome=" + nome + ", responsavel=" + responsavel + ", estado=" + estado + "]\n";
	}

	// Metodo construtor
	public ONG(String nome, String responsavel, String estado) {
		super();
		this.nome = nome;
		this.responsavel = responsavel;
		this.estado = estado;
	}

	// Metodos GET e SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
