package br.com.senaisp.bauru.alex.licaoo5.secao01;

public class Emplo1 {

	public static void main(String[] args) {
			int idade = 18;
			boolean bPodeDirigir = !(idade <=18 || idade > 65);
									//idade>=18 && idade <=65;	
			System.out.println("Você " +( bPodeDirigir ? "pode ":"não pode")
									+" Dirigir");
			
	}

}
