package com.br.zup.projeto1Java.modelo;

public class Estacionamento {
	
	private int vagasComuns = 0;
	private int vagasIdoso = 0;
	private int vagasDeficiente = 0;
	private String tipoVaga ="";
	private Veiculos veiculos = null;
	private Catraca catraca = null;
	public Estacionamento(int vagasComuns, int vagasIdoso, int vagasDeficiente, String tipoVaga, Veiculos veiculos,
			Catraca catraca) {
		super();
		this.vagasComuns = vagasComuns;
		this.vagasIdoso = vagasIdoso;
		this.vagasDeficiente = vagasDeficiente;
		this.tipoVaga = tipoVaga;
		this.veiculos = veiculos;
		this.catraca = catraca;
	}
	public int getVagasComuns() {
		return vagasComuns;
	}
	public void setVagasComuns(int vagasComuns) {
		this.vagasComuns = vagasComuns;
	}
	public int getVagasIdoso() {
		return vagasIdoso;
	}
	public void setVagasIdoso(int vagasIdoso) {
		this.vagasIdoso = vagasIdoso;
	}
	public int getVagasDeficiente() {
		return vagasDeficiente;
	}
	public void setVagasDeficiente(int vagasDeficiente) {
		this.vagasDeficiente = vagasDeficiente;
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
	
	public int quantidadeVagasIdoso(int vagasTotal) {
		
		int vagas = (int) (vagasTotal * 0.05);
		return vagas;
		
	}
	public int quantidadeVagasDeficiente(int vagasTotal) {
		
		int vagas = (int) (vagasTotal * 0.02);
		return vagas;
		
	}

}
