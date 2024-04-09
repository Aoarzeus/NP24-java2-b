package br.com.senaisp.bauru.alex.licaoo8secaoexercico;

import javax.management.RuntimeErrorException;

public class carta {
	private String[] naipes = { "♦", "♠", "♥", "♣", };
	private String[] numeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private int naipe;
	private int valor;
	private String numero;
	//constructor	
	public carta (int nap, int num) {
		if (nap<0 || nap>3) {
			throw new RuntimeException("Os naipes devem ser de 0 a 3");
			
		}
		if (num<0 || num>12) {
			throw new RuntimeException("Os números devem"+ "ser de 0 a 12");
		}
		naipe = nap;
		valor = num;
		numero = numeros[num];
		
	}
	public String getNaipe() {
		return naipes[naipe];
		
	}
	public String getNumero() {
		return numero;
	}
	public int getValor() {
		return  valor > 9 ? 10 : valor +1;
		//╚═╝║
	}
	public String tosString() {
		String apoio ="╔═════╗/n"
					+ "║##   ║/n"
					+ "║  §  ║/n"
					+ "║   ##║/n"
					+ "╚═════╝/n";	
		String br = valor == 9?"" : " ";
		apoio = apoio.replaceFirst("##", getNumero()+ br);
		apoio = apoio.replace("§", getNumero());
		apoio = apoio.replaceFirst("##",br + getNumero());
		return apoio;
		
	}
}
