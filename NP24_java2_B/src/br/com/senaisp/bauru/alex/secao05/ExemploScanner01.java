package br.com.senaisp.bauru.alex.secao05;

import java.util.Scanner;

public class ExemploScanner01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = scn.next();
		System.out.println("Digite o sobre nome: ");
		String sobrenome = scn.next();
		System.out.println("olá "+ nome + "" + sobrenome);
		
		scn.close();
	}

}
