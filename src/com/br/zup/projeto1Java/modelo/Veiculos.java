package com.br.zup.projeto1Java.modelo;

import java.util.Date;

public class Veiculos {
	private String placa = "";
	private String modelo = "";
	private String tipo = "";

	public Veiculos() {

	}

	public Veiculos(String placa, String modelo, String tipo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
