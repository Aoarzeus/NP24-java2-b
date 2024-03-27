package br.com.senaisp.bauru.alex.licaoo6secao01;

public class shape {
	public void criarRetangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// começar o código
			for (int lin = 1; lin <= alt; lin++) {
				for(int col=1;col<lar;col++) {	
					if(lin==1 || lin==alt||col==lar||col==1) {
						System.out.println("#");
					}else {
						System.out.println(" ");
					}
				}
				System.out.println();
			}
		}
	}

	public void criarTriagulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// aqui começa o codigo
			for (int lin = 1; lin <= alt; lin++) {
				for(int col=1;col<lar;col++) {	
					if(lin==1 || lin==alt || col==1 
							||col==lar && col<=lin ) {
						System.out.println("#");
					}else {
						System.out.println(" ");
					}
				}
				System.out.println();
			}
		} // fim do else

	}
}
