// runs the interactions with npc's, need to figure out how to make dialogue separate into unique and basic encounters.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class CombatEncounter {

	private final PlayerStats Player1;
	public CombatEncounter(PlayerStats Player1, NonPlayerCharacters NpcType, String NonPlayerCharacter, String Keyword, String Keyword2, boolean npcPeaceStatus){
		this.Player1 = Player1;
		Scanner keyboard; // creates the new Scanner Object
		keyboard = new Scanner(System.in);
		boolean Encounter = true;
		boolean Peaceful = npcPeaceStatus;
		boolean responseLoop = true;
		int Angercount = 0;
		String dynamicUserInput = "null";
		Random random = new Random();
		boolean reponseLoop = true;
		String sentence;
		if (Player1.getAliveStatus() == false){
		}
		else{
			System.out.println("A " + NpcType.getnonPlayerCharacterName() + " steps out in front of you.");
			System.out.println("#What would you like to do?");
			while (Encounter == true) { // encounter loop
				System.out.println("[ATTACK][FLEE][RESPOND]");
				dynamicUserInput = keyboard.next();
				if (dynamicUserInput.toLowerCase().equals("attack")) {
					if (Player1.getPlayerCurrentHealth() < 0) {
						System.out.println("You can not attack. You are bloodied.");
						Encounter = false;
						
					}
					else {
						boolean combat = true;
						while (combat == true){
							if (Player1.getPlayerCurrentHealth() < 1){
								combat = false;
								Player1.setAliveStatus(false);
								Encounter = false;
								break;
							}
							
							else if (NpcType.getnonPlayerCharacterHealth() <= 0){
								System.out.println("NPC is defeated.");
							}
							
							else {
								//delete, just for alpha
								System.out.println("You try to fight, but in your sign of weakness the " + NonPlayerCharacter + " murders you.");
								System.out.println("Just Kidding.");
								//delete
								int randomAttack = random.nextInt(2);
								if (randomAttack == 0)  {
									System.out.println("The " + NonPlayerCharacter + " barely misses you.");
									
								}
								else if (randomAttack == 1) {
									int randomNPCDamagePlaceholder = -random.nextInt((int)NpcType.getNonPlayerCharacterWeapon().itemDamage);
									Player1.setPlayerModHealth(randomNPCDamagePlaceholder);
									System.out.println("#The " + NonPlayerCharacter + " hits you with " + randomNPCDamagePlaceholder + " damage.");
									System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
									System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
									System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats
									
								}
								else
									System.out.println("error");
							
								System.out.println("What item do you strike back with?");
								String InventoryList = Arrays.toString(Player1.inventory.toArray());
								System.out.println(InventoryList);//gets player1.inventory, turn it into an array, and then strings it with custom to string method in weapons
								dynamicUserInput = keyboard.next();
								//(dynamicUserInput.toLowerCase().equals(Player1.inventory)
								if (dynamicUserInput.toLowerCase().equals("sword")){// user input = itemName of a Weapons inside arraylist "inventory"
									System.out.println("You attack with a " + Weapons.Sword.itemName);
									int damageDealtToNPC = -random.nextInt((int)Weapons.Sword.itemDamage);
									System.out.println("Dealing " + damageDealtToNPC + " damage.");
									NpcType.setNonPlayerCharacterHealth(damageDealtToNPC);
									System.out.println("The " + NpcType.getnonPlayerCharacterName() + " now has " + NpcType.getnonPlayerCharacterHealth() + "health.");

								}
								
								
	
								break;
								
								//System.out.println("#You strike back with what?" + Player1.inventory.get(Weapons.Sword.itemName));
								//String selection = "null";
								//	switch (selection) {
								//case (Player1.inventory.get(1) == dynamicUserInput):
								//	break;
								//}


							}//health positive loop
							//heath negative loop
						}//combat loop
					}
				} else if (dynamicUserInput.toLowerCase().equals("flee")) {
					int randomNPCDamagePlaceholder = (-random.nextInt((int)NpcType.getNonPlayerCharacterWeapon().itemDamage)/2);
					System.out.println("You run from the " + NonPlayerCharacter + " and lose " + randomNPCDamagePlaceholder + " health.");
					Player1.setPlayerModHealth(randomNPCDamagePlaceholder);
					System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
					System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
					System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats
					Encounter = false;
					break;
				} else if (dynamicUserInput.toLowerCase().equals("respond")) {
					System.out.println("You would type an organic statement or question here.");
					while (reponseLoop = true){
						System.out.println("#What would you like to say?");
						sentence = (keyboard.nextLine()).toLowerCase();
						if (sentence.matches(Keyword) && sentence.matches("what")){ // where, what is garibay, what is garibay gold
							System.out.println("'The Garibay Gold is from Garibay... Home of the Trolls.' I heard a human like you took it.");
						}
					}
					// for example What is Garibay? Where is Garibay?
				}
			}
		}
	}
}


