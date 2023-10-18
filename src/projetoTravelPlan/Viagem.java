package projetoTravelPlan;

import java.util.List;
public class Viagem {

	private String dataViagem;
	private String origem;
	private String destino;
	private String acomodacao;
	private Float valorAcomodacao;
	private List<String> atividades;
	private String opcoesPag;
	private boolean viagemConfirmada;
	private boolean Internacional;


	

	
	public void setInternacional(boolean internacional) {
		Internacional = internacional;
	}


	public void setViagemConfirmada(boolean viagemConfirmada) {
		this.viagemConfirmada = viagemConfirmada;
	}

	public String getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(String dataViagem) {
		this.dataViagem = dataViagem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(String acomodacao) {
		this.acomodacao = acomodacao;
	}

	public double getValorAcomodacao() {
		return valorAcomodacao;
	}

	public void setValorAcomodacao(double valorAcomodacao) {
		this.valorAcomodacao = valorAcomodacao;
	}

	public List<String> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<String> atividades) {
		this.atividades = atividades;
	}

	public String getOpcoesPag() {
		return opcoesPag;
	}

	public void setOpcoesPag(String opcoesPag) {
		this.opcoesPag = opcoesPag;
	}

	public boolean isViagemConfirmada() {
		return viagemConfirmada;
	}

}