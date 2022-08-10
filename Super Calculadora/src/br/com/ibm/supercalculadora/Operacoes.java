package br.com.ibm.supercalculadora;

public class Operacoes {

	double resultado;
	
	public void adicao (double num, double numm) {
		this.resultado = num +numm ;
		System.out.println(resultado);
	}
	public void subtracao (double num, double numm) {
		this.resultado = num -numm ;
		System.out.println(resultado);
	}
	public void multiplicacao (double num, double numm) {
		this.resultado = num * numm ;
		System.out.println(resultado);
	}
	public void divisao (double num, double numm) {
		this.resultado = num /numm ;
		System.out.println(resultado);
	}
}
