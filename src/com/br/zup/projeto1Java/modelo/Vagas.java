package com.br.zup.projeto1Java.modelo;

import java.util.List;
import java.util.Scanner;

public class Vagas {

	private String tipoVaga = "";
	private int numeroVaga = 0;
	private Veiculos veiculos = null;
	private Catraca catraca = null;

	public Vagas() {
		super();
	}

	public Vagas(String tipoVaga, int numeroVaga, Veiculos veiculos, Catraca catraca) {
		this.numeroVaga = numeroVaga;
		this.tipoVaga = tipoVaga;
		this.veiculos = veiculos;
		this.catraca = catraca;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public Veiculos getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}

	public Catraca getCatraca() {
		return catraca;
	}

	public void setCatraca(Catraca catraca) {
		this.catraca = catraca;
	}

	public int getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(int numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	// metodo para calcular quantidade de vagas para idoso
	public int quantidadeVagasIdoso(int vagasCarros) {

		int vagas = (int) (vagasCarros * 0.05);
		return vagas;

	}

	// metodo para calcular quantidade de vagas para deficiente
	public int quantidadeVagasDeficiente(int vagasCarros) {

		int vagas = (int) (vagasCarros * 0.02);
		return vagas;

	}

	// metodo para listar e nomear vagas
	public List<Vagas> nomeiaVagas(List<Vagas> vagas, int vagasIdoso, int vagasDeficiente, int vagasComum,
			int vagasMotos) {

		// metodo criado para nomear as vagos do estacionamento
		// de acordo com as especificação que nos foi passadas

		for (int i = 1; i <= vagasDeficiente; i++) {
			String tipo = "D";
			int numero = i;
			Vagas vagaD = new Vagas(tipo, numero, null, null);

			vagas.add(vagaD);

		}
		for (int i = 1; i <= vagasIdoso; i++) {
			String tipo = "I";
			int numero = i;
			Vagas vagaI = new Vagas(tipo, numero, null, null);

			vagas.add(vagaI);
		}

		for (int i = 1; i <= vagasComum; i++) {
			String tipo = "C";
			int numero = i;
			Vagas vagasC = new Vagas(tipo, numero, null, null);

			vagas.add(vagasC);
		}
		for (int i = 1; i <= vagasMotos; i++) {
			String tipo = "M";
			int numero = i;
			Vagas vagasM = new Vagas(tipo, numero, null, null);

			vagas.add(vagasM);
		}

		return vagas;
	}

	// metodo para exibir vagas
	public void exibirVagas(List<Vagas> listaVagas) {

		for (Vagas vagas : listaVagas) {
			System.out.println(vagas);
		}

	}

	// metodo para entrada de veiculos
	public List<Vagas> entradaVeiculos(List<Vagas> listaVagas) {
		Scanner scan = entrada();
		Veiculos veiculo = new Veiculos();
		Catraca entrada = new Catraca();

		System.out.println("-----Nomeclatura das vagas----\n" + "\n'C' Vagas comuns\n" + "'I' Vagas para isosos\n"
				+ "'D' Vagas para Decifiente\n" + "'M' Vagas para motos\n");

		System.out.println("Digite em qual vaga deseja estacionar o veiculo\n" + "Primeiro o tipo da vaga");
		String tipoVaga = scan.nextLine();

		System.out.println("Agora nos informe o numero da vaga");
		int numero = scan.nextInt();

		for (int i = 0; i < listaVagas.size(); i++) {
			Vagas vaga = listaVagas.get(i);

			if (tipoVaga.equalsIgnoreCase(vaga.getTipoVaga()) && numero == vaga.getNumeroVaga()
					&& vaga.getVeiculos() == null) {

				veiculo = veiculo.cadastraVeiculo();
				entrada = entrada.inserirHoraEntrada();

				vaga.setVeiculos(veiculo);
				vaga.setCatraca(entrada);

			} else if (tipoVaga.equalsIgnoreCase(vaga.getTipoVaga()) && vaga.getVeiculos() != null) {
				System.out.println("Vaga não disponivel");
			}
		}

		return listaVagas;
	}

	// metodo para retirada de veiculo
	public List<Vagas> retiraVeiculo(List<Vagas> vagas) {
		Scanner scan = entrada();
		Veiculos veiculo = new Veiculos();
		Catraca catraca = new Catraca();
		System.out
				.println("Para retirada do veiculo.\n" + "Informe o tipo e numero da vaga\n" + "Digite o tipo da vaga");
		String tipo = scan.nextLine();

		System.out.println("Digite o numero da vaga");
		int numero = scan.nextInt();
		int i = 0;

		for (i = 0; i < vagas.size(); i++) {
			Vagas vagas2 = vagas.get(i);

			if (vagas2.getTipoVaga().equalsIgnoreCase(tipo) && vagas2.getNumeroVaga() == numero) {
				veiculo = vagas2.getVeiculos();
				catraca = vagas2.getCatraca();

				System.out.println(veiculo);

				catraca.caculaValor(catraca);
			}

		}

		for (

		Vagas vagas3 : vagas) {
			if (vagas3.getTipoVaga().equalsIgnoreCase(tipo) && vagas3.getNumeroVaga() == numero) {
				vagas3.setVeiculos(null);
				vagas3.setCatraca(null);

			}
		}
		return vagas;

	}

	// metodo para entrada de dados
	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	// metodo para organizar a exibição dos atributos da classe
	public String toString() {
		String modelo = "____________________\n\n";
		modelo += this.getTipoVaga() + this.getNumeroVaga() + "\n";
		modelo += this.getVeiculos() + "\n";
		modelo += this.getCatraca() + "\n____________________";

		return modelo;

	}

}
