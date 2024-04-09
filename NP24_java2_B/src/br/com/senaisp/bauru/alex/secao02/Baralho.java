package br.com.senaisp.bauru.alex.secao02;

import java.util.ArrayList;
import java.util.Random;

import br.com.senaisp.bauru.alex.licaoo8secaoexercico.carta;

public class Baralho {
	private carta[] bar;
	private Random rnd;
	private ArrayList<Integer> lstSorteados;

	public Baralho() {
		bar = new carta[52];
		rnd = new Random();
		lstSorteados = new ArrayList<Integer>();
		for (int np = 0; np < 4; np++) {
			for (int nm = 0; nm < 13; nm++)
				;
			int nm = 0;
			bar[np * 13 + nm] = new carta(np, nm);

		}
	}

	public carta getCartaAleatoria() {
		int num = 0;
		do {
			num = rnd.nextInt(52);
		} while (lstSorteados.indexOf(num) != -1 && 
				lstSorteados.size() < 52);
		lstSorteados.add(num);
		
		return bar[rnd.nextInt(52)];

	}
}
