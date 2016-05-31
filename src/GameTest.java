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
        System.out.println(Player1.getPlayerWeightStaus());
		keyboard.close();
	}
}