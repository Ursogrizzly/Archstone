// is the main run, currently has character creation for weight capacity, sword, and health. 
import java.util.Scanner;
public class GameTest {
	public static void main(String[] args) {
		
		Scanner keyboard; //creates the new Scanner Object 
		keyboard = new Scanner(System.in);
		PlayerStats Player1 = new PlayerStats(0,0);
		String dynamicUserInput = "null";
		/*
		 * Insert test code after this point
		 */
		
		
		
		/*
		 * To here
		 */
		System.out.println("\r");
		System.out.println("**************ARCHSTONE**************");
		System.out.println("****Welcome to the Land of Lork!*****");
		System.out.println("*************************************");
		
		CharacterSetup CharacterSetup = new CharacterSetup(Player1);
		
		while (Player1.getAliveStatus() == true){
		
		System.out.println("\rA troll attacks you with a duskdagger."); 
		int randomDamagePlaceholder = -9;
		System.out.println("You lose " + randomDamagePlaceholder + " health."); 
		Player1.setPlayerModHealth(randomDamagePlaceholder);

		System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth()); //gets current health from instance of PlayerStats
		System.out.println("of a max health points of " + Player1.getPlayerMaxHealth()); //gets Max health from instance of PlayerStats
		System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n"); //gets health status ((Current/Max)*100 + a percentage sign) from instance of PlayerStats
		
		System.out.println("'HALT! Hand over the [Garibay Gold] or pay the blood price.'");
		CombatEncounter TrollEncounter; 
		TrollEncounter = new CombatEncounter(Player1, NonPlayerCharacters.MonstersSpearTroll, "Troll", "Garibay", "human", true);//will eventually be Monsters.Troll
		
	//	CombatEncounter OrcEncounter; 
		//TrollEncounter = new CombatEncounter(Player1, NonPlayerCharacters.MonstersSwordOrc, "Orc", "Garibay", "human", true);//will eventually be Monsters.Troll
	}
		keyboard.close();
		System.out.println("***GAME OVER!***");

	}
}