package br.com.senaisp.bauru.alex.licaoo4.secao01;

public class FestaDoAlex {
	//constantes 
			final static double IMPOSTO = 0.5;
			final static double GORJETA = 0.15;
			
			public static double calcularConta (double valor) {
				return valor * ( 1+IMPOSTO ) * (1+GORJETA);
			}
			
	public static void main(String[] args) {
		double pessoa1= 10;
		double pessoa2 = 12;
		double pessoa3 = 9;
		double pessoa4 = 8;
		double pessoa5 = 7;
		double pessoa6 = 15;
		double pessoa7 = 11;
		double pessoa8 = 30;
		
		// vamos as contas 
		double total1 = calcularConta(pessoa1) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total2 = calcularConta(pessoa2) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total3 = calcularConta(pessoa3) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total4 = calcularConta(pessoa4) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total5= calcularConta(pessoa5) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total6= calcularConta(pessoa6) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total7= calcularConta(pessoa7) * ( 1+IMPOSTO ) * (1+GORJETA);
		double total8= calcularConta(pessoa8) * ( 1+IMPOSTO ) * (1+GORJETA);
		// Mostrar valores 
		System.out.println("Pessoa1 : $"+ total1);
		System.out.println("Pessoa2 : $"+ total2);
		System.out.println("Pessoa3 : $"+ total3);
		System.out.println("Pessoa4 : $"+ total4);
		System.out.println("Pessoa5 : $"+ total5);
		System.out.println("Pessoa6 : $"+ total6);
		System.out.println("Pessoa7 : $"+ total7);
		System.out.println("Pessoa8 : $"+ total8);
		
	}

}
