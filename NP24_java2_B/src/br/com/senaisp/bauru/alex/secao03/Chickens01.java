package br.com.senaisp.bauru.alex.secao03;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        // eggsPerChicken = 5, chickenCount = 3 
    	int eggsPerChicken = 4, chickenCount = 8;
    	int totalEggs = 0;
    	// Na segunda ao meio dia, mr. Brown recolhe os ovos
    	totalEggs = totalEggs + chickenCount * eggsPerChicken;
    	// Na terça, mr. Ganha uma galinha e recolhe ovos
    	totalEggs+= ++chickenCount * eggsPerChicken;
    	//Na quarta, Ele perde metade das galinhas e depois recolhe os ovos 
    	totalEggs += chickenCount /2 * eggsPerChicken;
        System.out.println(totalEggs);
    }   
}
