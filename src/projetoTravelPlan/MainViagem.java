package projetoTravelPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainViagem {

	private static ArrayList<Viagem> viagens = new ArrayList<>();

	public static void main(String[] args) {
		ArrayList<String> atividades = new ArrayList<>();

		Passageiro passageiro = new Passageiro();
		Viagem viagem = new Viagem();

		Scanner scan = new Scanner(System.in);
		int op = Integer.MAX_VALUE;
		int op2 = Integer.MAX_VALUE;

		while (op != 0) {
			System.out.println("BEM VINDO AO TRAVELPLAN");
			System.out.println("1 - Criar Viagem");
			System.out.println("2 - Viagem Pronta");
			System.out.println("0 - Sair do Programa");
			op = Integer.valueOf(scan.nextLine());

			switch (op) {
			case (1): // CRIAR VIAGEM

				System.out.print("Informe o nome: ");
				passageiro.setNome(scan.nextLine());

				System.out.print("Informe a data de nascimento: ");
				passageiro.setDataNascimento(scan.nextLine());

				System.out.print("Informe o CPF: ");
				passageiro.setCpf(scan.nextLine());

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
				viagem.setValorAcomodacao(Float.valueOf(scan.nextLine()));

				passageiro.setViagem(viagem);

				op2 = -1;

				while (op2 != 0) {
					System.out.println("\nMENU:");
					System.out.println("1. Adicionar Atividade");
					System.out.println("2. Alterar Atividade");
					System.out.println("3. Excluir Atividade");
					System.out.println("0. Sair");
					op2 = Integer.valueOf(scan.nextLine());

					switch (op2) {
					case (0):
						System.out.println("Area de pagamento ");
						break;
					case (1): // adicionar atividade
						System.out.println("Digite a nova atividade:");
						String novaAtividade = scan.nextLine();
						adicionarAtividade(novaAtividade, atividades);
						System.out.println("Adicionado com sucesso");
						break;

					case (2): // alterar atividade
						System.out.println("Digite o índice da atividade a ser alterada:");
						int indice = Integer.valueOf(scan.nextLine());

						if (indice >= 0 && indice < atividades.size()) {
							System.out.println("Digite a nova atividade:");
							novaAtividade = scan.nextLine();
							alterarAtividade(indice, novaAtividade, atividades);
							System.out.println("alterado com sucesso");
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
							System.out.println("Deletado com sucesso");
						}
						break;

					default:
						System.out.println("Opção inválida.");
						break;
					}

				}
				mostrarInformacoesViagem(passageiro, viagem, atividades);
				selecionarFormaPagamento(viagem);
				confirmarViagem(viagem);

			case (2): // VIAGEM PRONTA
				while (op2 != 0) {
					Viagem viagemPronta = new Viagem();
					System.out.println("Sua viagem eh: ");
					System.out.println("1 - Nacional");
					System.out.println("2 - Internacional");
					System.out.println("0 - Sair do Programa");
					op2 = Integer.valueOf(scan.nextLine());

					switch (op2) {
					case (1): // viagem nacional
						System.out.println("Todas as viagens nacionais disponiveis:");
						viagemNacional();
						System.out.println("");

						System.out.println("Digite seus dados: ");
						System.out.println("Nome: ");
						passageiro.setNome(scan.nextLine());
						System.out.println("Data de Nascimento: ");
						passageiro.setDataNascimento(scan.nextLine());
						System.out.println("CPF: ");
						passageiro.setCpf(scan.nextLine());

						selecionarFormaPagamento(viagem);
						confirmarViagem(viagem);

						break;
					case (2): // viagem internacional
						System.out.println("Todas as viagens nacionais disponiveis:");
						viagemInterncaional();
						System.out.println("");

						System.out.println("Digite seus dados: ");
						System.out.println("Nome: ");
						passageiro.setNome(scan.nextLine());
						System.out.println("Data de Nascimento: ");
						passageiro.setDataNascimento(scan.nextLine());
						System.out.println("CPF: ");
						passageiro.setCpf(scan.nextLine());

						System.out.println("Resumo da Viagem: ");

						selecionarFormaPagamento(viagem);
						confirmarViagem(viagem);
					}
				}
			}
		}

	}

	private static void viagemInterncaional() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Viagem> viagemInternacional = new ArrayList<>();

		// viagem internacional 1
		Viagem vi1 = new Viagem();
		vi1.setI(1);
		vi1.setOrigem("Navegantes");
		vi1.setDestino("Maldivas");
		vi1.setAcomodacao("Hotel");
		vi1.setValorAcomodacao(893.21);
		LocalDate dataIdai1 = LocalDate.of(2023, 2, 10);
		vi1.setDataIda(dataIdai1);
		LocalDate dataVoltai1 = LocalDate.of(2023, 2, 18);
		vi1.setDataVolta(dataVoltai1);

		ArrayList<String> atividadesi1 = new ArrayList<>();
		atividadesi1.add("Praias paradisíacas");
		atividadesi1.add("Trilhas na mata");
		atividadesi1.add("Festas locais");
		vi1.setAtividades(atividadesi1);
		vi1.setTotal(3562.75);
		viagemInternacional.add(vi1);

		// viagem internacional 2
		Viagem vi2 = new Viagem();
		vi2.setI(2);
		vi2.setOrigem("Navegantes");
		vi2.setDestino("Barcelona");
		vi2.setAcomodacao("Hotel");
		vi2.setValorAcomodacao(659.99);
		LocalDate dataIdai2 = LocalDate.of(2024, 3, 16);
		vi2.setDataIda(dataIdai2);
		LocalDate dataVoltai2 = LocalDate.of(2024, 3, 25);
		vi2.setDataVolta(dataVoltai2);

		ArrayList<String> atividadesi2 = new ArrayList<>();
		atividadesi2.add("Feiras de Alimentos e Bebidas");
		atividadesi2.add("Piqueniques e Churrascos em Parques");
		atividadesi2.add("Festas locais");
		vi2.setAtividades(atividadesi2);
		vi2.setTotal(2787.65);
		viagemInternacional.add(vi2);

		// viagem internacional 3
		Viagem vi3 = new Viagem();
		vi3.setI(3);
		vi3.setOrigem("Navegantes");
		vi3.setDestino("Italia");
		vi3.setAcomodacao("Pousada");
		vi3.setValorAcomodacao(893.21);
		LocalDate dataIdai3 = LocalDate.of(2023, 12, 25);
		vi3.setDataIda(dataIdai2);
		LocalDate dataVoltai3 = LocalDate.of(2024, 1, 2);
		vi3.setDataVolta(dataVoltai3);

		ArrayList<String> atividadesi3 = new ArrayList<>();
		atividadesi3.add("Festivais de Música ao Ar Livre");
		atividadesi3.add("Museus de Arte");
		atividadesi3.add("Visitas a Vinícolas");
		vi3.setAtividades(atividadesi3);
		vi3.setTotal(2869.26);
		viagemInternacional.add(vi3);

		// viagem interncaional 4
		Viagem vi4 = new Viagem();
		vi4.setI(4);
		vi4.setOrigem("Navegantes");
		vi4.setDestino("Suíça");
		vi4.setAcomodacao("Pousada");
		vi4.setValorAcomodacao(1356.97);
		LocalDate dataIdari4 = LocalDate.of(2024, 1, 10);
		vi4.setDataIda(dataIdari4);
		LocalDate dataVoltai4 = LocalDate.of(2024, 1, 22);
		vi4.setDataVolta(dataVoltai4);

		ArrayList<String> atividadesi4 = new ArrayList<>();
		atividadesi4.add("Degustação de queijos suíços.");
		atividadesi4.add("Visita a museus de arte e história");
		atividadesi4.add("Passeio de bicicleta pelas paisagens suíças.");
		atividadesi4.add("Relaxamento em banhos termais");
		vi4.setAtividades(atividadesi4);
		vi4.setTotal(4563.29);
		viagemInternacional.add(vi4);

		// viagem interncaional 5
		Viagem vi5 = new Viagem();
		vi5.setI(5);
		vi5.setOrigem("Navegantes");
		vi5.setDestino("Austrália");
		vi5.setAcomodacao("Resort");
		vi5.setValorAcomodacao(1452.85);
		LocalDate dataIdai5 = LocalDate.of(2024, 3, 2);
		vi5.setDataIda(dataIdai5);
		LocalDate dataVoltai5 = LocalDate.of(2024, 3, 14);
		vi5.setDataVolta(dataVoltai5);

		ArrayList<String> atividadesi5 = new ArrayList<>();
		atividadesi5.add("Visita a praias para tomar sol e nadar");
		atividadesi5.add("Exploração de mercados locais");
		atividadesi5.add("Observação de aves em parques urbanos");
		atividadesi5.add("Piquenique em jardins botânicos");
		vi5.setAtividades(atividadesi5);
		vi5.setTotal(4879.56);
		viagemInternacional.add(vi5);

		for (Viagem vi : viagemInternacional) {
			System.out.println("OPÇÃO: " +vi.getI());
			System.out.println("Origem: " + vi.getOrigem());
			System.out.println("Destino: " + vi.getDestino());
			System.out.println("Acomodação: " + vi.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vi.getValorAcomodacao());
			System.out.println("Data de Ida: " + vi.getDataIda());
			System.out.println("Data da Volta: " + vi.getDataVolta());
			System.out.println("Atividades da Viagem: " + vi.getAtividades());
			System.out.println("Valor total da viagem: " + vi.getTotal());
			System.out.println("");
		}

		System.out.println("Escolha uma opção: ");
		int op = Integer.valueOf(scan.nextLine());

		System.out.println("RESUMO DA VIAGEM: ");
		switch (op) {
		case (1):
			System.out.println("OPÇÃO: " +vi1.getI());
			System.out.println("Origem: " + vi1.getOrigem());
			System.out.println("Destino: " + vi1.getDestino());
			System.out.println("Acomodação: " + vi1.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vi1.getValorAcomodacao());
			System.out.println("Data de Ida: " + vi1.getDataIda());
			System.out.println("Data da Volta: " + vi1.getDataVolta());
			System.out.println("Atividades da Viagem: " + vi1.getAtividades());
			System.out.println("Valor total da viagem: " + vi1.getTotal());
			System.out.println("");
			break;

		case (2):
			System.out.println("OPÇÃO: " +vi2.getI());
			System.out.println("Origem: " + vi2.getOrigem());
			System.out.println("Destino: " + vi2.getDestino());
			System.out.println("Acomodação: " + vi2.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vi2.getValorAcomodacao());
			System.out.println("Data de Ida: " + vi2.getDataIda());
			System.out.println("Data da Volta: " + vi2.getDataVolta());
			System.out.println("Atividades da Viagem: " + vi2.getAtividades());
			System.out.println("Valor total da viagem: " + vi2.getTotal());
			System.out.println("");
			break;

		case (3):
			System.out.println("OPÇÃO: " +vi3.getI());
			System.out.println("Origem: " + vi3.getOrigem());
			System.out.println("Destino: " + vi3.getDestino());
			System.out.println("Acomodação: " + vi3.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vi3.getValorAcomodacao());
			System.out.println("Data de Ida: " + vi3.getDataIda());
			System.out.println("Data da Volta: " + vi3.getDataVolta());
			System.out.println("Atividades da Viagem: " + vi3.getAtividades());
			System.out.println("Valor total da viagem: " + vi3.getTotal());
			System.out.println("");
			break;

		case (4):
			System.out.println("OPÇÃO: " +vi4.getI());
			System.out.println("Origem: " + vi4.getOrigem());
			System.out.println("Destino: " + vi4.getDestino());
			System.out.println("Acomodação: " + vi4.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vi4.getValorAcomodacao());
			System.out.println("Data de Ida: " + vi4.getDataIda());
			System.out.println("Data da Volta: " + vi4.getDataVolta());
			System.out.println("Atividades da Viagem: " + vi4.getAtividades());
			System.out.println("Valor total da viagem: " + vi4.getTotal());
			System.out.println("");
			break;

		case (5):
			System.out.println("OPÇÃO: " +vi5.getI());
			System.out.println("Origem: " + vi5.getOrigem());
			System.out.println("Destino: " + vi5.getDestino());
			System.out.println("Acomodação: " + vi5.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vi5.getValorAcomodacao());
			System.out.println("Data de Ida: " + vi5.getDataIda());
			System.out.println("Data da Volta: " + vi5.getDataVolta());
			System.out.println("Atividades da Viagem: " + vi5.getAtividades());
			System.out.println("Valor total da viagem: " + vi5.getTotal());
			System.out.println("");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

	}

	private static void viagemNacional() {
		Scanner scan = new Scanner (System.in);
		ArrayList<Viagem> viagemNacional = new ArrayList<>();

		// viagem nacional 1
		Viagem vn1 = new Viagem();
		vn1.setI(1);
		vn1.setOrigem("Navegantes");
		vn1.setDestino("Salvador");
		vn1.setAcomodacao("Risort");
		vn1.setValorAcomodacao(654.87);
		LocalDate dataIdan1 = LocalDate.of(2023, 11, 15);
		vn1.setDataIda(dataIdan1);
		LocalDate dataVoltan1 = LocalDate.of(2023, 11, 22);
		vn1.setDataVolta(dataVoltan1);

		ArrayList<String> atividadesn1 = new ArrayList<>();
		atividadesn1.add("Visitar o Pelourinho");
		atividadesn1.add("Curtir as praias");
		atividadesn1.add("Experimentar a culinária baiana");
		atividadesn1.add("Participar de festas e eventos culturais");
		vn1.setAtividades(atividadesn1);
		vn1.setTotal(2365.92);
		viagemNacional.add(vn1);

		// viagem nacional 2
		Viagem vn2 = new Viagem();
		vn1.setI(2);
		vn2.setOrigem("Navegantes");
		vn2.setDestino("Rio de Janeiro");
		vn2.setAcomodacao("Hotel");
		vn2.setValorAcomodacao(549.99);
		LocalDate dataIdan2 = LocalDate.of(2024, 3, 16);
		vn2.setDataIda(dataIdan2);
		LocalDate dataVoltan2 = LocalDate.of(2024, 3, 25);
		vn2.setDataVolta(dataVoltan2);

		ArrayList<String> atividadesn2 = new ArrayList<>();
		atividadesn2.add("Visitar o Cristo Redentor");
		atividadesn2.add("Ir as Praias");
		atividadesn2.add("Caminhar pelo calçadão de Copacabana");
		atividadesn2.add("Apreciar a vista do Mirante Dona Marta");
		vn2.setAtividades(atividadesn2);
		vn2.setTotal(1698.45);
		viagemNacional.add(vn2);

		// viagem nacional 3
		Viagem vn3 = new Viagem();
		vn1.setI(3);
		vn3.setOrigem("Navegantes");
		vn3.setDestino("Belo Horizonte");
		vn3.setAcomodacao("Risort");
		vn3.setValorAcomodacao(649.23);
		LocalDate dataIdan3 = LocalDate.of(2024, 6, 12);
		vn3.setDataIda(dataIdan3);
		LocalDate dataVoltan3 = LocalDate.of(2024, 6, 21);
		vn3.setDataVolta(dataVoltan3);

		ArrayList<String> atividadesn3 = new ArrayList<>();
		atividadesn3.add("Visitar o Parque das Mangabeiras");
		atividadesn3.add("Apreciar a arte na Galeria de Arte do Palácio das Artes");
		atividadesn3.add("Caminhar ao redor da Lagoa da Pampulha");
		vn3.setAtividades(atividadesn3);
		vn3.setTotal(1649.23);
		viagemNacional.add(vn3);

		// viagem nacional 4
		Viagem vn4 = new Viagem();
		vn1.setI(4);
		vn4.setOrigem("Navegantes");
		vn4.setDestino("Gramado");
		vn4.setAcomodacao("Pousada");
		vn4.setValorAcomodacao(1356.97f);
		LocalDate dataIdarn4 = LocalDate.of(2024, 5, 10);
		vn4.setDataIda(dataIdarn4);
		LocalDate dataVoltan4 = LocalDate.of(2024, 5, 18);
		vn4.setDataVolta(dataVoltan4);

		ArrayList<String> atividadesn4 = new ArrayList<>();
		atividadesn4.add("Parque Snowland");
		atividadesn4.add("Visitar a Fábrica de Chocolate Prawer");
		atividadesn4.add("Explorar o Mundo a Vapor");
		atividadesn4.add("Visitar o Lago Negro e fazer passeios de pedalinho");
		vn4.setAtividades(atividadesn4);
		vn4.setTotal(3265.98);
		viagemNacional.add(vn4);

		// viagem nacional 5
		Viagem vn5 = new Viagem();
		vn1.setI(5);
		vn5.setOrigem("Navegantes");
		vn5.setDestino("Curitiba");
		vn5.setAcomodacao("Hotel");
		vn5.setValorAcomodacao(659.87);
		LocalDate dataIdan5 = LocalDate.of(2024, 7, 16);
		vn5.setDataIda(dataIdan5);
		LocalDate dataVoltan5 = LocalDate.of(2024, 7, 25);
		vn5.setDataVolta(dataVoltan5);

		ArrayList<String> atividadesn5 = new ArrayList<>();
		atividadesn5.add("Visitar o Jardim Botânico de Curitiba");
		atividadesn5.add("Explorar o Museu Oscar Niemeyer (MON)");
		atividadesn5.add("Passear pelo Parque Tanguá");
		atividadesn5.add("Visitar a Ópera de Arame");
		vn5.setAtividades(atividadesn5);
		vn5.setTotal(1659.87);
		viagemNacional.add(vn5);

		for (Viagem vn : viagemNacional) {
			System.out.println("OPÇÃO: " + vn.getI());
			System.out.println("Origem: " + vn.getOrigem());
			System.out.println("Destino: " + vn.getDestino());
			System.out.println("Acomodação: " + vn.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vn.getValorAcomodacao());
			System.out.println("Data de Ida: " + vn.getDataIda());
			System.out.println("Data da Volta: " + vn.getDataVolta());
			System.out.println("Atividades da Viagem: " + vn.getAtividades());
			System.out.println("Valor total da viagem: " + vn.getTotal());
			System.out.println("");
		}
		
		System.out.println("Escolha uma opção: ");
		int op = Integer.valueOf(scan.nextLine());

		System.out.println("RESUMO DA VIAGEM: ");
		switch (op) {
		case (1):
			System.out.println("OPÇÃO: " +vn1.getI());
			System.out.println("Origem: " + vn1.getOrigem());
			System.out.println("Destino: " + vn1.getDestino());
			System.out.println("Acomodação: " + vn1.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vn1.getValorAcomodacao());
			System.out.println("Data de Ida: " + vn1.getDataIda());
			System.out.println("Data da Volta: " + vn1.getDataVolta());
			System.out.println("Atividades da Viagem: " + vn1.getAtividades());
			System.out.println("Valor total da viagem: " + vn1.getTotal());
			System.out.println("");
			break;

		case (2):
			System.out.println("OPÇÃO: " +vn2.getI());
			System.out.println("Origem: " + vn2.getOrigem());
			System.out.println("Destino: " + vn2.getDestino());
			System.out.println("Acomodação: " + vn2.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vn2.getValorAcomodacao());
			System.out.println("Data de Ida: " + vn2.getDataIda());
			System.out.println("Data da Volta: " + vn2.getDataVolta());
			System.out.println("Atividades da Viagem: " + vn2.getAtividades());
			System.out.println("Valor total da viagem: " + vn2.getTotal());
			System.out.println("");
			break;

		case (3):
			System.out.println("OPÇÃO: " +vn3.getI());
			System.out.println("Origem: " + vn3.getOrigem());
			System.out.println("Destino: " + vn3.getDestino());
			System.out.println("Acomodação: " + vn3.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vn3.getValorAcomodacao());
			System.out.println("Data de Ida: " + vn3.getDataIda());
			System.out.println("Data da Volta: " + vn3.getDataVolta());
			System.out.println("Atividades da Viagem: " + vn3.getAtividades());
			System.out.println("Valor total da viagem: " + vn3.getTotal());
			System.out.println("");
			break;

		case (4):
			System.out.println("OPÇÃO: " +vn4.getI());
			System.out.println("Origem: " + vn4.getOrigem());
			System.out.println("Destino: " + vn4.getDestino());
			System.out.println("Acomodação: " + vn4.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vn4.getValorAcomodacao());
			System.out.println("Data de Ida: " + vn4.getDataIda());
			System.out.println("Data da Volta: " + vn4.getDataVolta());
			System.out.println("Atividades da Viagem: " + vn4.getAtividades());
			System.out.println("Valor total da viagem: " + vn4.getTotal());
			System.out.println("");
			break;

		case (5):
			System.out.println("OPÇÃO: " +vn5.getI());
			System.out.println("Origem: " + vn5.getOrigem());
			System.out.println("Destino: " + vn5.getDestino());
			System.out.println("Acomodação: " + vn5.getAcomodacao());
			System.out.println("Valor da Acomodação: " + vn5.getValorAcomodacao());
			System.out.println("Data de Ida: " + vn5.getDataIda());
			System.out.println("Data da Volta: " + vn5.getDataVolta());
			System.out.println("Atividades da Viagem: " + vn5.getAtividades());
			System.out.println("Valor total da viagem: " + vn5.getTotal());
			System.out.println("");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}


	}

	public static void adicionarAtividade(String atividade, ArrayList<String> atividades) {
		atividades.add(atividade);
		System.out.println("Atividade ADICIONADA com sucesso!");
	}

	public static void alterarAtividade(int indice, String novaAtividade, ArrayList<String> atividades) {
		if (indice >= 0 && indice < atividades.size()) {
			atividades.set(indice, novaAtividade);
			System.out.println("Atividade ALTERADA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
	}

	public static void excluirAtividade(int indice, ArrayList<String> atividades) {
		if (indice >= 0 && indice < atividades.size()) {
			atividades.remove(indice);
			System.out.println("Atividade EXCLUIDA com sucesso!");
		} else {
			System.out.println("opção invalida");
		}
	}

	public static void mostrarInformacoesViagem(Passageiro passageiro, Viagem viagem, ArrayList<String> atividades) {
		System.out.println("Nome: " + passageiro.getNome());
		System.out.println("Data de Nascimento: " + passageiro.getDataNascimento());
		System.out.println("CPF: " + passageiro.getCpf());
		System.out.println("Data da Viagem: " + viagem.getDataViagem());
		System.out.println("Origem: " + viagem.getOrigem());
		System.out.println("Destino: " + viagem.getDestino());
		System.out.println("Acomodações: " + viagem.getAcomodacao());
		System.out.println("Valor da Acomodação: " + viagem.getValorAcomodacao());
		System.out.println("Atividades:");
		for (String atividade : atividades) {
			System.out.println("- " + atividade);
		}
		System.out.println("Internacional");// tem que arrumar aqui por causa do internacional
		System.out.println("Opções de Pagamento: " + viagem.getOpcoesPag());

	}

	public static void selecionarFormaPagamento(Viagem viagem) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Selecione a forma de pagamento:");
		System.out.println("1. Boleto");
		System.out.println("2. Cartão de Crédito");
		System.out.println("3. PIX");
		int opcao = Integer.valueOf(scan.nextLine());
		System.out.println();

		switch (opcao) {
		case 1:
			viagem.setOpcoesPag("Boleto");
			break;
		case 2:
			viagem.setOpcoesPag("Cartão de Crédito");
			break;
		case 3:
			viagem.setOpcoesPag("PIX");
			break;
		default:
			System.out.println("Opção de pagamento inválida.");// opção que a professora pediu la da opção invalida
			break;
		}
	}

	public static void confirmarViagem(Viagem viagem) {

		System.out.println("Confirmação de Viagem:");
		System.out.print("Deseja confirmar a viagem? (Sim/Não): ");
		Scanner scan = new Scanner(System.in);
		String resposta = scan.nextLine();

		if (resposta.equalsIgnoreCase("Sim")) {
			viagem.setViagemConfirmada(true);
			System.out.println("Viagem confirmada com sucesso!");
		} else {
			System.out.println("Viagem não confirmada.");
		}

	}
}
