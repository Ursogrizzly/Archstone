import java.util.Scanner;
public class CombatEncounter {

	private final PlayerStats Player1;
	public CombatEncounter(PlayerStats Player1, String NonPlayerCharacter, String Keyword, String Keyword2, boolean npcPeaceStatus){
		this.Player1 = Player1;
		Scanner keyboard; // creates the new Scanner Object
		keyboard = new Scanner(System.in);
		boolean Encounter = true;
		boolean Peaceful = npcPeaceStatus;
		boolean responseLoop = true;
		int Angercount = 0;
		String dynamicUserInput = "null";

		System.out.println("A " + NonPlayerCharacter + " steps out in front of you.");
		System.out.println("'HALT! Hand over the [Garibay Gold] or pay the blood price.'");
		
		System.out.println("#What would you like to do?");
		while (Encounter == true) { // encounter loop
			System.out.println("[ATTACK][FLEE][RESPOND]");
			dynamicUserInput = keyboard.next();
			if (dynamicUserInput.toLowerCase().equals("attack")) {
				System.out.println(
						"You try to fight, but in your sign of weakness the " + NonPlayerCharacter + " murders you.");
				Encounter = false;
				break;
			} else if (dynamicUserInput.toLowerCase().equals("flee")) {
				System.out.println("You run from the " + NonPlayerCharacter + " and lose ");
				Player1.setPlayerModHealth(-2);
				System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
				System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
				System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats
				Encounter = false;
				break;
			} else if (dynamicUserInput.toLowerCase().equals("respond")) {
				System.out.println("You would type an organic statement or question here.");
				// for example What is Garibay? Where is Garibay?

			}
		}
	}
}


