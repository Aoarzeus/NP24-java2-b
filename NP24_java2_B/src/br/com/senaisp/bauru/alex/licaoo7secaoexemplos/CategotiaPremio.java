package br.com.senaisp.bauru.alex.licaoo7secaoexemplos;

import java.util.Random;

public class CategotiaPremio {
	private String nome;
	private int qdeTickets;
	private int saldoPremio;
	//constructor
	public CategotiaPremio(String nm, int sld) {
		nome =nm;
		saldoPremio = sld;
		Random rnd = new Random();
		qdeTickets = rnd.nextInt(10)+1;
		
	}
	//Getters e Setters
	public int getSaldoPremio() {
		return saldoPremio;
	}
	public void setSaldoPremio(int saldoPremio) {
		this.saldoPremio = saldoPremio;
	}
	public String getNome() {
		return nome;
	}
	public int getQdeTickets() {
		return qdeTickets;
	}
	@Override
	public String toString() {
		return "=".repeat(30)+"\n"+
				"Nome: " + getNome()+"\n"+
				"Custo tickeys: " + getQdeTickets()+"\n"
				+"saldo de premio: " +getSaldoPremio();
	}
}

