package br.com.senaisp.bauru.alex.licaoo8secaoexercico;

public class VetoresExemplo01 {

	public static void main(String[] args) {
		// criando um vertor de 50 de posição inteiras
		int[] idade = new int[50];
		String[] cores = { "azul", "amarelo", "vermelho", "verde" };
		cores[2] = "Laranja";
		// essa linha representa a mesma que a anterior
		String[] cor_n = new String[4];
		cor_n[0] = "Azul";
		cor_n[1] = "amarelo";
		cor_n[2] = "vermelho";
		cor_n[3] = "verde";
		//cor_n[4] + "Roxo"//ArraIndexOutofBounds
		// utilizando o for in
		for(String item : cores) {
			System.out.println(item);
			
		}
		

	}

}
