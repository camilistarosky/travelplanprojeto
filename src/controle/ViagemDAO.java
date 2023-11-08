package controle;

import java.util.ArrayList;

import modelo.IViagemDAO;
import modelo.Viagem;

public class ViagemDAO implements IViagemDAO {

	private static ArrayList<Viagem> tabelaViagems;
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

	@Override
	public boolean inserir(Viagem p) {
		if (p != null) {
			tabelaViagems.add(p);
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
	public boolean inserirAtividade(Viagem v, String atividade) {
		for (Viagem viagem : tabelaViagems) {
			if (viagem.getI() == v.getI()) {
				ArrayList<String> atvs = viagem.getAtividades();
				atvs.add(atividade);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluirAtividade(Viagem v, int i) {
		for (Viagem viagem : tabelaViagems) {
			if (viagem.getI() == v.getI()) {
				ArrayList<String> atvs = viagem.getAtividades();
				// finalizar
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean alterar(Viagem v, String atividade, int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
