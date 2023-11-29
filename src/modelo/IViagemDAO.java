package modelo;

import java.util.ArrayList;

//Interface que define operações de acesso a dados para a entidade Viagem
public interface IViagemDAO {
	// Método para inserir uma viagem na fonte de dados
	public boolean inserir(Viagem v);
	
	// Método para inserir uma atividade associada a uma viagem na fonte de dados
	public boolean inserirAtividade(Viagem v, String atividade);
	
	// Método para excluir uma atividade de uma viagem na fonte de dados com base no índice
	public boolean excluirAtividade(Viagem v, int indice);
	
	// Método para alterar uma atividade de uma viagem na fonte de dados com base no índice
	public boolean alterarAtividade(Viagem v, int indice, String novaAtividade);
	
	// Método para listar todas as atividades associadas a uma viagem na fonte de dados
	public ArrayList<String> listarAtividades();

}