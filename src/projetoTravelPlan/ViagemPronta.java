package projetoTravelPlan;

import java.util.ArrayList;
import java.util.List;

public class ViagemPronta {

	private Integer data;
	private Integer destinos;
	private List<String> infos;
	private double valorTotal;

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Integer getDestinos() {
		return destinos;
	}

	public void setDestinos(Integer destinos) {
		this.destinos = destinos;
	}

	public List<String> getInfos() {
		return infos;
	}

	public void setAtracoes(List<String> infos) {
		this.infos = infos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	// JANEIRO ATE ABRIL
	List<String> datasJaneiroAbril = new ArrayList<>();
	{
		datasJaneiroAbril.add("1 - 10 de Janeiro");
		datasJaneiroAbril.add("2 - 2 de Fevereiro");
		datasJaneiroAbril.add("3 - 25 de Fevereiro");
		datasJaneiroAbril.add("4 - 14 de Março");
		datasJaneiroAbril.add("5 - 19 de Abril");
	}

	List<String> destinosNacionaisJaneiroAbril = new ArrayList<>();
	{
		destinosNacionaisJaneiroAbril.add("1 - Rio de Janeiro");
		destinosNacionaisJaneiroAbril.add("2 - Salvador");
		destinosNacionaisJaneiroAbril.add("3 - Florianópolis");
		destinosNacionaisJaneiroAbril.add("4 - Fortaleza");
		destinosNacionaisJaneiroAbril.add("5 - Curitiba");
	}

	List<String> destinosInternacionaisJaneiroAbril = new ArrayList<>();
	{
		destinosInternacionaisJaneiroAbril.add("1 - Cancún, México");
		destinosInternacionaisJaneiroAbril.add("2 - Paris, França");
		destinosInternacionaisJaneiroAbril.add("3 - Nova Iorque, Estados Unidos");
		destinosInternacionaisJaneiroAbril.add("4 - Tóquio, Japão");
		destinosInternacionaisJaneiroAbril.add("5 - Barcelona, Espanha");
	}

	List<String> atracoesJaneiroAbril = new ArrayList<>();
	{
		atracoesJaneiroAbril.add("Praias paradisíacas");
		atracoesJaneiroAbril.add("Trilhas na mata");
		atracoesJaneiroAbril.add("Festas locais");
		atracoesJaneiroAbril.add("Feiras de Alimentos e Bebidas");
		atracoesJaneiroAbril.add("Piqueniques e Churrascos em Parques");
	}

	// MAIO ATE AGOSTO
	List<String> datasMaioAgosto = new ArrayList<>();
	{
		datasMaioAgosto.add("1 - 5 de Maio");
		datasMaioAgosto.add("2 - 11 de Junho");
		datasMaioAgosto.add("3 - 3 de Julho");
		datasMaioAgosto.add("4 - 20 de Julho");
		datasMaioAgosto.add("5 - 22 de Agosto");
	}

	List<String> destinosNacionaisMaioAgosto = new ArrayList<>();
	{
		destinosNacionaisMaioAgosto.add("1 - Gramado");
		destinosNacionaisMaioAgosto.add("2 - Recife");
		destinosNacionaisMaioAgosto.add("3 - Foz do Iguaçu");
		destinosNacionaisMaioAgosto.add("4 - Manaus");
		destinosNacionaisMaioAgosto.add("5 - Brasília");
	}

	List<String> destinosInternacionaisMaioAgosto = new ArrayList<>();
	{
		destinosInternacionaisMaioAgosto.add("1 - Bali, Indonésia");
		destinosInternacionaisMaioAgosto.add("2 - Roma, Itália");
		destinosInternacionaisMaioAgosto.add("3 - Vancouver, Canadá");
		destinosInternacionaisMaioAgosto.add("4 - Sydney, Austrália");
		destinosInternacionaisMaioAgosto.add("5 - Istambul, Turquia");
	}

	List<String> atracoesMaioAgosto = new ArrayList<>();
	{
		atracoesMaioAgosto.add("Festivais de Música ao Ar Livre");
		atracoesMaioAgosto.add("Passeios de Barco");
		atracoesMaioAgosto.add("Parques Temáticos");
		atracoesMaioAgosto.add("Museus de Arte");
		atracoesMaioAgosto.add("Observação de Baleias");
	}

	// SETEMBRO ATÉ DEZEMBRO
	List<String> datasSetembroDezembro = new ArrayList<>();
	{
		datasSetembroDezembro.add("1 - 5 de Maio");
		datasSetembroDezembro.add("2 - 11 de Junho");
		datasSetembroDezembro.add("3 - 3 de Julho");
		datasSetembroDezembro.add("4 - 20 de Julho");
		datasSetembroDezembro.add("5 - 22 de Agosto");
	}

	List<String> destinosNacionaisSetembroDezembro = new ArrayList<>();
	{
		destinosNacionaisSetembroDezembro.add("1 - Jericoacoara");
		destinosNacionaisSetembroDezembro.add("2 - Bonito");
		destinosNacionaisSetembroDezembro.add("3 - Fernando de Noronha");
		destinosNacionaisSetembroDezembro.add("4 - Belo Horizonte");
		destinosNacionaisSetembroDezembro.add("5 - Campos do Jordão");
	}

	List<String> destinosInternacionaisSetembroDezembro = new ArrayList<>();
	{
		destinosInternacionaisSetembroDezembro.add("1 - Atenas, Grécia");
		destinosInternacionaisSetembroDezembro.add("2 - Cairo, Egito");
		destinosInternacionaisSetembroDezembro.add("3 - Amsterdã, Holanda");
		destinosInternacionaisSetembroDezembro.add("4 - Dubai, Emirados Árabes Unidos");
		destinosInternacionaisSetembroDezembro.add("Toronto, Canadá");
	}

	List<String> atracoesSetembroDezembro = new ArrayList<>();
	{
		atracoesSetembroDezembro.add("Foliões de Outono");
		atracoesSetembroDezembro.add("Festivais de Vinho e Cerveja");
		atracoesSetembroDezembro.add("Visitas a Vinícolas");
		atracoesSetembroDezembro.add("Mercados de Natal");
		atracoesSetembroDezembro.add("Pistas de Patinação no Gelo ao Ar Livre");
	}
}