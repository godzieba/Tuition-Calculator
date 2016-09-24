package tuition;

import java.util.Scanner;

public class Tuition_Calculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your initial yearly tuition cost: ");
		double cost = input.nextDouble();
		System.out.print("Enter the yearly percentage increase in tuition cost (%): ");
		double increase = input.nextDouble() / 100.0;
		double total = 0;
		for (int i = 0; i < 4; i++) {
			total += cost * Math.pow(1.0 + increase, i);
		}
		System.out.printf("Your total tuition cost will be $%,.2f.", total); 
	}

}
