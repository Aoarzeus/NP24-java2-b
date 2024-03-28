package br.com.senaisp.bauru.alex.licaoo7secaoexemplos;

public class Exemplos {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		System.out.println("Nr. conta :"+ c1.getNumeroConta());
		
		System.out.println(ContaBancaria.ultNumero);
		
		//c1.setAgencia(1900);
		//c1.setBanco(341);
		c1.setNumeroConta(12345);
		//c1.setSaldo(-10);
		ContaBancaria c2 = c1;
		System.out.println(c1.getSaldo());
		c2.setSaldo(50);
		System.out.println(c1.getSaldo());
		adicionarValor(c1,100.00);
		System.out.println(c1.getSaldo());
		ContaBancaria c3= new ContaBancaria(123, 2, 1478, 65);
		System.out.println(c3.getSaldo());
	}
	
	private static void adicionarValor(ContaBancaria ca1, double d) {
		ca1.setSaldo(ca1.getSaldo() + d);
	}

}
