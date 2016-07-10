import java.util.Scanner;

public class CombatEncounter {

	public CombatEncounter(String NonPlayerCharacter, String Keyword, String Keyword2, boolean npcPeaceStatus) {
		Scanner keyboard; // creates the new Scanner Object
		keyboard = new Scanner(System.in);
		boolean Encounter = true;
		boolean Peaceful = npcPeaceStatus;
		boolean responseLoop = true;
		int Angercount = 0;
		String dynamicUserInput = "null";

		System.out.println("'HALT! Hand over the [Garibay Gold] or pay the blood price.'");
		System.out.println("#What would you like to do?");
		while (Encounter == true) { // encounter loop
			System.out.println("[ATTACK][FLEE][RESPOND]");
			dynamicUserInput = keyboard.next();
			switch (dynamicUserInput) {
			default:
				System.out.println("Invalid Command");
				break;
			case "Attack":
			case "attack":
			case "ATTACK":
				System.out.println("You try to fight, but in your sign of weakness the " + NonPlayerCharacter + " murders you.");
				Encounter = false;
				break;
			case "Flee":
			case "flee":
			case "FLEE":
				System.out.println("You run from the " + NonPlayerCharacter + " and lose " );//+ random health.
				
				Encounter = false;
				break;

			case "Respond":
			case "respond":
			case "RESPOND":
			//	while (responseLoop == true){
			//	while (Peaceful == true) {
					System.out.println("#What would you like to say?");
					dynamicUserInput = keyboard.next();
					System.out.println(dynamicUserInput);
					if (dynamicUserInput.contains(Keyword) && dynamicUserInput.contains("what"))
						System.out.println("'The Garibay Gold is from Garibay... Home of the Trolls.'");
					else 
						System.out.println("Parse Failure");

			//	}
			//	}

		}
	}
}
}
