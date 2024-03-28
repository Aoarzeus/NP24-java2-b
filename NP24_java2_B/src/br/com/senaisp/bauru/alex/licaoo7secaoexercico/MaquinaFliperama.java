package br.com.senaisp.bauru.alex.licaoo7secaoexercico;

import java.util.Random;

public class MaquinaFliperama {
	private Random rnd;
	private int custoCredito;
	private String nomeJogo;
	//constructor
	public MaquinaFliperama(String nome) {
		nomeJogo = nome;
		rnd = new Random();
		custoCredito = rnd.nextInt(5)+1;
		
	}
	//métodos 
	public int getCustoCredito() {
		return custoCredito;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void lerCartao (Cartao ct) {
		if (custoCredito <= ct.getCreditos()) {
			int cr = ct.getCreditos() - custoCredito;
			ct.setCreditos(cr);
			//ganhar os tickets
			cr = ct.getTickets() + rnd.nextInt()+ 1;
			ct.setTickets(cr);
			//mostrar os creditos 
			System.out.println(ct);
		}else {
			System.out.println("Acabou seus creditos! ;-(");
		}
	}

}