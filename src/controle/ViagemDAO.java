package controle;

import java.util.ArrayList;

import modelo.IViagemDAO;
import modelo.Viagem;

public class ViagemDAO implements IViagemDAO{
	
	private static ArrayList<Viagem> viagens;

	// inserir viagem
	@Override
	public boolean inserirViagem(Viagem viagem) {
		return viagens.add(viagem);
	}

	// excluir viagem
	@Override
	public boolean excluirViagem(Viagem viagem) {
		if (i >= 0 && i < viagens.size()) {
			viagens.remove(i);
			System.out.println("Atividade EXCLUIDA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
		return false;
	}

	// alterar viagem
	@Override
	public boolean alterarViagem(Viagem viagem) {
		if (i >= 0 && i < viagens.size()) {
			viagens.set(i, novaAtividade);
			System.out.println("Atividade ALTERADA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
		return false;
	}

	// listar viagens
	@Override
	public ArrayList<Viagem> listarViagens() {
		for (Viagem viagem : viagens) {
			System.out.println(viagens);
		}
		return null;
	}
	
	// adicionar atividade
	public static void inserirAtividade(String atividade, ArrayList<String> atividades) {
		atividades.add(atividade);
		System.out.println("Atividade ADICIONADA com sucesso!");
	}

	// alterar atividade
	public static void alterarAtividade(int indice, String novaAtividade, ArrayList<String> atividades) {
		if (indice >= 0 && indice < atividades.size()) {
			atividades.set(indice, novaAtividade);
			System.out.println("Atividade ALTERADA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
	}

	// excluir atividade
	public static void excluirAtividade(int indice, ArrayList<String> atividades) {
		if (indice >= 0 && indice < atividades.size()) {
			atividades.remove(indice);
			System.out.println("Atividade EXCLUIDA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
	}

	// listar atividades
	public ArrayList<Viagem> listarAtividades() {
		for (Viagem viagem : viagens) {
			
		}
		return null;
	}

	@Override
	public boolean inserirAtividade(Viagem viagem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirAtividade(Viagem viagem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarAtividade(Viagem v) {
		// TODO Auto-generated method stub
		return false;
	}

}
