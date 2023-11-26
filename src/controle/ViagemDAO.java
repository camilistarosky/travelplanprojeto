package controle;

import java.util.ArrayList;

import modelo.IViagemDAO;
import modelo.Viagem;

public class ViagemDAO implements IViagemDAO {

	private static ArrayList<Viagem> tabelaViagems;
	private static ArrayList<String> tabelaAtividades;
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

		if (instancia == null) {
			instancia = new ViagemDAO();
			tabelaAtividades = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Viagem v) {
		if (v != null) {
			tabelaViagems.add(v);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Viagem v, int id) {
		for (Viagem Viagem : tabelaViagems) {

			if (Viagem.getI() == id) {
				// falta colocar o resto dos sets
				Viagem.setOrigem(v.getOrigem());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(int id) {
		for (Viagem Viagem : tabelaViagems) {
			if (Viagem.getI() == id) {
				tabelaViagems.remove(Viagem);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Viagem> listar() {
		return tabelaViagems;
	}

	@Override
	public boolean inserirAtividade(Viagem v, String novaAtividade) {
		for (Viagem viagem : tabelaViagems) {
			if (viagem.getI() == v.getI()) {
				tabelaAtividades.add(novaAtividade);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluirAtividade(Viagem v, int indice) {
		for (Viagem viagem : tabelaViagems) {
			if (viagem.getI() == v.getI()) {
				if (indice >= 0 && indice < tabelaAtividades.size()) {
					tabelaAtividades.remove(indice);
					System.out.println("Atividade EXCLUIDA com sucesso!");
				} else {
					System.out.println("opção invalida");
				}
			}
		}
		return false;
	}

	@Override
	public boolean alterarAtividade(Viagem v, int indice, String novaAtividade) {
		for (Viagem viagem : tabelaViagems) {
			if (viagem.getI() == v.getI()) {
				if (indice >= 0 && indice < tabelaAtividades.size()) {
					tabelaAtividades.set(indice, novaAtividade);
					System.out.println("Atividade ALTERADA com sucesso!");
				} else {
					System.out.println("opção invalida");
				}

			}
		}
		return false;
	}
	
	public ArrayList<String> listarAtividades() {
		return tabelaAtividades;
	}
}
