package com.br.zup.projeto1Java.modelo;

import java.util.Date;

public class Veiculos {
	private String placa = "";
	private String modelo = "";
	private String tipoVaga = "";
	private double horaEntrada = 0;
	private double horaSaida = 0;

	public Veiculos() {

	}

	public Veiculos(String placa, String modelo, String tipoVaga, double horaEntrada, double horaSaida) {

		this.placa = placa;
		this.modelo = modelo;
		this.tipoVaga = tipoVaga;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

}
