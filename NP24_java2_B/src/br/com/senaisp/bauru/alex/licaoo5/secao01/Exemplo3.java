package br.com.senaisp.bauru.alex.licaoo5.secao01;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner sc = new Scanner(System.in);
		boolean bDataValida = false;
		System.out.println("DIgite sua data de nacimento:");
		String xDtNasc= sc.nextLine();
		
		Scanner sc2 = new Scanner(xDtNasc);
		// Usar a  barra como delimitador 
		sc2.useDelimiter("/");
		//Pegar as partes da data 
		dia = sc2.nextInt();
		mes = sc2.nextInt();
		ano = sc2.nextInt();
		// fechamento o scanner 2
		sc2.close();
		System.out.println("Dia: "+ dia);
		System.out.println("mes: "+ mes);
		System.out.println("ano: "+ ano);
		// verificando se a data e valida 
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:bDataValida = dia>=1 && dia <=31; break;
		case 4:
		case 6:
		case 9:
		case 11: bDataValida = dia >=1 && dia <=30; break;
		case 2: bDataValida = dia >=1 && dia  <=28 ||
							dia>=1 && dia <=29 && ano%4==0 && ano%100!=0 ||
							dia>=1 && dia <=29 && ano%400==0; break;
			
		
		}
		if (bDataValida)// vai executar somente uma linha
			System.out.println("Data e válida");
		else// somente 1 comando se não tiver a {
			System.out.println("data inválida!");
		sc.close();
	}

}
