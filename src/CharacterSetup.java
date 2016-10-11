import java.util.Scanner;

public class CharacterSetup {
	public CharacterSetup(PlayerStats Player1){
	Scanner keyboard; // creates the new Scanner Object
	keyboard = new Scanner(System.in);
	String dynamicUserInput = null;
	
	System.out.println("Your friend, the shopkeepers son, offers you a backpack before your journey.");
	System.out.println("#What backpack do you choose? [Heavy] (0/30) or [Light] (0/15)?");
	double heavyBackpack = 30;
	double lightBackpack = 15;
	dynamicUserInput = keyboard.next();
	if (dynamicUserInput.toLowerCase().equals("heavy")) {
		Player1.setPlayerCarryLimit(heavyBackpack);//user input sets carry limit
		System.out.println("You chose heavy. You have " + Player1.getPlayerCarryLimit() + " capacity.");
		}
	else if (dynamicUserInput.toLowerCase().equals("light")) {
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
		System.out.println("#Would you like a " + Weapons.Sword.itemName + " that weighs " + Weapons.Sword.itemWeight + " pounds? [Yes] or [no].");
		dynamicUserInput = keyboard.next();
		if (dynamicUserInput.toLowerCase().equals("yes")) { // if user takes sword
			Player1.addItem(Weapons.Sword);
			System.out.println("You are " + Player1.getPlayerWeightStatusExact() + ", and have a sword that is " + Weapons.Sword.itemDescription + ".\n");
			} 
		else if ((dynamicUserInput.toLowerCase()).equals("no"))
			System.out.println("You are " + Player1.getPlayerWeightStatus() + ", and have no sword." + "\n");
	
		System.out.println("#Would you like a pile of heavy rocks? [Yes] or [no].");// rocks and situational items not working
		dynamicUserInput = keyboard.next();
		if (dynamicUserInput.toLowerCase().equals("yes")) { // if user takes sword
			double rockWeight = 20;
			String rockDescription = "a pile of heavy rocks";
			Player1.addItemSituational("heavy rocks", rockWeight, rockDescription, 0); // tells Player1 to gainItem with parameters
			System.out.println("You are " + Player1.getPlayerWeightStatusExact() + ", and have a pile a rocks. Genius." + "\n");
			} 
		else
			System.out.println("Smart. You are " + Player1.getPlayerWeightStatus() + ", and have no rocks." + "\n");

		System.out.println("#Would you like a " + Weapons.Spear.itemName + " that weighs " + Weapons.Spear.itemWeight + " pounds? [Yes] or [no].");
		dynamicUserInput = keyboard.next();
		if (dynamicUserInput.toLowerCase().equals("yes")) { // if user takes sword
			Player1.addItem(Weapons.Spear);
			System.out.println("You are " + Player1.getPlayerWeightStatusExact() + ", and have a Spear that is " + Weapons.Spear.itemDescription + ".\n");
			} 
		else if ((dynamicUserInput.toLowerCase()).equals("no"))
			System.out.println("You are " + Player1.getPlayerWeightStatus() + ", and have no "+ Weapons.Spear.itemName + "."+ "\n");
	
		
		System.out.println("#What would you like to drop?");
				dynamicUserInput = keyboard.next();
				if (dynamicUserInput.toLowerCase().equals("sword")){
					Player1.removeItem(Weapons.Sword);
					System.out.println("You dropped a " + Weapons.Sword.itemDescription + Weapons.Sword.itemName + " and have " + Player1.getPlayerWeightStatusExact());
				}
				else if (dynamicUserInput.toLowerCase().equals("rocks") || dynamicUserInput.toLowerCase().equals("rock")) { // rocks and situational items not working
					double rockWeight = 20;
					String rockDescription = "a pile of heavy rocks";
					//Player1.removeItem(Player1.addItemSituational("heavy rocks", rockWeight, rockDescription, 0)); 
					System.out.println("You dropped a " + Weapons.Spear.itemDescription +  Weapons.Spear.itemName + " and have " + Player1.getPlayerWeightStatusExact());
				}
			else 
				System.out.println("You didnt drop anything and have " + Player1.getPlayerWeightStatusExact());
			
		System.out.println("#Would you like to leave the shop now?");
		dynamicUserInput = keyboard.next();
		if (dynamicUserInput.toLowerCase().equals("yes")){ // if user leaves shop
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
	
}
}
