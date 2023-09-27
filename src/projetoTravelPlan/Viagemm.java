package projetoTravelPlan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viagemm {

	public static class Viagem {
		private String nome;
		private String dataNascimento;
		private String cpf;
		private String dataViagem;
		private String origem;
		private String destino;
		private String acomodacao;
		private double valorAcomodacao;
		private List<String> atividades;
		private String opcoesPag;
		private boolean internacional;
		private boolean viagemConfirmada;
		private String formaPagamento;

		public Viagem() {
			atividades = new ArrayList<>();
			viagemConfirmada = false;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
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

		public boolean isInternacional() {
			return internacional;
		}

		public void setInternacional(boolean internacional) {
			this.internacional = internacional;
		}

		public boolean isViagemConfirmada() {
			return viagemConfirmada;
		}

		public String getFormaPagamento() {
			return formaPagamento;
		}

		public void setFormaPagamento(String formaPagamento) {
			this.formaPagamento = formaPagamento;
		}

		public void adicionarAtividade(String atividade) {
			atividades.add(atividade);
		}

		public void alterarAtividade(int indice, String novaAtividade) {
			if (indice >= 0 && indice < atividades.size()) {
				atividades.set(indice, novaAtividade);
			} else {
				System.out.println("opção invalida");
			}
		}

		public void excluirAtividade(int indice) {
			if (indice >= 0 && indice < atividades.size()) {
				atividades.remove(indice);
			} else {
				System.out.println("opção invalida");
			}
		}

		public void adicionarDestino(String novoDestino) {
			this.destino = novoDestino;
		}

		public void mostrarInformacoesViagem() {
			System.out.println("Nome: " + nome);
			System.out.println("Data de Nascimento: " + dataNascimento);
			System.out.println("CPF: " + cpf);
			System.out.println("Data da Viagem: " + dataViagem);
			System.out.println("Origem: " + origem);
			System.out.println("Destino: " + destino);
			System.out.println("Acomodações: " + acomodacao);
			System.out.println("Valor da Acomodação: " + valorAcomodacao);
			System.out.println("Atividades:");
			for (String atividade : atividades) {
				System.out.println("- " + atividade);
			}
			System.out.println("Internacional: " + (internacional ? "Sim" : "Não"));// esta dando algum erro aqui ,porem
																					// acho que é porque o codigo ainda
																					// nao acabou
			System.out.println("Opções de Pagamento: " + opcoesPag);
			System.out.println("Forma de Pagamento: " + formaPagamento);
			System.out.println("Viagem Confirmada: " + (viagemConfirmada ? "Sim" : "Não"));
		}

		public void selecionarFormaPagamento() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Selecione a forma de pagamento:");
			System.out.println("1. Boleto");
			System.out.println("2. Cartão de Crédito");
			System.out.println("3. PIX");
			int opcao = scan.nextInt();
			scan.nextLine(); // pra nao aparecer oque tinha antes no console

			switch (opcao) {
			case 1:
				formaPagamento = "Boleto";
				break;
			case 2:
				formaPagamento = "Cartão de Crédito";
				break;
			case 3:
				formaPagamento = "PIX";
				break;
			default:
				System.out.println("Opção de pagamento inválida.");// opção que a professora pediu la da opção invalida
				break;
			}
		}

		public void confirmarViagem() {
			if (!viagemConfirmada) {
				System.out.println("Confirmação de Viagem:");
				System.out.print("Deseja confirmar a viagem? (Sim/Não): ");
				Scanner scan = new Scanner(System.in);
				String resposta = scan.nextLine();
				if (resposta.equalsIgnoreCase("Sim")) {
					viagemConfirmada = true;
					System.out.println("Viagem confirmada com sucesso!");
				} else {
					System.out.println("Viagem não confirmada.");
				}
			} else {
				System.out.println("A viagem já está confirmada.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("BEM VINDO AO TRAVELPLAN");

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

		System.out.print("Informe o destino: ");
		viagem.setDestino(scan.nextLine());

		System.out.print("Informe a acomodação: ");
		viagem.setAcomodacao(scan.nextLine());

		System.out.print("Informe o valor da acomodação: ");
		viagem.setValorAcomodacao(scan.nextDouble());

		System.out.print("A viagem é internacional? (Sim/Não): ");
		String resposta = scan.nextLine();
		viagem.setInternacional(resposta.equalsIgnoreCase("Sim"));

		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Adicionar Atividade");
			System.out.println("2. Alterar Atividade");
			System.out.println("3. Excluir Atividade");
			System.out.println("4. Adicionar Destino");
			System.out.println("5. Adicionar Acomodação");
			System.out.println("6. Mostrar Informações da Viagem");
			System.out.println("7. Selecionar Forma de Pagamento");
			System.out.println("8. Confirmar Viagem");
			System.out.println("9. Sair");
			// tem que fazer o switch ainda e os case , esse brak aqui coloquei so pra
			// testar ,depois tem qwue tirar ele

			break;

		}
	}
}