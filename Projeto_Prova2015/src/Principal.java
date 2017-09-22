import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		BDSimulado bd = new BDSimulado();

		System.out.println(" - " + bd.getInfoONG("fomeZero"));
		System.out.println("\n - A Quantidade de ONGS para Pernambuco: " + bd.getNumONGPorEstado("Pernambuco"));

		System.out.println("\n - Postos com Armazenamento superior a 5000 kg: \n" + bd.getPostosPorCapacidade(500000));
		System.out.println("\n - Lista de Postos Vegetarianos: " + bd.getPostosVegetarianos());

		ArrayList<Posto> postosPorCapacidade = bd.getPostosPorCapacidade(500000);
		for (int i = 0; i < postosPorCapacidade.size(); i++) {
			System.out.println(postosPorCapacidade.get(i).getCodigo());

		}
	}

}
