package com.br.zup.projeto1Java.modelo;

import java.util.Scanner;

public class Catraca {

	private double horaEntrada = 0;
	private double hotaSaída = 0;
	private double precoPeríodo = 0;
	private double preçoAdicional = 0;



	public Catraca(double horaEntrada, double hotaSaída, double precoPeríodo, double preçoAdicional) {
		this.horaEntrada = horaEntrada;
		this.hotaSaída = hotaSaída;
		this.precoPeríodo = precoPeríodo;
		this.preçoAdicional = preçoAdicional;
	}

	public Catraca() {
		
	}

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHotaSaída() {
		return hotaSaída;
	}

	public void setHotaSaída(double hotaSaída) {
		this.hotaSaída = hotaSaída;
	}

	public double getPrecoPeríodo() {
		return precoPeríodo;
	}

	public void setPrecoPeríodo(double precoPeríodo) {
		this.precoPeríodo = precoPeríodo;
	}

	public double getPreçoAdicional() {
		return preçoAdicional;
	}

	public void setPreçoAdicional(double preçoAdicional) {
		this.preçoAdicional = preçoAdicional;
	}
	
	public String toString() {
		String modelo ="";
		
		modelo += "Entrada -> "+this.getHoraEntrada();
		modelo += "\nSaida -> "+this.getHotaSaída();
		
		return modelo;
	}

	public Catraca inserirHoraEntrada() {
		Scanner scan = new Scanner(System.in);
		Catraca novaEntrada = new Catraca();
		
		System.out.println("Digite a hora da entrada");
		double hora = scan.nextDouble();
		novaEntrada.setHoraEntrada(hora);
		
		return novaEntrada;
	}

}
