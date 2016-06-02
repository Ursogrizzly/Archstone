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
		
		System.out.println("What is your Carry Limit?");
		Player1.setPlayerCarryLimit((double) keyboard.nextDouble());//user input sets carry limit
		System.out.println("What is your Carry Weight?");
        Player1.setPlayerCarryWeight((double) keyboard.nextDouble());//user input sets carry weight
        System.out.println("Player Weight Status: "); 
        System.out.println(Player1.getPlayerWeightStaus() + "\n"); //for testing purposes shows status in words
        
		System.out.println("Pick up sword with 12 weight? True or False");
		boolean sword = keyboard.nextBoolean();// for testing
		double swordWeight = 13; // sword weight for testing, not sure how to implement
		if (sword = true) { // if user takes sword
			Player1.gainItem(swordWeight); // tells Player1 to gainItem with parameter swordWeight
			System.out.println("You are " + Player1.getPlayerWeightStaus() + ", and have a sword." + "\n");
		} 
		else if (sword = false)
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