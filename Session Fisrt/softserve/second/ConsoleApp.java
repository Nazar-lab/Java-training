package softserve.second;

import java.util.Scanner;

public class ConsoleApp {

	public static void main(String[] args) {

		
		Season current = Season.WINTER;
		
		String yesText = "yes";
		
				
		System.out.println("Do you like Java ? (yes/no)");

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		String modText = text.toLowerCase();
		
		switch (current) {
		case WINTER:
			System.out.println("This is GREAT !!");
			break;
		case SPRING:
			System.out.println("I am sad :(");
			break;
		default:
			System.out.println("Something went wrong.");
		}
				
	}

}
