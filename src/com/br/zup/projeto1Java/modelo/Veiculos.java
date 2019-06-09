package com.br.zup.projeto1Java.modelo;

import java.util.Scanner;

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

	// metodo para organizar a exibição dos atributos da classe
	public String toString() {
		String modelo = "";
		modelo += "Tipo -> " + this.getTipo();
		modelo += "\nModelo -> " + this.getModelo();
		modelo += "\nPlaca -> " + this.getPlaca();

		return modelo;
	}

	// metodo para cadastrar veiculos
	public Veiculos cadastraVeiculo() {
		Scanner scan = entrada();

		System.out.println("Didite a tipo do veiculo");
		String tipo = scan.nextLine();

		System.out.println("Didite a placa");
		String placa = scan.nextLine();

		System.out.println("Didite o modelo");
		String modelo = scan.nextLine();

		Veiculos veiculo = new Veiculos(placa, modelo, tipo);

		return veiculo;

	}

	// metodo para entrada de dados
	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}
