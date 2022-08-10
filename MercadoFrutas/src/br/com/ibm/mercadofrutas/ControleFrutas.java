package br.com.ibm.mercadofrutas;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas extends RuntimeException {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<String>();

		frutas.add("Maca");
		frutas.add("uva");
		frutas.add("Mamao");
		frutas.add("Goiaba");

		System.out.println("----------------------------------");
		System.out.println("1 - Cadastrar Frutas");
		System.out.println("2 - Listar Frutas");
		System.out.println("3 - Excluir Frutas");
		System.out.println("4 - Listar Frutas com ID");
		System.out.println("5 - Modificar uma Fruta");
		System.out.println("Digite outo numero para encerrar");

		Scanner entrada = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Quantas frutas deseja cadastrar?");
			int quantidade = num.nextInt();

			for (int x = 0; x < quantidade; x++) {

				System.out.println("----------------------------------");
				System.out.println("Digite o nome da fruta que deseja cadastrar");
				String nomeFruta = nome.next();
				frutas.add(nomeFruta);
			}

			System.out.println("----------------------------------");
			System.out.println("1 - Cadastrar Frutas");
			System.out.println("2 - Listar Frutas");
			System.out.println("3 - Excluir Frutas");
			System.out.println("4 - Listar Frutas com ID");
			System.out.println("5 - Modificar uma Fruta");
			System.out.println("Digite outo numero para encerrar");

			opcao = entrada.nextInt();

		case 2:
			System.out.println(frutas);

			System.out.println("----------------------------------");
			System.out.println("1 - Cadastrar Frutas");
			System.out.println("2 - Listar Frutas");
			System.out.println("3 - Excluir Frutas");
			System.out.println("4 - Listar Frutas com ID");
			System.out.println("5 - Modificar uma Fruta");
			System.out.println("Digite outo numero para encerrar");
			opcao = entrada.nextInt();
		

		case 3:
			
			System.out.println("----------------------------------");
			System.out.println("Qual o numero da Fruta que deseja remover?");
			int posicao = num.nextInt();

			if (posicao > 0 && posicao <= frutas.size()) {
				frutas.remove(posicao - 1);
				System.out.println("Fruta  nº " + posicao + " removida");
			} else {
				System.out.println("essa posição não existe");
			}
			System.out.println("----------------------------------");
			System.out.println("1 - Cadastrar Frutas");
			System.out.println("2 - Listar Frutas");
			System.out.println("3 - Excluir Frutas");
			System.out.println("4 - Listar Frutas com ID");
			System.out.println("5 - Modificar uma Fruta");
			System.out.println("Digite outo numero para encerrar");

			opcao = entrada.nextInt();

		case 4:
			for (int y = 0; y < frutas.size(); y++) {

				int id = y + 1;
				System.out.println("ID " + id + " da Fruta: " + frutas.get(y));
			}

			System.out.println("----------------------------------");
			System.out.println("1 - Cadastrar Frutas");
			System.out.println("2 - Listar Frutas");
			System.out.println("3 - Excluir Frutas");
			System.out.println("4 - Listar Frutas com ID");
			System.out.println("5 - Modificar uma Fruta");
			System.out.println("Digite outo numero para encerrar");
			opcao = entrada.nextInt();

		case 5:
			System.out.println("----------------------------------");
			System.out.println("Qual o numero da Fruta que alterar?");
			posicao = num.nextInt();

			if (posicao > 0 && posicao < frutas.size()) {
				System.out.println("Digite o nome da nova fruta: \n");
				String nomeFruta = nome.nextLine();

				frutas.set(posicao - 1, nomeFruta);
			}
			
			System.out.println("----------------------------------");
			System.out.println("1 - Cadastrar Frutas");
			System.out.println("2 - Listar Frutas");
			System.out.println("3 - Excluir Frutas");
			System.out.println("4 - Listar Frutas com ID");
			System.out.println("5 - Modificar uma Fruta");
			System.out.println("Digite outo numero para encerrar");
			opcao = entrada.nextInt();
			
		default:
			
			break;
		

	}
}}