import java.util.Scanner;

public class CombatEncounter {

	public CombatEncounter(String NonPlayerCharacter, String Keyword, String userCombatChoice, boolean npcPeaceStatus) {
		Scanner keyboard; // creates the new Scanner Object
		keyboard = new Scanner(System.in);
		boolean Encounter = true;
		boolean Peaceful = npcPeaceStatus;
		while (Encounter = true) {
			switch (userCombatChoice) {
			case "Attack":
			case "attack":
			case "ATTACK":
				System.out.println("The " + NonPlayerCharacter + " is too strong and you die.");
				break;
			case "Flee":
			case "flee":
			case "FLEE":
				System.out.println("you try to run, but he murders you.");
				break;
			case "Respond":
			case "respond":
			case "RESPOND":
				while (Peaceful = true) {
					System.out.println("#What would you like to say?");
					String sentence = keyboard.nextLine();
					if (sentence.contains(Keyword) && ((sentence.contains("what")||(sentence.contains("What"))))
							|| (sentence.contains(Keyword) 
									&& ((sentence.contains("where")
											||(sentence.contains("Where"))))))
						System.out.println(
								"'The Garibay Gold, was stolen from Garibay, home of the Trolls." + "You must know!'");
					else if (sentence.contains(Keyword))
						System.out.println("'Yes, the Garibay Gold! I heard one of you humans took it.'");
					else {
						System.out.println("'I grow tired of such insolence. Prepare to die!'");
						Peaceful = false;
						break;
					}
					Peaceful = false;
					break;
				}
				Peaceful = false;
				break;
			}
			Peaceful = false;
			break;
		}
	}
}
