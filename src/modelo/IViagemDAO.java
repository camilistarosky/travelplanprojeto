package modelo;

import java.util.ArrayList;

public interface IViagemDAO {

	public boolean inserir(Viagem v);

	public boolean inserirAtividade(Viagem v, String atividade);

	public boolean excluirAtividade(Viagem v, int indice);

	public boolean alterarAtividade(Viagem v, int indice, String novaAtividade);

	public ArrayList<String> listarAtividades();

}