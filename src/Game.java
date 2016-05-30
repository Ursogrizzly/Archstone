/*
 * Program 
 */
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		int userWeight;
		System.out.print("What is your weight in kilograms?");
		userWeight = (int) keyboard.nextDouble();
		keyboard.close();
	}
}
