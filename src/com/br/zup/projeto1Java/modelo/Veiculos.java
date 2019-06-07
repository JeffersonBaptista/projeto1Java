package com.br.zup.projeto1Java.modelo;

import java.util.Date;
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
	public String toString() {
		String modelo = "";
		modelo += "Placa -> "+ this.getPlaca();
		modelo += "\nModelo -> "+ this.getModelo();
		modelo += "\n Tipo -> "+ this.getTipo();
		
		return modelo;
	}
	
	public static Veiculos cadastraVeiculo() {
		Scanner scan = entrada();
		
		System.out.println("Didite a placa");
		String placa = scan.nextLine();
		
		System.out.println("Didite o modelo");
		String modelo = scan.nextLine();
		
		System.out.println("Didite a tipo do veiculo");
		String tipo = scan.nextLine();
		
		Veiculos veiculo = new Veiculos(placa, modelo, tipo);
		
		return veiculo;
		
	}
	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}
