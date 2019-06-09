package com.br.zup.estacionamento;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.zup.projeto1Java.modelo.Vagas;

import com.br.zup.projeto1Java.modelo.Veiculos;

public class AppEstacionamento {

	public static void main(String[] args) throws InterruptedException {

// método para calcular tempo de permanencia dentro do estacionamento
//
//		LocalDateTime dataEntrada;
//		LocalDateTime dataSaida;
//
//		dataEntrada = LocalDateTime.now();
//
//		Thread.sleep(0);
//
//		dataSaida = LocalDateTime.now();
//
//		Long dataInSecondsSaida = dataSaida.toEpochSecond(ZoneOffset(""));
//
//		Long daraInSecondsEntrada = dataEntrada.toEpochSecond(ZoneOffset(""));
//
//		Long dataInSecondsEntrada = null;
//		Long Total = dataInSecondsSaida - dataInSecondsEntrada / 60 / 60;
//
//		System.out.println("Total em segundos: " + Total);

// adicionei até aqui.

		List<Vagas> listaVagas = new ArrayList<Vagas>();

		Scanner scan = entrada();

		Vagas vagas = new Vagas();
		int controle = 1;
		Veiculos veiculo = new Veiculos();

		System.out.println("Digite quantidade de vagas para carros no estacionamento");
		int vagasCarros = scan.nextInt();

		System.out.println("Digite quantidade de vagas para motos no estacionamento");
		int vagasMotos = scan.nextInt();

		int vagasIdoso = vagas.quantidadeVagasIdoso(vagasCarros);
		int vagasDeficiente = vagas.quantidadeVagasDeficiente(vagasCarros);
		int vagasComum = vagasCarros - (vagasIdoso + vagasDeficiente);

		listaVagas = vagas.nomeiaVagas(listaVagas, vagasIdoso, vagasDeficiente, vagasComum, vagasMotos);

		while (controle == 1) {
			Scanner scanIf = entrada();

			System.out.println("Digite 1 para visualizar nossas vagas\n" + "Digite 2 para estacionar um veiculo\n"
					+ "Digite 3 retirar um veiculo\n" + "digite 4 para sair do sistema");
			int opcao = scanIf.nextInt();

			if (opcao == 1) {
				vagas.exibirVagas(listaVagas);

			} else if (opcao == 2) {
				vagas.entradaVeiculos(listaVagas);

			} else if (opcao == 3) {

			} else if (opcao == 4) {
				controle = 0;
			}

		}

	}

	private static ZoneOffset ZoneOffset(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);

		return scan;
	}

}
