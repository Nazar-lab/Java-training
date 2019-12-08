package softserve.third;

import java.util.Scanner;

public class WeatherApp {

	public static void main(String[] args) {

		boolean isRun = true;
		String rain = "raining";
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Please enter current weather: (raining or sunny)");
			String inputMessage = scanner.nextLine();
			
			if (inputMessage.equals(rain)) {
				System.out.println("Better to take umbrella ...");
			} else {
				System.out.println("I am happy ! :)");
			}

			System.out.println();
			System.out.println("Do you want exit ? (y/n)");

			String exit = scanner.nextLine();
			
			if(exit.equals("y")) {
				isRun = false;
			}
			
		} while (isRun);
		
		scanner.close();
	}
}
