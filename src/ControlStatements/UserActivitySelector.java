package ControlStatements;

import java.util.Scanner;

public class UserActivitySelector {

	public static void main(String[] args) {
		
		System.out.println("Please enter action name : ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		switch (userInput) {
		case "login":
			System.out.println("Please enter your username");
			break;
		case "sign-up":
			System.out.println("Welcome!");
			break;
		case "terminate_program":
			System.out.println("Thank you, Good bye!");
			break;
		case "main_menu":
			System.out.println("Main menu");
			break;
		case "about_app":
			System.out.println("This app is created by me. Mili Nadine");
			break;
			default:
			System.out.println("Please enter one of this values: login, " 
					+ "sign-up , terminate_program, main_menu,  about_app  ");
			break;
		}
	}

}
