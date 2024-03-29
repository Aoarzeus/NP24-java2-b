package br.com.senaisp.bauru.alex.licaoo7secaoexercico;

import javax.swing.JPanel;

import br.com.senaisp.bauru.alex.licaoo7secaoexemplos.Terminal;

public class TesteDoJogo {

	public static void main(String[] args) {
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		// instacia
		Terminal tm = new Terminal();
		tm.carregarCartao(ct01, 50);
		tm.carregarCartao(ct02, 100);
		// Criando duas máquinas de jogo
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		MaquinaFliperama m2 = new MaquinaFliperama("LOL");
		// usar as máquinas
		System.out.println("Jogando...\n\n\n");
		m1.lerCartao(ct01);
		m1.lerCartao(ct02);
		System.out.println("Jogando segundo jogada...\n\n");
		m1.lerCartao(ct02);
		m1.lerCartao(ct01);
		System.out.println("Transferindo o saldo de cartão 1 pro 2");
		tm.transFerirCreditos(ct01, ct02);
		System.out.println("tentar jogar com o cartão 1...\n\n");
		m1.lerCartao(ct01);
		System.out.println("transferindo um pouco pra o cartão 1 \n\n");
		tm.transFerirCreditos(ct02, ct01, 10);
		System.out.println("Consultar saldos de prêmios..\n\n");
		tm.consultarPremios();
		System.out.println("resgantando um dos prêmios");
		tm.resgatarPremio(ct01, 1);
		
		// MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		// m1.lerCartao(ct01);
	}

}
