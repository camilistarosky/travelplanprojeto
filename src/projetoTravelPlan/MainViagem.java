package projetoTravelPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainViagem {

	private static ArrayList<Viagem> viagens = new ArrayList<>();

	public static void main(String[] args) {
		List<String> atividades = new ArrayList<>();

		criaViagensPreCadastradas();

		// viagemConfirmada = false;

		Scanner scan = new Scanner(System.in);
		int op = -1;

		while (op != 0) {
			System.out.println("BEM VINDO AO TRAVELPLAN");
			System.out.println("1 - Criar Viagem");
			System.out.println("2 - Viagem Pronta");
			System.out.println("0 - Sair do Programa");
			op = Integer.valueOf(scan.nextLine());

			switch (op) {
			case (1): // CRIAR VIAGEM

				Passageiro passageiro = new Passageiro();

				System.out.print("Informe o nome: ");
				passageiro.setNome(scan.nextLine());

				System.out.print("Informe a data de nascimento: ");
				passageiro.setDataNascimento(scan.nextLine());

				System.out.print("Informe o CPF: ");
				passageiro.setCpf(scan.nextLine());

				Viagem viagem = new Viagem();

				System.out.print("Informe a data da viagem: ");
				viagem.setDataViagem(scan.nextLine());

				System.out.print("Informe a origem: ");
				viagem.setOrigem(scan.nextLine());

				System.out.print("A viagem é internacional? (Sim/Não): ");
				String resposta = scan.nextLine();
				viagem.setInternacional(resposta.equalsIgnoreCase("Sim"));

				System.out.print("Informe o destino: ");
				viagem.setDestino(scan.nextLine());

				System.out.print("Informe a acomodação: ");
				viagem.setAcomodacao(scan.nextLine());

				System.out.print("Informe o valor da acomodação: ");
				viagem.setValorAcomodacao(scan.nextDouble());

				passageiro.setViagem(viagem);

				op = -1;
				while (true) {
					System.out.println("\nMENU:");
					System.out.println("1. Adicionar Atividade");
					System.out.println("2. Alterar Atividade");
					System.out.println("3. Excluir Atividade");
					System.out.println("0. Sair");
					op = Integer.valueOf(scan.nextLine());

					switch (op) {
					case (1): // adicionar atividade
						System.out.println("Digite a nova atividade:");
						String novaAtividade = scan.nextLine();
						adicionarAtividade(novaAtividade, atividades);
						break;

					case (2): // alterar atividade
						System.out.println("Digite o índice da atividade a ser alterada:");
						int indice = Integer.valueOf(scan.nextLine());

						if (indice >= 0 && indice < atividades.size()) {
							System.out.println("Digite a nova atividade:");
							novaAtividade = scan.nextLine();
							alterarAtividade(indice, novaAtividade, atividades);
						} else {
							System.out.println("Opção inválida");
						}
						break;

					case (3): // excluir atividade
						System.out.println("Digite o índice da atividade a ser excluída:");
						indice = Integer.valueOf(scan.nextLine());
						if (indice >= 0 && indice < atividades.size()) {
							excluirAtividade(indice, atividades);
						} else {
							System.out.println("Opção inválida");
						}
						break;

					default:
						System.out.println("Opção inválida.");
						break;
					}
				}
			case (2): // VIAGEM PRONTA
				op = -1;
				while (op != 0) {
					ViagemPronta viagemPronta = new ViagemPronta();
					System.out.println("Sua viagem eh: ");
					System.out.println("1 - Nacional");
					System.out.println("2 - Internacional");
					System.out.println("0 - Sair do Programa");
					op = Integer.valueOf(scan.nextLine());

					ArrayList<String> atracoesJaneiroAbril = viagemPronta.atracoesJaneiroAbril;
					switch (op) {
					case (1): // viagem nacional
						System.out.println("Escolha a data da sua viagem: ");
						System.out.println("1 - Janeiro até Abril");
						System.out.println("2 - Maio até agosto");
						System.out.println("3 - Setembro até Dezembro");
						op = Integer.valueOf(scan.nextLine());

						switch (op) {
						case (1):
							System.out.println("Datas disponiveis para: Janeiro até Abril");
							for (String datas : viagemPronta.datasJaneiroAbril) {
								System.out.println(datas);
							} // mostras datas disponiveis
							System.out.println("Digite a opção da data desejada: ");
							viagemPronta.setData(Integer.valueOf(scan.nextLine()));

							System.out.println("Destinos disponiveis para: Janeiro até Abril");
							for (String destinos : viagemPronta.destinosNacionaisJaneiroAbril) {
								System.out.println(destinos);
							} // mostrar destinos
							System.out.println("Digite a opção de destino desejada: ");
							viagemPronta.setDestinos(Integer.valueOf(scan.nextLine()));

							for (int i = 0; i < atracoesJaneiroAbril.size(); i++) {
								System.out.println(atracoesJaneiroAbril.get(i));
							}

							String indiceDigitado = "0";

							System.out.println("Atrações Selecionadas para destino:");
							for (String atracoes : atracoesJaneiroAbril) {
								System.out.println(atracoes);
							} // mostrar atracoes disponiveis

							break;
						case (2):
							System.out.println("Datas disponiveis para: Maio até Agosto");
							for (String datas : viagemPronta.datasMaioAgosto) {
								System.out.println(datas);
							}
							System.out.println("Digite a opção da data desejada: ");
							viagemPronta.setData(Integer.valueOf(scan.nextLine()));

							System.out.println("Destinos disponiveis");

							System.out.println("Atrações disponiveis:");
							for (String atracoes : viagemPronta.atracoesMaioAgosto) {
								System.out.println(atracoes);
							}

							break;
						case (3):
							System.out.println("Datas disponiveis para: Setembro até Dezembro");
							for (String datas : viagemPronta.datasSetembroDezembro) {
								System.out.println(datas);
							}

							System.out.println("Datas a opção da data desejada: ");
							viagemPronta.setData(Integer.valueOf(scan.nextLine()));

							System.out.println("Atrações disponiveis:");
							for (String atracoes : viagemPronta.atracoesSetembroDezembro) {
								System.out.println(atracoes);
							}
							break;
						default:
							System.out.println("Opção inválida.");
							break;
						// reumo da viagem

						}

					case (2): // viagem internacional
						System.out.println("Escolha a data da sua viagem: ");
						System.out.println("1 - Janeiro até Abril");
						System.out.println("2 - Maio até Agosto");
						System.out.println("3 - Setembro até Dezembro");
						op = Integer.valueOf(scan.nextLine());

						switch (op) {
						case (1):
							System.out.println("Datas disponiveis para: Janeiro até Abril");
							for (String datas : viagemPronta.datasJaneiroAbril) {
								System.out.println(datas);
							}

							System.out.println("Digite a opção da data desejada: ");
							viagemPronta.setData(Integer.valueOf(scan.nextLine()));

							System.out.println("Atrações disponiveis:");
							for (String atracoes : atracoesJaneiroAbril) {
								System.out.println(atracoes);
							}

							break;
						case (2):
							System.out.println("Datas disponiveis para: Maio até Agosto");
							for (String datas : viagemPronta.datasMaioAgosto) {
								System.out.println(datas);
							}

							System.out.println("Digite a opção da data desejada: ");
							viagemPronta.setData(Integer.valueOf(scan.nextLine()));

							System.out.println("Atrações disponiveis:");
							for (String atracoes : viagemPronta.atracoesMaioAgosto) {
								System.out.println(atracoes);
							}
							break;
						case (3):
							System.out.println("Datas disponiveis para: Setembro até Dezembro");
							for (String datas : viagemPronta.datasSetembroDezembro) {
								System.out.println(datas);
							}

							System.out.println("Digite a opção de data desejada: ");
							viagemPronta.setData(Integer.valueOf(scan.nextLine()));

							System.out.println("Atrações disponiveis:");
							for (String atracoes : viagemPronta.atracoesSetembroDezembro) {
								System.out.println(atracoes);
							}
							break;

						default:
							System.out.println("Opção inválida.");
							break;
						}

					default:
						System.out.println("Opção inválida.");
						break;
					}
				}
			}
		}

	}

	private static void criaViagensPreCadastradas() {

		Viagem v = new Viagem();
		v.setDataViagem(null);
		v.setAcomodacao(null);
		viagens.add(v);

	}

	public static void adicionarAtividade(String atividade, List<String> atividades) {
		atividades.add(atividade);
		System.out.println("Atividade ADICIONADA com sucesso!");
	}

	public static void alterarAtividade(int indice, String novaAtividade, List<String> atividades) {
		if (indice >= 0 && indice < atividades.size()) {
			atividades.set(indice, novaAtividade);
			System.out.println("Atividade ALTERADA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
	}

	public static void excluirAtividade(int indice, List<String> atividades) {
		if (indice >= 0 && indice < atividades.size()) {
			atividades.remove(indice);
			System.out.println("Atividade EXCLUIDA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
	}
	
	// JANEIRO ATE ABRIL
		public ArrayList<String> datasJaneiroAbril = new ArrayList<>();
		{

			LocalDate dataAleatoria = LocalDate.of(2023, 10, 01);

//			for (String string : LocalDate.m) {

//			}

			datasJaneiroAbril.add("1 - 10 de Janeiro");
			datasJaneiroAbril.add("2 - 2 de Fevereiro");
			datasJaneiroAbril.add("3 - 25 de Fevereiro");
			datasJaneiroAbril.add("4 - 14 de Março");
			datasJaneiroAbril.add("5 - 19 de Abril");
		}

		public ArrayList<String> destinosNacionaisJaneiroAbril = new ArrayList<>();
		{
			destinosNacionaisJaneiroAbril.add("1 - Rio de Janeiro");
			destinosNacionaisJaneiroAbril.add("2 - Salvador");
			destinosNacionaisJaneiroAbril.add("3 - Florianópolis");
			destinosNacionaisJaneiroAbril.add("4 - Fortaleza");
			destinosNacionaisJaneiroAbril.add("5 - Curitiba");
		}

		public ArrayList<String> destinosInternacionaisJaneiroAbril = new ArrayList<>();
		{
			destinosInternacionaisJaneiroAbril.add("1 - Cancún, México");
			destinosInternacionaisJaneiroAbril.add("2 - Paris, França");
			destinosInternacionaisJaneiroAbril.add("3 - Nova Iorque, Estados Unidos");
			destinosInternacionaisJaneiroAbril.add("4 - Tóquio, Japão");
			destinosInternacionaisJaneiroAbril.add("5 - Barcelona, Espanha");
		}

		public ArrayList<String> atracoesJaneiroAbril = new ArrayList<>();
		{
			atracoesJaneiroAbril.add("Praias paradisíacas");
			atracoesJaneiroAbril.add("Trilhas na mata");
			atracoesJaneiroAbril.add("Festas locais");
			atracoesJaneiroAbril.add("Feiras de Alimentos e Bebidas");
			atracoesJaneiroAbril.add("Piqueniques e Churrascos em Parques");
		}

		// MAIO ATE AGOSTO
		public ArrayList<String> datasMaioAgosto = new ArrayList<>();
		{
			datasMaioAgosto.add("1 - 5 de Maio");
			datasMaioAgosto.add("2 - 11 de Junho");
			datasMaioAgosto.add("3 - 3 de Julho");
			datasMaioAgosto.add("4 - 20 de Julho");
			datasMaioAgosto.add("5 - 22 de Agosto");
		}

		public ArrayList<String> destinosNacionaisMaioAgosto = new ArrayList<>();
		{
			destinosNacionaisMaioAgosto.add("1 - Gramado");
			destinosNacionaisMaioAgosto.add("2 - Recife");
			destinosNacionaisMaioAgosto.add("3 - Foz do Iguaçu");
			destinosNacionaisMaioAgosto.add("4 - Manaus");
			destinosNacionaisMaioAgosto.add("5 - Brasília");
		}

		public ArrayList<String> destinosInternacionaisMaioAgosto = new ArrayList<>();
		{
			destinosInternacionaisMaioAgosto.add("1 - Bali, Indonésia");
			destinosInternacionaisMaioAgosto.add("2 - Roma, Itália");
			destinosInternacionaisMaioAgosto.add("3 - Vancouver, Canadá");
			destinosInternacionaisMaioAgosto.add("4 - Sydney, Austrália");
			destinosInternacionaisMaioAgosto.add("5 - Istambul, Turquia");
		}

		public ArrayList<String> atracoesMaioAgosto = new ArrayList<>();
		{
			atracoesMaioAgosto.add("Festivais de Música ao Ar Livre");
			atracoesMaioAgosto.add("Passeios de Barco");
			atracoesMaioAgosto.add("Parques Temáticos");
			atracoesMaioAgosto.add("Museus de Arte");
			atracoesMaioAgosto.add("Observação de Baleias");
		}

		// SETEMBRO ATÉ DEZEMBRO
		public ArrayList<String> datasSetembroDezembro = new ArrayList<>();
		{
			datasSetembroDezembro.add("1 - 5 de Maio");
			datasSetembroDezembro.add("2 - 11 de Junho");
			datasSetembroDezembro.add("3 - 3 de Julho");
			datasSetembroDezembro.add("4 - 20 de Julho");
			datasSetembroDezembro.add("5 - 22 de Agosto");
		}

		public ArrayList<String> destinosNacionaisSetembroDezembro = new ArrayList<>();
		{
			destinosNacionaisSetembroDezembro.add("1 - Jericoacoara");
			destinosNacionaisSetembroDezembro.add("2 - Bonito");
			destinosNacionaisSetembroDezembro.add("3 - Fernando de Noronha");
			destinosNacionaisSetembroDezembro.add("4 - Belo Horizonte");
			destinosNacionaisSetembroDezembro.add("5 - Campos do Jordão");
		}

		public ArrayList<String> destinosInternacionaisSetembroDezembro = new ArrayList<>();
		{
			destinosInternacionaisSetembroDezembro.add("1 - Atenas, Grécia");
			destinosInternacionaisSetembroDezembro.add("2 - Cairo, Egito");
			destinosInternacionaisSetembroDezembro.add("3 - Amsterdã, Holanda");
			destinosInternacionaisSetembroDezembro.add("4 - Dubai, Emirados Árabes Unidos");
			destinosInternacionaisSetembroDezembro.add("Toronto, Canadá");
		}

		public ArrayList<String> atracoesSetembroDezembro = new ArrayList<>();
		{
			atracoesSetembroDezembro.add("Foliões de Outono");
			atracoesSetembroDezembro.add("Festivais de Vinho e Cerveja");
			atracoesSetembroDezembro.add("Visitas a Vinícolas");
			atracoesSetembroDezembro.add("Mercados de Natal");
			atracoesSetembroDezembro.add("Pistas de Patinação no Gelo ao Ar Livre");
		}
}
