import java.util.Scanner;
public class GameTest {
	public static void main(String[] args) {
		Scanner keyboard; //creates the new Scanner Object 
		keyboard = new Scanner(System.in);
		PlayerStats Player1; //creates a new player that will hold current and max carry weights and health
		Player1 = new PlayerStats(0,0);
		/*
		 * Insert test code after this point
		 */
		
		
		
		/*
		 * To here
		 */
		System.out.println("Your friend, the shopkeepers son, offers you a backpack before your journey.");
		System.out.println("#What backpack do you choose? [Heavy] (0/30) or [Light] (0/15)?");
		double heavyBackpack = 30;
		double lightBackpack = 15;
		String playerChoiceBackpack = keyboard.next();
		if (playerChoiceBackpack.equals("heavy") || playerChoiceBackpack.equals("Heavy")) {
			Player1.setPlayerCarryLimit(heavyBackpack);//user input sets carry limit
			System.out.println("You chose heavy. You have 30 capacity.");
			}
		else if (playerChoiceBackpack.equals("light") || playerChoiceBackpack.equals("Light")) {
			Player1.setPlayerCarryLimit(lightBackpack);//user input sets carry limit
			System.out.println("You chose light. You have 15 capacity.");
			}
		else 
			System.out.println("You friend doesnt understand, and you gain nothing. You fucked up.");
		
		System.out.println(" ");
		System.out.println("**You enter the store.**");
		System.out.println(" ");
		boolean inStore = true;
		
		int storeCount = 0;
		while (inStore == true) {
			
			System.out.print("The shopkeep shows you ");
				if (storeCount > 1){
					System.out.print("again ");
					}
			System.out.println("through his limited wares. Its a small hill village, he reminds you.");
			System.out.println("#Would you like a sword that weighs 14 pounds? [Yes] or [no].");
			String swordTake = keyboard.next();// for testing
			if (swordTake.equals("yes") || swordTake.equals("Yes")) { // if user takes sword
				double swordWeight = 14;
				Player1.gainItem(swordWeight); // tells Player1 to gainItem with parameter swordWeight
				System.out.println("You are " + Player1.getPlayerWeightStaus() + ", and have a sword." + "\n");
				} 
			else 
				System.out.println("You are " + Player1.getPlayerWeightStaus() + ", and have no sword." + "\n");
		
			System.out.println("#Would you like a pile of heavy rocks? [Yes] or [no].");
			String rockTake = keyboard.next();// for testing
			if (rockTake.equals("yes") || rockTake.equals("Yes")) { // if user takes sword
				double rockWeight = 20;
				Player1.gainItem(rockWeight); // tells Player1 to gainItem with parameter swordWeight
				System.out.println("You are " + Player1.getPlayerWeightStaus() + ", and have a pile a rocks. Genius." + "\n");
				} 
			else //if (rockTake.equals("yes"))
				System.out.println("Smart. You are " + Player1.getPlayerWeightStaus() + ", and have no rocks." + "\n");
		
			System.out.println("#Would you like to leave the shop now?");
			String leaveShop = keyboard.next();
			if (leaveShop.equals("yes") || leaveShop.equals("Yes")){ // if user takes sword
				if (Player1.getPlayerWeightStaus() == "Overweight")
					System.out.println("Sorry you can't leave. You are overweight. Welcome to the void.");
				else 
					storeCount = storeCount++;
					break;
				}
		}
		System.out.println("A god comes down from space and decides your physique.");
		System.out.println("#Do you want to be a large burly [man] or a [pussy]?");
		String healthChoice = keyboard.next();
		if ((healthChoice == "man") || (healthChoice == "Man")){
			System.out.println("You chose to be a MAN!!!");
			System.out.println("You have (75/75) health.");
			Player1.setPlayerMaxHealth(100); // sets max health
			Player1.setPlayerCurrentHealth(100); //set current health
			}
		else {
			System.out.println("Either you fucked up or you deliberately chose to be a pussy. Why?");
			System.out.println("You have (75/75) health.");
			Player1.setPlayerMaxHealth(75); // sets max health
			Player1.setPlayerCurrentHealth(75); //set current health
			}
		System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
		System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
		System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats

		keyboard.close();
	}
}