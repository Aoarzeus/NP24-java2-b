package br.com.senaisp.bauru.alex.licaoo5.secao01;

import java.util.Scanner;

public class ExemploSwit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIgite um valor de 1 a 10:");
		int vlr = sc.nextInt();
		switch(vlr) {
		case 1: System.out.println(" você ganhou um boné!");break;
		case 2: System.out.println(" você ganhou um caneta!");break;
		case 3: System.out.println(" você ganhou um lápis!");break;
		case 4: System.out.println(" você ganhou um calculadora!");break;
		case 5: System.out.println(" você ganhou um boracha!");break;
		case 6: System.out.println(" você ganhou um régua!");break;
		case 7: System.out.println(" você ganhou um transferidor!");break;
		case 8: System.out.println(" você ganhou um compasso!");break;
		case 9: System.out.println(" você ganhou um celular!");break;
		case 10: System.out.println(" você ganhou um R$1.000,00!");break;
		default : System.out.println("Que pena, não foi dessa vez");break;
		}
		sc.close();
	}

}
