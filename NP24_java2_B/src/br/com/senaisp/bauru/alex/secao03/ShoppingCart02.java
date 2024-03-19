package br.com.senaisp.bauru.alex.secao03;

public class ShoppingCart02 {
	public static void main(String[] args) {
		String custName = "Alex";
		String itemDesc = "Shirts";
		String message = custName + " wants to purchase a " + itemDesc;

		// Declare and initialize numeric fields: price, tax, quantity.
		double price = 5.00, tax = 0.05;
		int quantity = 4;

		// Declare and assign a calculated totalPrice
		double totalPrince = price * quantity * (1 + tax);

		// Modify message to include quantity
		message = custName + " wants to purchase a" + quantity + "Of the " + itemDesc;

		System.out.println(message);

		// Print another message with the total cost
		message = "Total : $" + totalPrince;
		System.out.println(message);
	}
}
