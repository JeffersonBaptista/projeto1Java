package com.br.zup.projeto1Java.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {

	public static void rodaEstacionamento() {
		int controle = 1;
		Vagas vagas = new Vagas();
		
		
		List<Vagas> listaVagas = new ArrayList<Vagas>();
		listaVagas = vagas.iniciaVagas();


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
				vagas.retiraVeiculo(listaVagas);

			} else if (opcao == 4) {
				controle = 0;
			}

		}

	}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);

		return scan;
	}
}
