package com.br.zup.projeto1Java.modelo;

import java.util.List;
import java.util.Scanner;

public class Vagas {

	private String tipoVaga = "";
	private Veiculos veiculos = null;
	private Catraca catraca = null;

	public Vagas() {
		super();
	}

	public Vagas(String tipoVaga, Veiculos veiculos, Catraca catraca) {

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

	public int quantidadeVagasIdoso(int vagasCarros) {

		int vagas = (int) (vagasCarros * 0.05);
		return vagas;

	}

	public int quantidadeVagasDeficiente(int vagasCarros) {

		int vagas = (int) (vagasCarros * 0.02);
		return vagas;

	}

	public List<Vagas> nomeiaVagas(List<Vagas> vagas, int vagasIdoso, int vagasDeficiente, int vagasComum,
			int vagasMotos) {

		// metodo criado para nomear as vagos do estacionamento
		// de acordo com as especificação que nos foi passadas

		for (int i = 1; i <= vagasDeficiente; i++) {
			String tipo = "D" + i;
			Vagas vagaD = new Vagas(tipo, null, null);

			vagas.add(vagaD);

		}
		for (int i = 1; i <= vagasIdoso; i++) {
			String tipo = "I" + i;
			Vagas vagaI = new Vagas(tipo, null, null);

			vagas.add(vagaI);
		}

		for (int i = 1; i <= vagasComum; i++) {
			String tipo = "C" + i;
			Vagas vagasC = new Vagas(tipo, null, null);

			vagas.add(vagasC);
		}
		for (int i = 1; i <= vagasMotos; i++) {
			String tipo = "M" + i;
			Vagas vagasM = new Vagas(tipo, null, null);

			vagas.add(vagasM);
		}

		return vagas;
	}

	public void exibirVagas(List<Vagas> listaVagas) {

		for (Vagas vagas : listaVagas) {
			System.out.println(vagas);
		}
	}

	public List<Vagas> entradaVeiculos(List<Vagas> listaVagas) {
		Scanner scan = entrada();
		Veiculos veiculo = new Veiculos();
		Catraca entrada = new Catraca();

		System.out.println("Deseja visualisar nossas vagas?\n" + "'S' para sim ou 'N' para não");
		String opcao = scan.nextLine();

		if (opcao.equalsIgnoreCase("S")) {
			this.exibirVagas(listaVagas);
			System.out.println("\n\nAcima estão nossas vagas");
		} else {
			System.out.println("Vamos la");
		}

		System.out.println("Nos diga em qual vaga deseja estacionar o veiculo");
		String localDesejado = scan.nextLine();

		for (int i = 0; i < listaVagas.size(); i++) {
			Vagas vaga = listaVagas.get(i);

			if (localDesejado.equalsIgnoreCase(vaga.getTipoVaga()) && vaga.getVeiculos() == null) {

				veiculo = veiculo.cadastraVeiculo();
				entrada = entrada.inserirHoraEntrada();

				vaga.setVeiculos(veiculo);
				vaga.setCatraca(entrada);

			} else if (localDesejado.equalsIgnoreCase(vaga.getTipoVaga()) && vaga.getVeiculos() != null) {
				System.out.println("Vaga não disponivel");
			}
		}

		return listaVagas;
	}

	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	public String toString() {
		String modelo = "____________________\n\n";
		modelo += this.getTipoVaga() + "\n";
		modelo += this.getVeiculos() + "\n";
		modelo += this.getCatraca() + "\n____________________";

		return modelo;

	}

}
