package projetoTravelPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainViagem {

	private static ArrayList<Viagem> viagens = new ArrayList<>();

	public static void main(String[] args) {
		ArrayList<String> atividades = new ArrayList<>();

		// viagemConfirmada = false;

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
					case(0):
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
				op = -1;
				while (op != 0) {
					Viagem viagemPronta = new Viagem();
					System.out.println("Sua viagem eh: ");
					System.out.println("1 - Nacional");
					System.out.println("2 - Internacional");
					System.out.println("0 - Sair do Programa");
					op = Integer.valueOf(scan.nextLine());

					switch (op) {
					case (1): // viagem nacional
						System.out.println("Todas as viagens nacionais disponiveis:");
						viagemNacional();

					case (2): // viagem internacional
						System.out.println("Todas as viagens internacionais disponiveis:");
						viagemInterncaional();

					default:
						System.out.println("Opção inválida.");
						break;
					}
				}
			}
		}

	}

	private static void viagemInterncaional() {
		Viagem v1 = new Viagem();
		v1.setOrigem("Navegantes");
		v1.setDestino("Paris");
		v1.setAcomodacao("Hotel");
		v1.setValorAcomodacao(659.99);
		LocalDate data1Ida1 = LocalDate.of(2023, 2, 10);
		LocalDate dataVolta1 = LocalDate.of(2023, 2, 18);

		ArrayList<String> atividades1 = new ArrayList<>();
		atividades1.add("Praias paradisíacas");
		atividades1.add("Trilhas na mata");
		atividades1.add("Festas locais");
		v1.setAtividades(atividades1);

		Viagem v2 = new Viagem();
		v2.setOrigem("Blumenau");
		v2.setDestino("Paris");
		v2.setAcomodacao("Hotel");
		v2.setValorAcomodacao(659.99);
		LocalDate data1Ida2 = LocalDate.of(2023, 2, 10);
		LocalDate dataVolta2 = LocalDate.of(2023, 2, 18);

		ArrayList<String> atividades = new ArrayList<>();
		atividades.add("Praias paradisíacas");
		atividades.add("Trilhas na mata");
		atividades.add("Festas locais");
		v2.setAtividades(atividades);

		Viagem v3 = new Viagem();

	}

	private static void viagemNacional() {

		Viagem v = new Viagem();//
		v.setDataViagem(null);// h
		v.setAcomodacao(null);// h
		viagens.add(v);// h

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

	public ArrayList<String> atracoesJaneiroAbril = new ArrayList<>();
	{
		atracoesJaneiroAbril.add("Praias paradisíacas");
		atracoesJaneiroAbril.add("Trilhas na mata");
		atracoesJaneiroAbril.add("Festas locais");
		atracoesJaneiroAbril.add("Feiras de Alimentos e Bebidas");
		atracoesJaneiroAbril.add("Piqueniques e Churrascos em Parques");
	}

	public ArrayList<String> atracoesMaioAgosto = new ArrayList<>();
	{
		atracoesMaioAgosto.add("Festivais de Música ao Ar Livre");
		atracoesMaioAgosto.add("Passeios de Barco");
		atracoesMaioAgosto.add("Parques Temáticos");
		atracoesMaioAgosto.add("Museus de Arte");
		atracoesMaioAgosto.add("Observação de Baleias");
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
