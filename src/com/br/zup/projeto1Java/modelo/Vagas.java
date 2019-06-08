package com.br.zup.projeto1Java.modelo;

import java.util.List;

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

	public String toString() {
		String modelo = "____________________\n\n";
		modelo += this.getTipoVaga() + " - ";
		modelo += this.getVeiculos() + " - ";
		modelo += this.getCatraca() + "\n____________________";

		return modelo;

	}

}
