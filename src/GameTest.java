
import java.util.Scanner;
public class GameTest {
	public static void main(String[] args) {
		
		Scanner keyboard; //creates the new Scanner Object 
		keyboard = new Scanner(System.in);
		PlayerStats Player1; //creates a new player that will hold current and max carry weights and health
		Player1 = new PlayerStats(0,0);
		String dynamicUserInput = "null";
		/*
		 * Insert test code after this point
		 */
		
		CombatEncounter TrollEncounter; 
		TrollEncounter = new CombatEncounter("Troll", "Garibay", "human", true);//will eventually be Monsters.Troll
		
		
		/*
		 * To here
		 */
		System.out.println("\r");
		System.out.println("**************ARCHSTONE**************");
		System.out.println("****Welcome to the Land of Lork!*****");
		System.out.println("*************************************");
		System.out.println("Your friend, the shopkeepers son, offers you a backpack before your journey.");
		System.out.println("#What backpack do you choose? [Heavy] (0/30) or [Light] (0/15)?");
		double heavyBackpack = 30;
		double lightBackpack = 15;
		dynamicUserInput = keyboard.next();
		if (dynamicUserInput.equals("heavy") || dynamicUserInput.equals("Heavy")) {
			Player1.setPlayerCarryLimit(heavyBackpack);//user input sets carry limit
			System.out.println("You chose heavy. You have " + Player1.getPlayerCarryLimit() + " capacity.");
			}
		else if (dynamicUserInput.equals("light") || dynamicUserInput.equals("Light")) {
			Player1.setPlayerCarryLimit(lightBackpack);//user input sets carry limit
			System.out.println("You chose light. You have " + Player1.getPlayerCarryLimit() + " capacity.");
			}
		else 
			System.out.println("You friend doesnt understand, and you gain nothing. You fucked up.");
		
		
		System.out.println(" ");
		System.out.println("**You enter the store.**");
		System.out.println(" ");
		boolean inStore = true;
		int storeCount = 1;
		while (inStore == true) {
			System.out.print("The shopkeep ");
			if (storeCount >= 2)
				System.out.print("again ");
			System.out.println("show you through his limited wares. Its a small hill village, \nhe reminds you.");
			System.out.println("#Would you like a " + Weapons.Sword.itemName + " that weighs 14 pounds? [Yes] or [no].");
			dynamicUserInput = keyboard.next();
			if (dynamicUserInput.toLowerCase().equals("yes")) { // if user takes sword
				Player1.addItem(Weapons.Sword);
				System.out.println("You are " + Player1.getPlayerWeightStatusExact() + ", and have a sword that is " + Weapons.Sword.itemDescription + ".\n");
				} 
			else if ((dynamicUserInput.toLowerCase()).equals("no"))
				System.out.println("You are " + Player1.getPlayerWeightStatus() + ", and have no sword." + "\n");
		
			System.out.println("#Would you like a pile of heavy rocks? [Yes] or [no].");
			dynamicUserInput = keyboard.next();
			if (dynamicUserInput.toLowerCase().equals("yes")) { // if user takes sword
				double rockWeight = 20;
				Player1.gainItemSituational(rockWeight); // tells Player1 to gainItem with parameter swordWeight
				System.out.println("You are " + Player1.getPlayerWeightStatusExact() + ", and have a pile a rocks. Genius." + "\n");
				} 
			else
				System.out.println("Smart. You are " + Player1.getPlayerWeightStatus() + ", and have no rocks." + "\n");
			
			System.out.println("#Would you like to drop any items?");
			dynamicUserInput = keyboard.next();
				if ((dynamicUserInput.equals("sword")) || (dynamicUserInput.equals("Sword"))){
					Player1.removeItem(Weapons.Sword);
					System.out.println("You dropped a " + Weapons.Sword.itemName + " and have " + Player1.getPlayerWeightStatusExact());
					}
				else 
					System.out.println("You didnt drop anything and have " + Player1.getPlayerWeightStatusExact());
				
			System.out.println("#Would you like to leave the shop now?");
			String leaveShop = keyboard.next();
			if (leaveShop.equals("yes") || leaveShop.equals("Yes")){ // if user leaves shop
				if (Player1.getPlayerWeightStatus() == "Overweight"){
					System.out.println("Sorry you can't leave. You are " + Player1.getPlayerWeightStatus() + ". **Welcome to the void.");
					System.out.println("** WELCOME TO THE VOID. **");
					inStore = true;
					}
				else {
					inStore = false;
					break;
					}
				}
			else
				storeCount = storeCount +1;
		}
		System.out.println("** Your leave the store. **");
		System.out.println("A god comes down from space and decides your physique.");
		System.out.println("#Do you want to be a large burly [man] or a [pussy]?");
		dynamicUserInput = keyboard.next();
		if ((dynamicUserInput.toLowerCase().equals("man"))){
			System.out.println("You chose to be a MAN!!!");
			Player1.setPlayerMaxHealth(100); // sets max health
			Player1.setPlayerCurrentHealth(100); //set current health
			System.out.println("You have (" + Player1.getPlayerHealthStatus() + ") health.");
			}
		else {
			System.out.println("Either you fucked up or you deliberately chose to be a pussy. Why?");
			System.out.println("You have (50/50) health.");
			Player1.setPlayerMaxHealth(50); // sets max health
			Player1.setPlayerCurrentHealth(50); //set current health
			}
		System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
		System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
		System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats

		
		
	
		
		keyboard.close();
		System.out.println("***GAME OVER!***");

	}
}