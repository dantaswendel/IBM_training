package br.com.ibm.supercalculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		double num = numero.nextDouble();

		System.out.println("Digite outro numero");
		double numm = numero.nextDouble();

		System.out.println("Digite o sinal da operação deseja fazer");
		System.out.println("1  para adicao");
		System.out.println("2 para subtracao");
		System.out.println("3 para multiplicacao");
		System.out.println("4 para divisao");

		int operador = entrada.nextInt();

		switch (operador) {
		case 1:
			Operacoes ad = new Operacoes();
			ad.adicao(num, numm);
			break;
			
		case 2 :
			Operacoes sub = new Operacoes();
			sub.subtracao(num, numm);
			break;
			
		case 3:
			Operacoes mult = new Operacoes();
			mult.multiplicacao(num, numm);
			break;
			
		case 4:
			Operacoes div = new Operacoes();
			div.divisao(num, numm);
			break;
			
		default:
			System.out.println("OPÇÃO INVALIDA");
			break;

		}

	}
}
