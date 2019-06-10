package com.br.zup.projeto1Java.modelo;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Catraca {

	private double horaEntrada = 0;
	private double horaSaída = 0;
	private double precoPeríodo = 10;
	private double preçoAdicional = 5;

	public Catraca(double horaEntrada, double horaSaída, double precoPeríodo, double preçoAdicional) {
		this.horaEntrada = horaEntrada;
		this.horaSaída = horaSaída;
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

	public double getHoraSaída() {
		return horaSaída;
	}

	public void setHoraSaída(double horaSaída) {
		this.horaSaída = horaSaída;
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

	// metodo para organizar a exibição dos atributos da classe
	public String toString() {
		String modelo = "";

		modelo += "Entrada -> " + this.getHoraEntrada();
		modelo += "\nSaida -> " + this.getHoraSaída();

		return modelo;
	}

	// metodo para inserir hora de chegada do veiculo
	public Catraca inserirHoraEntrada() {
		Scanner scan = new Scanner(System.in);
		Catraca novaEntrada = new Catraca();

		System.out.println("Digite a hora da entrada");
		double hora = scan.nextDouble();
		novaEntrada.setHoraEntrada(hora);

		return novaEntrada;

	}

	// metodo para calcular valor a ser pago
	public void caculaValor(Catraca catraca1) {
		Scanner scan = entrada();
		Catraca catraca = catraca1;
		double valor = 0;

		System.out.println(catraca);

		System.out.println("\ndigite a hora da saida\n");
		double saida = scan.nextDouble();
		catraca.setHoraSaída(saida);

		System.out.println(catraca);

		double permanencia = (catraca.getHoraSaída() - catraca.getHoraEntrada());

		if (permanencia <= 0.15) {
			valor = 0;
		} else if (permanencia > 0.15 && permanencia <= 1) {
			valor = catraca.getPrecoPeríodo();
		} else if (permanencia > 1) {

			double hora = Math.ceil(permanencia - 1);
			int horaAdicional = (int) hora;

			valor = catraca.getPrecoPeríodo() + (horaAdicional * catraca.getPreçoAdicional());

		}

		System.out.println("Total de permanencia\n" + permanencia);

		System.out.println("\nTotal a pagar\n" + valor);

	}

	// metodo para entrada de dados
	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}
