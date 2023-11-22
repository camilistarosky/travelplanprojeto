package modelo;

import java.util.ArrayList;

public interface IViagemDAO {

	public boolean inserir(Viagem viagem);

	public boolean excluir(int id);

	public boolean alterar(Viagem viagem, int id);

	public ArrayList<Viagem> listar();

	public boolean inserirAtividade(Viagem v, String atividade);

	public boolean excluirAtividade(Viagem v, int i);

	public boolean alterarAtividade(Viagem v, String atividade, int i);

}