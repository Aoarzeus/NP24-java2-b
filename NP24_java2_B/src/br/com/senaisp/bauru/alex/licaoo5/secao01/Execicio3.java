package br.com.senaisp.bauru.alex.licaoo5.secao01;

import java.util.Scanner;

public class Execicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da cor: (1,2 ou3):");
		int codigo =  sc.nextInt();
		String cor = "Cor invalida";
		switch (codigo) {
		case 1 -> cor = "Próxima luz do semáforo será verde";
		case 2 -> cor = "Próxima luz do semáforo será amarelo";
		case 3 -> cor = "Próxima luz do semáforo será vermelho";
		}
		
		/*switch (codigo) {
		case 1 -> cor = "Próxima luz do semáforo será verde";break;
		case 2 -> cor = "Próxima luz do semáforo será amarelo";break;
		case 3 -> cor = "Próxima luz do semáforo será vermelho";break;
			*/
		
		System.out.println("cor");
		sc.close();
	}

}
