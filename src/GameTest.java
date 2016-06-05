/**
 * Program 
 */
import java.util.Scanner;
public class GameTest {
	public static void main(String[] args) {
		Scanner keyboard; //creates the new Scanner Object 
		keyboard = new Scanner(System.in);
		
		PlayerStats Player1; //creates a new player that will hold current and max carry weights and health
		Player1 = new PlayerStats();
		
		System.out.println("What backpack do you choose? Heavy (0/30) or Light (0/15)? 1 for Heavy 2 for Light");
		double heavyBackpack = 30;
		double lightBackpack = 15;
		int playerChoiceBackpack = (int)keyboard.nextInt();
		if (playerChoiceBackpack == 1) {
			Player1.setPlayerCarryLimit(heavyBackpack);//user input sets carry limit
			System.out.println("You chose heavy. You have 30 capacity.");
		}
		else {
			Player1.setPlayerCarryLimit(lightBackpack);//user input sets carry limit
			System.out.println("You chose light. You have 15 capacity.");
		}
		System.out.println("What is your Carry Weight?");
        Player1.setPlayerCarryWeight((double) keyboard.nextDouble());//user input sets carry weight
        System.out.println("Player Weight Status: "); 
        System.out.println(Player1.getPlayerWeightStaus() + "\n"); //for testing purposes shows status in words
        
		System.out.println("Pick up sword with 12 weight? true or false");
		boolean swordTake = keyboard.nextBoolean();// for testing
		if (swordTake == true) { // if user takes sword
			double swordWeight = 13;
			Player1.gainItem(swordWeight); // tells Player1 to gainItem with parameter swordWeight
			System.out.println("You are " + Player1.getPlayerWeightStaus() + ", and have a sword." + "\n");
		} 
		else //if (sword = false)
			System.out.println("You are " + Player1.getPlayerWeightStaus() + ", and have no sword." + "\n");
		// weight status tests if current weight is over max weight
		keyboard.close();
	}
}

/*
Player1.setPlayerMaxHealth(100); // sets max health 
Player1.setPlayerCurrentHealth(100); //set current health 
System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats
*/