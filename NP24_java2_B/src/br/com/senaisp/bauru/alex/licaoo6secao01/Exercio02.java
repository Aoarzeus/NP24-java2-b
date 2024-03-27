package br.com.senaisp.bauru.alex.licaoo6secao01;

import java.util.Scanner;

public class Exercio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIgite o numero que deseja a tabuada:");
		int num = sc.nextInt();
		for(int i=1;i<=12;i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		sc.close();
	}

}
