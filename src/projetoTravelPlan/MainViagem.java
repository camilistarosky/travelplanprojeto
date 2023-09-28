package projetoTravelPlan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainViagem extends CriarViagem {

	public static void main(String[] args) {
		List<String> atividades = new ArrayList<>();

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
				Viagem viagem = new Viagem();

				System.out.print("Informe o nome: ");
				viagem.setNome(scan.nextLine());

				System.out.print("Informe a data de nascimento: ");
				viagem.setDataNascimento(scan.nextLine());

				System.out.print("Informe o CPF: ");
				viagem.setCpf(scan.nextLine());

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

							System.out.println("Atrações Selecionadas para destino:");
							for (String atracoes : viagemPronta.atracoesJaneiroAbril) {
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
							for (String atracoes : viagemPronta.atracoesJaneiroAbril) {
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
}
