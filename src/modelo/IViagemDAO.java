package modelo;

import java.util.ArrayList;

public interface IViagemDAO {
	public boolean inserirViagem(Viagem viagem);

	public boolean excluirViagem(Viagem viagem);

	public boolean alterarViagem(Viagem viagem);

	public ArrayList<Viagem> listarViagens();

	public boolean inserirAtividade(Viagem viagem);

	public boolean excluirAtividade(Viagem viagem);

	public boolean alterarAtividade(Viagem v);

	public ArrayList<Viagem> listarAtividades();

}