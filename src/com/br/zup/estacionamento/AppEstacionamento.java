package com.br.zup.estacionamento;

import java.util.Scanner;

import com.br.zup.projeto1Java.modelo.Estacionamento;
import com.br.zup.projeto1Java.modelo.Veiculos;

public class AppEstacionamento {

	public static void main(String[] args) {

		Scanner scan = entrada();

		Estacionamento estacionamento = new Estacionamento();
		Veiculos veiculo = new Veiculos();
		
		System.out.println("Digite quantidade de vagas para carros no estacionamento");
		int vagasCarros = scan.nextInt();
		
		System.out.println("Digite quantidade de vagas para motos no estacionamento");
		int vagosMotos = scan.nextInt();
		
		int vagasIdoso = estacionamento.quantidadeVagasIdoso(vagasCarros);
		int vagasDeficiente = estacionamento.quantidadeVagasDeficiente(vagasCarros);
		
		int vagasComum = vagasCarros -(vagasIdoso+ vagasDeficiente);
		
		System.out.println("Total vagas comum "+ vagasComum);
		System.out.println("Total vagas idoso "+ vagasIdoso);
		System.out.println("Total vagas deficiente "+ vagasDeficiente);
		
		veiculo = veiculo.cadastraVeiculo();
	
		System.out.println(veiculo);
		

	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);

		return scan;
	}

}
