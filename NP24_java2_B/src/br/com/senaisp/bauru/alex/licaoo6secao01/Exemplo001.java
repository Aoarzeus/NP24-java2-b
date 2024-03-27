package br.com.senaisp.bauru.alex.licaoo6secao01;

import java.util.Scanner;

public class Exemplo001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 1;
	while ( !(opc>=1 && opc<=15)/*  condição*/ ) {
		//blocos de execução
		System.out.println("digite um valor entre 1 a 15:");
		opc= sc.nextInt();
	}
	System.out.println("fim do jogo");
	sc.close();
		
	}

}
