package controle;

import java.util.ArrayList;

import modelo.IViagemDAO;
import modelo.Viagem;

public class ViagemDAO implements IViagemDAO {

	private static ArrayList<Viagem> tabelaViagems = new ArrayList<>();
	private static ArrayList<String> tabelaAtividades = new ArrayList<>();
	private static ViagemDAO instancia;

	private ViagemDAO() {
	}

	public static ViagemDAO getInstancia() {

		if (instancia == null) {
			instancia = new ViagemDAO();
			tabelaViagems = new ArrayList<>();
		}

		return instancia;
	}

	public static ViagemDAO getInstanciaA() {
		// Verifica se a instância ainda não foi criada
		if (instancia == null) {
			instancia = new ViagemDAO(); // Se não existir, cria uma nova instância da classe ViagemDAO
			tabelaAtividades = new ArrayList<>(); // Inicializa a lista tabelaAtividades como uma nova instância de
													// ArrayList
		}

		return instancia; // Retorna a instância (seja recém-criada ou já existente)
	}

	@Override
	public boolean inserir(Viagem v) {
		return tabelaViagems.add(v);
	}

	@Override
	public boolean inserirAtividade(Viagem v, String novaAtividade) {
		tabelaAtividades.add(novaAtividade);
		return true;
	}

	@Override
	public boolean excluirAtividade(Viagem v, int indice) {
		// Verifica se o índice está dentro dos limites da lista de atividades
		if (indice >= 0 && indice < tabelaAtividades.size()) {
			tabelaAtividades.remove(indice); // Remove a atividade na posição indicada pelo índice
			System.out.println("Atividade EXCLUIDA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
		return false; // Retorna false, indicando que a operação falhou
	}

	@Override
	public boolean alterarAtividade(Viagem v, int indice, String novaAtividade) {
		// Verifica se o índice está dentro dos limites da lista de atividades
		if (indice >= 0 && indice < tabelaAtividades.size()) {
			tabelaAtividades.set(indice, novaAtividade); // Altera a atividade na posição indicada pelo índice para a
															// nova atividade fornecida
			System.out.println("Atividade ALTERADA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
		return true;
	}

	public ArrayList<String> listarAtividades() {
		return tabelaAtividades;
	}
}
