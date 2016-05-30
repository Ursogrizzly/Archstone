/*
 * Program 
 */
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		System.out.print("What is your CarryLimit?");
		double PlayerCarryLimit = (double) keyboard.nextDouble();
		System.out.print(PlayerCarryLimit);
		keyboard.close();
	}
}
