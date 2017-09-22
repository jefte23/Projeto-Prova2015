import java.util.ArrayList;

public class BDSimulado {

	// Atributos
	private ArrayList<ONG> ongs;
	private ArrayList<Posto> postos;

	// Metodo construtor
	public BDSimulado() {
		// Cria lista de ONGs
		this.ongs = new ArrayList<ONG>();

		// Preencher a lista de ONGs
		ONG ongs1 = new ONG("fomeZero", "Claudio", "Pernambuco");
		ONG ongs2 = new ONG("ComerDeNovo", "Mauro", "São Paulo");
		ONG ongs3 = new ONG("MataFome", "Rodrigo", "Pernambuco");
		ONG ongs4 = new ONG("Refeicao", "Carlos", "Ceara");
		ONG ongs5 = new ONG("SemFome", "Leandro", "Parana");
		ONG ongs6 = new ONG("QueroComer", "Pedro", "Minas Gerais");

		// colocando ONGs na Lista
		this.ongs.add(ongs1);
		this.ongs.add(ongs2);
		this.ongs.add(ongs3);
		this.ongs.add(ongs4);
		this.ongs.add(ongs5);
		this.ongs.add(ongs6);

		// cria lista de postos
		this.postos = new ArrayList<Posto>();

		// Preencher a lista de postos
		Posto p1 = new Posto(112, 2312312, true, false, true);
		Posto p2 = new Posto(111, 50000, false, false, false);
		Posto p3 = new Posto(112, 3221, true, true, false);
		Posto p4 = new Posto(113, 83921, true, true, false);
		Posto p5 = new Posto(114, 33221, false, true, false);
		Posto p6 = new Posto(111, 22122, true, true, true);
		Posto p7 = new Posto(111, 553312, false, false, false);
		Posto p8 = new Posto(111, 221231, false, false, false);
		Posto p9 = new Posto(111, 882912, true, false, false);
		Posto p10 = new Posto(111, 21231, true, true, false);

		// colocaando postos na lista
		this.postos.add(p1);
		this.postos.add(p2);
		this.postos.add(p3);
		this.postos.add(p4);
		this.postos.add(p5);
		this.postos.add(p6);
		this.postos.add(p7);
		this.postos.add(p8);
		this.postos.add(p9);
		this.postos.add(p10);

	}

	// Metodos Get e Sets
	public ArrayList<ONG> getOngs() {
		return ongs;
	}

	public void setOngs(ArrayList<ONG> ongs) {
		this.ongs = ongs;
	}

	public ArrayList<Posto> getPostos() {
		return postos;
	}

	public void setPostos(ArrayList<Posto> postos) {
		this.postos = postos;
	}
	// -------------------------------------------------

	// Método que retorne inf das ONG fornecido o seu nome
	public String getInfoONG(String nomeONG) {

		String resultado = "";
		// percorrer Arraylist de ONG buscando pelo nome
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome().equals(nomeONG)) {
				resultado = this.ongs.get(i).toString();
				// ou
				// resultado = "Nome: " + this.ongs.get(i).getNome() + "\n
				// Responsavel: "
				// + this.ongs.get(i).getResponsavel() + "\nEstado: " +
				// this.ongs.get(i).getEstado();
			}
		}
		return resultado;
	}
	// -------------------------------------------------

	// Método que retorna o número de ONG's em determinado estado.

	public int getNumONGPorEstado(String estado) {

		int resultado = 0;
		// percorre Arraylist de ONG buscando pelo nome
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getEstado().equals(estado)) {
				resultado++;
			}

		}
		return resultado;
	}
	// -------------------------------------------------

	// retorne postos que possuem uma capacidade de armazenamentomaior que x.
	public ArrayList<Posto> getPostosPorCapacidade(int x) {

		ArrayList<Posto> resultado = new ArrayList<Posto>();
		// Percorre ArrayList de Posto - Buscando Capacidade
		for (int i = 0; i < this.postos.size(); i++) {
			if (this.postos.get(i).getCapacidade() >= x) {
				resultado.add(this.postos.get(i));
			}
		}
		return resultado;
	}
	// -------------------------------------------------

	// Retorna o código dos postos que atendem vegetarianos
	public ArrayList<Integer> getPostosVegetarianos() {

		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 0; i < this.postos.size(); i++) {
			if (this.postos.get(i).isVegetariano()) {
				resultado.add(this.postos.get(i).getCodigo());
			}
		}
		return resultado;
	}

}
