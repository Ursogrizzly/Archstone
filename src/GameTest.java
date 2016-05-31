import java.util.Scanner;
public class GameTest {
	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		PlayerStats Player1;
		Player1 = new PlayerStats();
		
		System.out.println("What is your Carry Limit?");
		Player1.setPlayerCarryLimit((double) keyboard.nextDouble());
		System.out.println("What is your Carry Weight?");
        Player1.setPlayerCarryWeight((double) keyboard.nextDouble());
        System.out.println("Player Weight Status: ");
        System.out.println(Player1.getPlayerWeightStaus() + "\n");
        
        Player1.setPlayerMaxHealth(100);
        Player1.setPlayerCurrentHealth(100);
        System.out.println("Your current health points are " + Player1.getPlayerCurrentHealth());
        System.out.println("of a max health points of " + Player1.getPlayerMaxHealth());
        System.out.println("Which is " + Player1.getPlayerHealthStatus()+ "%" + "\n");
       
        System.out.println("Pick up sword? True or False");
        boolean sword = keyboard.nextBoolean();
        double swordWeight = 12;
        if (sword = true)
        Player1.gainItem(swordWeight);
        System.out.println("You are " + Player1.getPlayerWeightStaus() + "\n");
        
		keyboard.close();
	}
}
