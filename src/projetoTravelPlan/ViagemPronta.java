package projetoTravelPlan;

import java.util.ArrayList;
import java.util.List;

public class ViagemPronta {

	private String data;
	private String destinos;
	private List<String> atracoes;
	private double valorTotal;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDestinos() {
		return destinos;
	}

	public void setDestinos(String destinos) {
		this.destinos = destinos;
	}

	public List<String> getAtracoes() {
		return atracoes;
	}

	public void setAtracoes(List<String> atracoes) {
		this.atracoes = atracoes;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	List<ViagemPronta> viagenaNacionaisJaneiroAbril = new ArrayList<>();
	{ // rever se essas chaves estao certas ,acho que nao e se der erro é aqui
		List<String> atracoesViagemJaneiroAbril = new ArrayList<>();

		atracoesViagemJaneiroAbril.add("Praias paradisíacas");
		atracoesViagemJaneiroAbril.add("Trilhas na mata");
		atracoesViagemJaneiroAbril.add("Festas locais");

	} // rever se essas chaves estao certas ,acho que nao e ser der erro é aqui
}