package br.com.senaisp.bauru.alex.licaoo7secaoexemplos;

import br.com.senaisp.bauru.alex.licaoo7secaoexercico.Cartao;

public class Terminal {
	private static int nId = 0;
	private CategotiaPremio categoria1;
	private CategotiaPremio categoria2;
	private CategotiaPremio categoria3;
	private int numeroTeminal;

	public Terminal() {
		numeroTeminal = ++nId;
		categoria1 = new CategotiaPremio("gold", 25);
		categoria2 = new CategotiaPremio("silver", 50);
		categoria3 = new CategotiaPremio("bronze", 75);
	}

	// Getters e Setters
	public CategotiaPremio getCategoria1() {
		return categoria1;
	}

	public CategotiaPremio getCategoria2() {
		return categoria2;
	}

	public CategotiaPremio getCategoria3() {
		return categoria3;
	}

	public int getNumeroTeminal() {
		return numeroTeminal;
	}

	// metodos
	public void consukltarSaldoCartao(Cartao ct) {
		System.out.println("Operação saldo  do cartão");
		System.out.println("=".repeat(20));
		System.out.println(ct);
	}

	public void carregarCartao(Cartao ct, int valor) {
		System.out.println("Operação: carregar saldo do cartão");
		System.out.println("-".repeat(20));
		int nrCreditos = valor * 2;
		// Atribuino os creditos
		ct.setCreditos(ct.getCreditos() + nrCreditos);
		// Mostrar saldo de credito
		System.out.println(ct);
		System.out.println("-".repeat(20));

	}

	public void transFerirCreditos(Cartao ori, Cartao des, int qtde) {
		System.out.println("Operação transferência de creditos");
		System.out.println("-".repeat(20));
		// teste de quantidade
		if (ori.getCreditos() >= qtde && qtde > 0) {// Posso trocar
			int vlr = ori.getCreditos() - qtde;
			ori.setCreditos(vlr);
			// transferencia de credito
			des.setCreditos(des.getCreditos() + qtde);
		} else {
			System.out.println("Creditos insuficiente ou qtde zero!");
		}
		System.out.println("Cartão Origem: ");
		System.out.println(ori);
		System.out.println("Cartão Destino: ");
		System.out.println(des);
		System.out.println("-".repeat(20));
	}

	public void transFerirCreditos(Cartao ori, Cartao des) {
		transFerirCreditos(ori, des, ori.getCreditos());
	}

	public void consultarPremios() {
		System.out.println("Operaçaõ : consultar prêmios");
		System.out.println("-".repeat(20));
		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(categoria3);
		System.out.println("-".repeat(nId));
	}

	public void resgatarPremio(Cartao ct, int nrCategoria) {
		CategotiaPremio apoio = null;
		System.out.println("Operação: Resgatar prêmio");
		System.out.println("-".repeat(20));
		switch (nrCategoria) {
		case 1:
			apoio = categoria1;
			break;
		case 2:
			apoio = categoria2;
			break;
		case 3:
			apoio = categoria3;
			break;
		default:
			System.out.println("Categoria inválida!");
		}
		if (apoio != null) {
			int qtdNticket = apoio.getQdeTickets();
			if (ct.getTickets() >= qtdNticket && apoio.getSaldoPremio() >= 1) {
				ct.setTickets(ct.getTickets() - qtdNticket);
				apoio.setSaldoPremio(apoio.getSaldoPremio() - 1);
			} else {
				System.out.println("Sem saldo de " + "tickets ou prêmios");
			}
			System.out.println("Prêmios");
			System.out.println(categoria1);
			System.out.println(categoria2);
			System.out.println(categoria3);
			System.out.println("Saldo Cartão");
			System.out.println(ct);
		} // if da categoria
	}// fim do método
}// fim da classe
