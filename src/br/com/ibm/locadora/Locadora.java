package br.com.ibm.locadora;

import java.util.Scanner;


public class Locadora {

	public static void main(String[] args) {

		String[] carros = { "Sandero", "Fusion", "Prisma", "fusca", "HB20", "BMW", "Porche", "Gol", "Ka", "Palio" };

		System.out.println("BEM VINDX A LOCADORA DE VEICULOS");
		System.out.println("----------------------------------");
		System.out.println("Escolha uma das op��es a Seguir");
		System.out.println("----------------------------------");
		System.out.println("1 - Mostrar todos os carros");
		System.out.println("2 - Escolher o carro");
		System.out.println("3 - Fechar Programa");
		System.out.println("----------------------------------");

		Scanner entrada = new Scanner(System.in);
		Scanner escolha = new Scanner(System.in);

		int opcao = entrada.nextInt();
		System.out.println("----------------------------------");

		switch (opcao) {
		case 1:

			for (int x = 0; x < 10; x++) {

				int posicao = x + 1;
				System.out.println("Carro n� " + posicao + " " + carros[x]);
				System.out.println("----------------------------------");
			}

			System.out.println("O que deseja fazer agora?");
			System.out.println("----------------------------------");
			System.out.println("2 - Escolher o carro");
			System.out.println("3 - Fechar Programa");

			opcao = entrada.nextInt();
			
			
			if (opcao ==3) {
				System.out.println("Voc� fechou o programa");
				break;
			}
			
			else 
				if(1>=opcao || opcao>= 4) {
				System.out.println("----------------------------------");
				System.out.println(" Voc�  escolheu uma op��o invalida");
				System.out.println(" *****RETORNE AO MENU INICIAL*****");
				System.out.println("----------------------------------");
				main(args);				
			}
	
			System.out.println("----------------------------------");
			
	
		case 2:

			System.out.println("Qual numero do carro que voc� deseja?");
			int carro = escolha.nextInt();
			System.out.println("----------------------------------");

			if (0 < carro && carro < 11) {
				System.out.println("Parab�ns Voc� escolheu o " + carros[carro - 1]);
			} else {
				System.out.println("----------------------------------");
				System.out.println(" Voc�  escolheu uma op��o invalida");
				System.out.println(" *****RETORNE AO MENU INICIAL*****");
				System.out.println("----------------------------------");
				main(args);
			}
			break;

		case 3:
			System.out.println("Voc� fechou o programa");
			break;

		default:
			System.out.println("OP��O INV�LIDA");
			System.out.println(" *****RETORNE AO MENU INICIAL*****");
			System.out.println("----------------------------------");
			main(args);
			
		}
	}

}
